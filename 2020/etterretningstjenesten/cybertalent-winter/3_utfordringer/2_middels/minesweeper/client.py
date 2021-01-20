import re
import sys
import grpc
import time
import curses
import logging
import collections
from subprocess import Popen, PIPE

import minesweeper_pb2
import minesweeper_pb2_grpc

DEBUG = False

METHOD_FIRST = 0
METHOD_LAST = 1
METHOD = METHOD_LAST

# Setup logger
log = logging.getLogger(__name__)
log.setLevel(logging.DEBUG if DEBUG else logging.INFO)
log.propagate = False
formatter = logging.Formatter("%(message)s")
if DEBUG:
    ch = logging.StreamHandler()
else:
    ch = logging.FileHandler('minesweeper.log')
ch.setFormatter(formatter)
log.addHandler(ch)

if not DEBUG:
    stdscr = curses.initscr()

def has_adjacent_value(state, x, y, value):
    """
    a b c
    d 0 e
    f g h
    """
    adjacent_tiles = [
        state.get(y - 1, {}).get(x - 1, None), # a
        state.get(y - 1, {}).get(x, None), # b
        state.get(y - 1, {}).get(x + 1, None), # c
        state.get(y, {}).get(x - 1, None), # d
        state.get(y, {}).get(x + 1, None), # e
        state.get(y + 1, {}).get(x - 1, None), # f
        state.get(y + 1, {}).get(x, None), # g
        state.get(y + 1, {}).get(x + 1, None), # h
    ]
    return value in adjacent_tiles

def calculate_next_tile(old_state, new_state):
    # Check in new state if we have - adjentent to a change - -> 0
    last_empty = None
    last_tile = None
    for y, row in old_state.items():
        for x, value in row.items():
            old_tile = value
            new_tile = new_state[y][x]

            # Fallback guess
            if new_tile == "-":
                last_empty = (x, y)

            if old_tile != new_tile and old_tile == "-" and new_tile == "0":
                # We have a new tile that's not a mine
                # Check adjacent tiles to see if we have an unknown tile,
                # if so, pick this tile.
                if has_adjacent_value(new_state, x, y, "-"):
                    last_tile = (x, y)
                    if METHOD == METHOD_LAST:
                        return last_tile
    return last_tile if last_tile else last_empty


class WeHaveASolutionException(Exception):
    def __init__(self, mine_tiles):
        self.mine_tiles = mine_tiles


class Board:
    def __init__(self, row_count, column_count, mine_count):
        self.row_count = row_count
        self.column_count = column_count
        self.mine_count = mine_count
        self.state = collections.defaultdict(dict)

        # Set default state
        for y in range(self.row_count):
            for x in range(self.column_count):
                self.state[y][x] = "-"
        self.state[0][0] = "0"

    def get_encoded_board(self, state=None, delimiter=""):
        if not state:
            state = self.state
        board = ""
        for y, row in state.items():
            board += delimiter.join([str(value) for value in row.values()]) + "\n"
        return board

    def get_next_tile(self):
        # dirty hack to solve this
        command = [
            "python2",
            "mines/mines.py",
            "mines",
            str(self.column_count),
            str(self.row_count),
            str(self.mine_count),
        ]
        board = self.get_encoded_board()
        log.debug("Sending board to mines:")
        log.debug(board)

        if not DEBUG:
            stdscr.addstr(0, 0, str(self))
            stdscr.refresh()

        process = Popen(command, stdout=PIPE, stdin=PIPE, stderr=PIPE)
        stdout, stderr = process.communicate(input=board.encode())
        if stderr != b"":
            log.error("Got error after sending board:")
            log.error(stderr)
            exit(1)

        if b"This configuration has no solutions." in stdout:
            log.error("Board has no solutions... wat?")
            exit(1)

        result = stdout.decode().split("\n")[1:-1]
        encoded_board = result[:self.row_count]

        log.debug("Got new board:")
        log.debug("\n".join(encoded_board))
        new_state = collections.defaultdict(dict)
        mine_tiles = []

        # Create new board
        for y, row in enumerate(encoded_board):
            for x, value in enumerate(row):
                if value == "1":
                    mine_tiles.append((x, y))
                    value = "m"
                    self.state[y][x] = "m"
                elif value == "0" and self.state[y][x] == "-":
                    value = "0"
                else:
                    value = self.state[y][x]

                new_state[y][x] = value

        log.debug("Old board")
        log.debug(self.get_encoded_board(state=self.state))
        log.debug("Parsed board:")
        log.debug(self.get_encoded_board(state=new_state))

        if b"total possible arrangements: 1\n" in stdout:
            # We have a solution, dirty hack to return the result
            raise WeHaveASolutionException(mine_tiles)

        tile = calculate_next_tile(self.state, new_state)
        log.debug("Calculated next tile: {}".format(tile))
        # FIXME: there's a better way to solve this, use the data from the new state 
        # and update the current one with the information we have.
        #self.state = new_state
        return tile

    def set_tile(self, x, y, value):
        self.state[y][x] = value

    def __str__(self):
        s = "<Board "
        if self.row_count is None:
            s += "EMPTY"
        else:
            s += "row_count={}, column_count={}, mine_count={}".format(
                self.row_count,
                self.column_count,
                self.mine_count,
            )
            
        s += ">\n"
        s += self.get_encoded_board(delimiter="\t")
        s += "</Board>"
        return s

class Game:
    def __init__(self, stub, level_id):
        self.stub = stub
        self.level_id = level_id
        self.board = None
        self.has_started = False
        self.flags = []

    def __str__(self):
        s = "<Game started={}, level_id={}>\n".format(
            self.has_started,
            self.level_id,
        )
        s += str(self.board)
        s += "\n</Game>"
        return s

    def print_state(self):
        if not self.has_started:
            log.error("Game not started...")
            return
        log.info(self)

    def start(self):
        if not DEBUG:
            stdscr.clear()
        log.info("Starting level")
        response = self.stub.StartLevel(minesweeper_pb2.StartLevelRequest(levelID=self.level_id))
        self.has_started = True
        self.board = Board(
            row_count=response.Rows,
            column_count=response.Columns,
            mine_count=response.Mines,
        )
        self.print_state()

    def click(self, x, y):
        tile = "{},{}".format(x, y)
        log.debug("Clicking tile: {}".format(tile))
        response = self.stub.Click(minesweeper_pb2.ClickRequest(
            levelID=self.level_id,
            tile=minesweeper_pb2.Position(column=x, row=y),
        ))
        if response.error == "":
            self.board.set_tile(x, y, response.value)
            return True
        else:
            self.board.set_tile(x, y, "X")
            log.error(response.error)
            log.error("Error when clicking tile!")
            return False

    def submit_solution(self, mine_tiles):
        log.debug("Submitting solution with mines:")
        log.debug(mine_tiles)
        mines = []
        for mine_tile in mine_tiles:
            mines.append(minesweeper_pb2.Position(
                column=mine_tile[0],
                row=mine_tile[1],
            ))

        return self.stub.SolveLevel(minesweeper_pb2.SolveLevelRequest(
            levelID=self.level_id,
            mines=mines,
        ))

    def solve(self):
        mine_tiles = self.find_solution()
        response = self.submit_solution(mine_tiles)
        if response.error == "":
            log.info("Solved level ID {}".format(self.level_id))
            if response.flag != "":
                self.flags.append(response.flag)
                log.info("Got flag for level ID {}: {}".format(self.level_id, response.flag))
            return response.nextLevelID

        log.error("Got error whilst submitting solution")
        log.error(response.error)
        exit(1)

    def find_solution(self):
        log.info("Finding solution")

        while True:
            try:
                tile = self.board.get_next_tile()
                result = self.click(tile[0], tile[1])
                if not result:
                    log.error("Failed in solution loop!")
                    exit(1)
            except WeHaveASolutionException as e:
                return e.mine_tiles
            except Exception as e:
                self.print_state()
                log.error("Next tile: {}".format(tile))
                log.error("Exception whilst solving board")
                log.error(e)
                exit(1)

class Client:
    def __init__(self, host, port):
        self.host = host
        self.port = port
        self.current_game = None
        self.stub = None

    def new_game(self):
        log.info("Fetching new game...")
        response = self.stub.NewGame(minesweeper_pb2.NewGameRequest())
        level_id = response.levelID

        while True:
            start_time = time.time()
            start_cpu = time.process_time()
            self.current_game = Game(self.stub, level_id)
            self.current_game.start()
            level_id = self.current_game.solve()
            log.info("Took {} seconds to solve level (CPU time = {} seconds)".format(
                time.time() - start_time,
                time.process_time() - start_cpu,
            ))
            if not level_id:
                log.info("Done!")
                print()
                print("Found the following flags:")
                print("\n".join(self.current_game.flags))
                exit(0)
            log.info(self.current_game)

    def run(self):
        log.info("Starting client...")
        with grpc.insecure_channel("{}:{}".format(self.host, self.port)) as channel:
            self.stub = minesweeper_pb2_grpc.MinesweeperStub(channel)
            self.new_game()


if len(sys.argv) != 3:
    print("Usage: python3 solve.py <host> <port>")
    print("Example: python3 solve.py minesweeper 1989")
    exit(1)

print("Starting to solve, waiting for a connection... tail 'minesweeper.log' for updates")
client = Client(sys.argv[1], int(sys.argv[2]))
client.run()
