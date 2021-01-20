# 3.2.2_minesweeper
We are supposed to create a [Minesweeper](https://en.wikipedia.org/wiki/Minesweeper_(video_game)) client that communicates with a server over [gRPC](https://grpc.io/).

The challenge is seperated into 3 levels, where we have to solve each level within x amount of seconds:
- **Easy**: 1 board, max 1 hour.
- **Medium**: 7 boards, max 10 seconds per board.
- **Hard**: 2 boards, max 5 seconds per board.

The [README](LESMEG.md) also recommends writing the client in a compiled language, due to the time limitations and optimizations vs. a scripted language.

Having never touched neither **gRPC** nor a Minesweeper board solver, I had to spend some time searching for various sources, see **Reading material** below.

My thoughts were to write the client in [Golang](https://golang.org/), as I have never touched it and want to learn it one day. After spending some time with Golang I decided to go back to Python, which I am very familiar with. 


## Client

```shell
$ python -m grpc_tools.protoc \
-I./ \
--python_out=. \
--grpc_python_out=. \
./minesweeper.proto
```

I started writing my own solver based on the research I did above, however halfway there I decided to go another route, and use [another solver](https://github.com/madewokherd/mines) as a helper to my solver.

You can find my solver [here](./client.py).

## Flags

To somewhat mitigate the slow and unoptimized solver, I decided to setup a port forward with `socat` (another option is [`shuttle`](https://github.com/sshuttle/sshuttle)) and run the solver locally.

```shell
$ python client.py localhost 1989
Starting client...
Fetching new game...
Starting level
<Game started=True, level_id=JXh1eG9KId73wn5F>
<Board row_count=5, column_count=5, mine_count=1>
0	-	-	-	-
-	-	-	-	-
-	-	-	-	-
-	-	-	-	-
-	-	-	-	-
</Board>
</Game>
Finding solution
Solved level ID JXh1eG9KId73wn5F
Got flag for level ID JXh1eG9KId73wn5F: 0b5408469e617df0e380b7364cdc1d27
--- snip ---
```
![92026d86ccd541bbb08bc89946504894.gif](./screenshots/92026d86ccd541bbb08bc89946504894.gif)

```shell
login@corax:~$ scoreboard 0b5408469e617df0e380b7364cdc1d27
Kategori: 3.2. Utfordringer middels
Oppgave:  3.2.2_minesweeper_easy
Svar:     0b5408469e617df0e380b7364cdc1d27

Gratulerer, korrekt svar!
```
```shell
login@corax:~$ scoreboard 5315005b2ad1fbfc2ceaa9a20d646383
Kategori: 3.2. Utfordringer middels
Oppgave:  3.2.2_minesweeper_medium
Svar:     5315005b2ad1fbfc2ceaa9a20d646383

Gratulerer, korrekt svar!
```
```shell
login@corax:~$ scoreboard f94148481b7e295ebfb74490838f5c57
Kategori: 3.2. Utfordringer middels
Oppgave:  3.2.2_minesweeper_hard
Svar:     f94148481b7e295ebfb74490838f5c57

Gratulerer, korrekt svar!
```

## Reading materials
- [Minesweeper strategy](http://www.minesweeper.info/wiki/Strategy)
- [Minesweeper and NP-completeness](http://web.mat.bham.ac.uk/R.W.Kaye/minesw/ordmsw.htm)
- [Write an AI to play Minesweeper](https://cs50.harvard.edu/ai/2020/projects/1/minesweeper/)
- [Solving minesweeper](https://danamlund.dk/minesweeper_solver/#org836c750)
