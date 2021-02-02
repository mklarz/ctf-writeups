# 3.1. Utfordringer lett ([Simple version](./README.md))

## [3.1.1_clmystery](./clmystery)
clmystery is a open-source "A command-line murder mystery". This was basically identical to last years challenge, we can therefore use the same technique. Copy the files from `corax` to our local machine, and clone the `clmystery` source. Finially compare the directories and find the differences. 

```sh
$ scp -r cybertalent:~/3_utfordringer/1_lett/clmystery/mystery mystery2
$ git clone https://github.com/veltman/clmystery myster2
$ diff --no-dereference mystery/vehicles mystery2/vehicles
31830c31830
< Owner: Jeremy Bowers
---
> Owner: Victor Sidney
```

```sh
login@corax:~$ scoreboard Victor Sidney
Kategori: 3.1. Utfordringer lett
Oppgave:  3.1.1_clmystery
Svar:     Victor Sidney

Gratulerer, korrekt svar!
```


## [3.1.2_fibonacci](./fibonacci)
> # Fibonacci
>
>Klarer du å regne ut fibonacci raskt nok?
>
>
>Adresse: tcp://fibonacci:7600

Connecting to the server we are provided with randomly generated data (`fib(176)`), asking for the answer of `fib(176)`.

```sh
login@corax:~$ nc fibonacci 7600
fib(176)
pwn
Sorry, that was wrong
```

Calculating fib(x) can potentially be very slow, I therefore decided to download a static list ([`fib.txt`](./fib.txt)) of fibonacci numbers and use that to "calculate" the fibonacci numbers.
```sh
$ head -n 5 fib.txt
0 	0
1 	1
2 	1
3 	2
4 	3
```

#### [`solve.py`](./fibonacci/solve.py)
```python
import re
from pwn import *

fib = {}
with open("fib.txt") as f:
    for line in f.read().splitlines():
        s = line.split("\t")
        fib[s[0].strip()] = s[1].strip()

io = remote("fibonacci", 7600)

print("Starting...")
while True:
    s = io.readlineS()
    r = re.search(r"fib\((.*?)\)", s)
    if not r:
        print(s)
        print(io.readlineS())
        print(io.readlineS())
        print(io.readlineS())
        io.close()
        exit(0)
    n = r.group(1).strip()
    f = fib[n]
    io.sendline(f)
```

```sh
$ python3 solve.py
Starting...
╭──────╮
│ FLAG ╰───────────────────────────╮
│ ce954ec88c3bef5ecf088239541c6b3f │
╰──────────────────────────────────╯
```

```sh
login@corax:~/scripts/fib$ scoreboard ce954ec88c3bef5ecf088239541c6b3f
Kategori: 3.1. Utfordringer lett
Oppgave:  3.1.2_fibonacci
Svar:     ce954ec88c3bef5ecf088239541c6b3f

Gratulerer, korrekt svar!
```


## [3.1.3_math](./math)
### 3.1.3_math_1
```
# Matematikk
 
Jeg har laget en matematikk-tjeneste.
Vil du prøve å logge inn på systemet?

Adresse: http://math:7070

PS: Det er 2(TO) flagg i denne oppgaven
```

Simple challenge, curl the provided URL, find a link to the flag.
`login@corax:~$ curl math:7070`
```html
<p><a href="/flag_1">Flag 1</a></p><p><a href="/flag_2">Flag 2</a></p>
```
`login@corax:~$ curl math:7070/flag_1`
```html
 ──────╮
│ FLAG ╰───────────────────────────╮
│ 1f3191fabf49137b4a1c8e41d2cb3730 │
╰──────────────────────────────────╯
```

```sh
login@corax:~$ scoreboard 1f3191fabf49137b4a1c8e41d2cb3730
Kategori: 3.1. Utfordringer lett
Oppgave:  3.1.3_math_1
Svar:     1f3191fabf49137b4a1c8e41d2cb3730

Gratulerer, korrekt svar!
```

### 3.1.3_math_2

Continuing with flag #2 we find that it requires a specific user agent set.

`login@corax:~$ curl math:7070/flag_2`

> wrong user agent - must be Math Calculator (Python 3)

After setting the `User-Agent` header, we have a cookie set and are redirected to another location (`/challenge`).
```shell
login@corax:~$ curl math:7070/flag_2 -H "User-Agent: Math Calculator (Python 3)" -v

< Location: http://math:7070/challenge
--- snip ---
< Set-Cookie: user_id="!ACLXo5IfaJKH1CaFqyrYiw==?gASVIAAAAAAAAACMB3VzZXJfaWSUjBAyZDA3ZGQ5MTFiNDdhZDlmlIaULg=="
```

Executing the new request with a cookie set we are provided with a math equation, that we can easily solve with a dirty python script that `eval`s the equation (**_never do this_**). It is also important that we keep the same session as we have to solve multiple equations. After letting the script run for a few seconds, we are provided with the flag #2.
```shell
login@corax:~$ curl math:7070/challenge -H "User-Agent: Math Calculator (Python 3)" -H 'user_id="!ACLXo5IfaJKH1CaFqyrYiw==?gASVIAAAAAAAAACMB3VzZXJfaWSUjBAyZDA3ZGQ5MTFiNDdhZDlmlIaULg=='
33555-807979
```

#### [`solve.py`](./math/solve.py)
```python
import requests

URL = "http://math:7070/challenge"
HEADERS = {"User-agent": "Math Calculator (Python 3)"}
s = requests.Session()

r = s.get(URL, headers=HEADERS)
next_equation = r.content.decode()
while True:
    print("eq =", next_equation)
    answer = str(eval(next_equation))
    print("answer =", answer)
    r = s.post(URL, answer, headers=HEADERS)
    next_equation = r.content.decode()
```

```sh
$ python solve.py
╭──────╮
│ FLAG ╰───────────────────────────╮
│ 12ea10a72a5c3828a1f3141bd9e5030b │
╰──────────────────────────────────╯
```

```sh
login@corax:~/scripts/1_3_math$ scoreboard 12ea10a72a5c3828a1f3141bd9e5030b
Kategori: 3.1. Utfordringer lett
Oppgave:  3.1.3_math_2
Svar:     12ea10a72a5c3828a1f3141bd9e5030b

Gratulerer, korrekt svar!
```



## [3.1.4_rusty_reversing_easy](./rust_lett)
```
# Rust-tilbakevikling - lett

Jeg er litt Rust(en) når det kommer til mine evner innen tilbakevikling. Kan du hjelpe meg?

   Fil: rust_easy
```

We are provided with a binary, and notice that it has be compiled with `debug_info` (debug symbols).
```sh
$ file rust_easy
rust_easy: setuid ELF 64-bit LSB pie executable, x86-64, version 1 (SYSV), dynamically linked, BuildID[sha1]=802d5f1d534235f77ae80115570e6efc5260f107, with debug_info, not stripped
```
Opening the binary with [Ghidra](https://ghidra-sre.org/) and searching for the string after `flag` we find the following strings:

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/rust_lett/screenshots/b211a6b1a5c647848b5ceeef31187c7c.png" width="200">

We decompile the function where the string is used (`main`) and take note of the `Storage` class.

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/rust_lett/screenshots/47b0f0f0c16a473680a1609914a65b5d.png" width="200">

```c
Storage::new
Storage::check_password
Storage::get_flag
```

Checking the `Storage::new` method we find the start of the password: `this_super_secret_password_`

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/rust_lett/screenshots/b071ac6e58ed43b485955f1929179dcb.png" width="200">

Continuing in the same function we see the following variables and put them togheter into one hex string: `32292e342d251e2f2e351e23241e263424323220232d24`
```c
  *puVar1 = 0x32;
  puVar1[1] = 0x29;
  puVar1[2] = 0x2e;
  puVar1[3] = 0x34;
  puVar1[4] = 0x2d;
  puVar1[5] = 0x25;
  puVar1[6] = 0x1e;
  puVar1[7] = 0x2f;
  puVar1[8] = 0x2e;
  puVar1[9] = 0x35;
  puVar1[10] = 0x1e;
  puVar1[0xb] = 0x23;
  puVar1[0xc] = 0x24;
  puVar1[0xd] = 0x1e;
  puVar1[0xe] = 0x26;
  puVar1[0xf] = 0x34;
  puVar1[0x10] = 0x24;
  puVar1[0x11] = 0x32;
  puVar1[0x12] = 0x32;
  puVar1[0x13] = 0x20;
  puVar1[0x14] = 0x23;
  puVar1[0x15] = 0x2d;
  puVar1[0x16] = 0x24;
```

By [XORing](https://gchq.github.io/CyberChef/#recipe=From_Hex('Auto')XOR(%7B'option':'Hex','string':'41'%7D,'Standard',false)&input=MzIyOTJlMzQyZDI1MWUyZjJlMzUxZTIzMjQxZTI2MzQyNDMyMzIyMDIzMmQyNA) the data with `0x41` (`A`) we get the following string: `should_not_be_guessable`. Adding the two strings togheter we get our password and input it into the binary we finally get the flag.

```sh
login@corax:~/3_utfordringer/1_lett/rust_lett$ ./rust_easy
Enter password: this_super_secret_password_should_not_be_guessable
Flag: etj{rusty_binaries_are_not_thaaat_difficult_right}
```

```sh
login@corax:~/3_utfordringer/1_lett/rust_lett$ scoreboard etj{rusty_binaries_are_not_thaaat_difficult_right}
Kategori: 3.1. Utfordringer lett
Oppgave:  3.1.4_rusty_reversing_easy
Svar:     rusty_binaries_are_not_thaaat_difficult_right

Gratulerer, korrekt svar!
```





## [3.1.8_punchcard](./punchcard)

**Note:** I solved this challenge after the CTF.

From the Norwegian Armed Force's page about the [Cybertalent Program](https://www.forsvaret.no/jobb/talentprogram-cyberoperasjoner) we find the following image, and notice the dots on the horse, which look like old [punch cards](https://en.wikipedia.org/wiki/Punched_card).

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/punchcard/screenshots/aa8ba51c503042c48257d4944ec668c6.jpg" width="200">

---

### Highlighting
After performing some image manipulation as an attempt to highlight the boxes even more, we notice very similar boxes to the left of the horse.

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/punchcard/screenshots/0d0635a3f3c84b739bd8c1e1753b3f3a.png" width="200">


<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/punchcard/screenshots/8059be00ce994061a3591b59280878b1.png" width="200">

---

### Pattern
There seemed to be a repeating pattern, and when drawing columns and rows we see that there are 12 rows, and repeating pattern every 11 column.

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/punchcard/screenshots/2c25ea0e7af34f8c8ed560f06feba606.png" width="200">

---

### Big
Attempting to do the same to the boxes on the horse, we see that the same pattern exists there, albeit the last rows are offset a bit.

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/punchcard/screenshots/d09997bbf7de419a821c012168acd412.png" width="200">

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/punchcard/screenshots/d77edc61b2c2434c91d02077d4555db1.png" width="200">

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/punchcard/screenshots/78d904ffcc7c46feb99a87fc1b1e7890.png" width="200">

---

### Grid
Further processing gives us the following grid.

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/punchcard/screenshots/02690c59e3a04ad19386517575d35b09.png" width="100">

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/punchcard/screenshots/02690c59e3a04ad19386517575d35b09.png" width="100">

|   	    | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11	|
|--------|---|---|---|---|---|---|---|---|---|----|----|
| **12** | X |   | X | X | X | X |   |   | X | X  | X 	|
| **11** |   | X	|   |   | X |   | X | X | X |    | X 	|
| **0**  |   | X	| X | X |   |   |   | X |   | X  |   	|
| **1**  |   |  	|   |   |   |   |   |   |   |    |   	|
| **2**  |   |  	|   |   |   |   |   |   |   |    |   	|
| **3**  |   |  	|   |   |   |   |   |   |   |    |   	|
| **4**  |   | X	|   |   |   |   | X | X |   |    |   	|
| **5**  |   |  	|   |   | X |   |   |   | X |    | X  |
| **6**  |   |  	|   |   |   |   |   |   |   |    |   	|
| **7**  |   |  	| X |   |   |   |   |   |   |    |   	|
| **8** 	| X |  	|   |   |   |   |   |   |   |    |   	|
| **9** 	|   |  	|   | X |   |   |   |   |   | X  |   	|

### IBM-EBCDIC

We find that this pattern matches the IBM-EBCDIC punch cards.

> Before ASCII became the standard, many of the internal codes used to represent characters within computers were strongly influenced by the punched card code for characters. One of the most famous of such codes, and one that has persisted in use the longest, is, of course, EBCDIC (Extended Binary-Coded Decimal Interchange Code). The diagram below illustrates the relationship between EBCDIC and punched card code:
>
> <img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/punchcard/screenshots/diagram.gif" width="200">
> 
> [Source](http://quadibloc.com/comp/cardint.htm)

Now map the columns and rows to 0s and 1s, depending on where it's punched (X).

|   	    | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11	|
|--------|---|---|---|---|---|---|---|---|---|----|----|
| **12** | 1 | 0 | 1 | 1 | 1 | 1 | 0 | 0 | 1 | 1  | 1 	|
| **11** | 0 | 1	| 0 | 0 | 1 | 0 | 1 | 1 | 1 | 0  | 1 	|
| **0**  | 0 | 1	| 1 | 1 | 0 | 0 | 0 | 1 | 0 | 1  | 0 	|
| **1**  | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0  | 0 	|
| **2**  | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0  | 0 	|
| **3**  | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0  | 0 	|
| **4**  | 0 | 0	| 0 | 0 | 0 | 0 | 1 | 1 | 0 | 0  | 0 	|
| **5**  | 0 | 0 | 0 | 0 | 1 | 0 | 0 | 0 | 1 | 0  | 1  |
| **6**  | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0  | 0 	|
| **7**  | 0 | 0 | 1 | 0 | 0 | 0 | 0 | 0 | 0 | 0  | 0 	|
| **8** 	| 1 | 0	| 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0  | 0 	|
| **9** 	| 0 | 0 | 0 | 1 | 0 | 0 | 0 | 0 | 0 | 1  | 0 	|

Extracting each column into a list gives us the following:
```
1.  100000000010
2.  011000100000
3.  101000000100
4.  101000000001
5.  110000010000
6.  100000000000
7.  010000100000
8.  011000100000
9.  110000010000
10. 101000000001
11. 110000010000
```

Adding them togheter gives us this string: `100000000010011000100000101000000100101000000001110000010000100000000000010000100000011000100000110000010000101000000001110000010000`

It should now be easy to map the column and rows to their characters, we therefore write a parser that does this for us and with that solve the challenge. We also see that the generated card matches the grid we found in the horse.

```sh
$ python parse_ibm-ebcdic.py code --generate-card 100000000010011000100000101000000100101000000001110000010000100000000000010000100000011000100000110000010000101000000001110000010000
Output: Hugin&Munin
```


<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/punchcard/screenshots/solve.png" width="200">


[Huginn and Muninn](https://en.wikipedia.org/wiki/Huginn_and_Muninn) are two ravens that brought information to the most powerful Norse god, Odin. They can see every little movement on the earth, they hear every sound, and then they report back to Odin. That's the reason we can find the ravens in the Coat of Arms for the Norwegian Intelligence Service (Etteretningstjenesten).


<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/punchcard/screenshots/etterretningstjenesten-logo.png" width="200">

You can also find them on the [frontpage of the CTF](https://ctf.cybertalent.no/).

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/punchcard/screenshots/pixelravn.gif" width="200">


```
login@corax:~$ scoreboard 'Hugin&Munin'
Kategori: 3.1. Utfordringer lett
Oppgave:  3.1.8_punchcard
Svar:     Hugin&Munin

Gratulerer, korrekt svar!
```

#### More fun
The script also allows us the create our own cards.

```sh
$ python parse_ibm-ebcdic.py --generate-card text 'Hello, thi$ is IBM-EBCDIC punch c@rd from [2021]'

100000000010101000010000110001000000110001000000110000001000001001000010000000000000011001000000101000000010101000000001010001000010000000000000101000000001011010000000000000000000100000000001100010000000010000100000010000000000100000010000100010000000100001000000100000100000100000000001100001000000000000000000110000000100011000100000110000010000101001000000101000000010000000000000101001000000000000100010110000000001101000100000000000000000101000001000110000000001110000001000110000100000000000000000100010000010000010000000001000000000000010000000000100000000001010000010
```

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/punchcard/screenshots/hello_2021.png" width="200">

```
$ python parse_ibm-ebcdic.py --generate-card text klarz
Output: 110010000000110001000000101100000000110000000001011000000001


$ python parse_ibm-ebcdic.py code 110010000000110001000000101100000000110000000001011000000001
Output: klarz
```

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/punchcard/screenshots/klarz.png" width="200">


###### [`parse_ibm-ebcdic.py`](./punchcard/parse_ibm-ebcdic.py)
```python
import argparse

# Simple parser for IBM-EBCDIC punchcards (missing a bunch of characters)
# See more:
# https://homepage.divms.uiowa.edu/~jones/cards/codes.html
# http://quadibloc.com/comp/cardint.htm
# http://www.kloth.net/services/cardpunch.php
# https://en.wikipedia.org/wiki/EBCDIC
# https://www.ibm.com/support/knowledgecenter/zosbasics/com.ibm.zos.zappldev/zappldev_14.htm

PARSER_MODE_TEXT = 1
PARSER_MODE_CODE = 2
PARSER_MODES = {
    "text": PARSER_MODE_TEXT,
    "code": PARSER_MODE_CODE,
}

"""
We just need the headers (12, 11, [1]0) here
as their "body" (1-9) are identical, we will generate
the body below.
"""
BLOCKS = {
# 12 11 10 1  2  3  4  5  6  7  8  9
#  12110
    "101": ["a", "b", "c", "d", "e", "f", "g", "h", "i"],
    "110": ["j", "k", "l", "m", "n", "o", "p", "q", "r"],
    "011": ["s", "t", "u", "v", "w", "x", "y", "z"],
    "100": ["A", "B", "C", "D", "E", "F", "G", "H", "I"],
    "010": ["J", "K", "L", "M", "N", "O", "P", "Q", "R"],
    "001": ["S", "T", "U", "V", "W", "X", "Y", "Z"],
}
EMPTY = ["0", "0", "0", "0", "0", "0", "0", "0", "0"]

# Digits have 10 columns instead of the standard 9 blocks (and 8 blocks)
DIGITS = {
    "001000000000": "0",
    "000100000000": "1",
    "000010000000": "2",
    "000001000000": "3",
    "000000100000": "4",
    "000000010000": "5",
    "000000001000": "6",
    "000000000100": "7",
    "000000000010": "8",
    "000000000001": "9",
}

# IBM-EBCDIC has support for symbols, let's add them
SPECIAL_SYMBOLS = {
# 12 11 10 1  2  3  4  5  6  7  8  9
#  12110123456789
    "000000000000": " ",
    "011100000000": "~",
    "010010000010": "!",
    "000000000110": "\"",
    "010001000010": "#",
    "010001000010": "$",
    "000000100010": "%",
    "100000000000": "&",
    "000000010010": "'",
    "100000010010": "(",
    "010000010010": ")",
    "010000100010": "*",
    "100000001010": "+",
    "001001000010": ",",
    "010000000000": "-",
    "100001000010": ".",
    "001100000000": "/",
    "000010000010": ":",
    "010000001010": ";",
    "100000100010": "<",
    "000000001010": "=",
    "001000001010": ">",
    "001000000110": "?",
    "000000100010": "@",
    "100010000010": "[",
    "010000000110": "\\",
    "001010000010": "]",
    "100000000110": "^",
    "001000010010": "_",
    "100000100001": "",
    "100000010001": "	",
}

IGNORE_UKNOWN = "▮"

# From https://stackoverflow.com/a/312464
def chunks(lst, n):
    """Yield successive n-sized chunks from lst."""
    for i in range(0, len(lst), n):
        yield lst[i:i + n]

# Initialize the code mapping with the symbols and digits
code_mapping = {**SPECIAL_SYMBOLS.copy(), **DIGITS.copy()}

# Invert the mapping so we get character => code mapping instead
character_mapping = {v: k for k, v in code_mapping.items()}

# Generate the generic mapping for the blocks we created above
#         1    2    3    4    5    6    7    8    9
for header, characters in BLOCKS.items():
    # Some blocks have a body that has 8 characters, we need to offset them.
    # For example: "stuvwxyz" and "STUVWXYZ"
    if len(characters) == 8:
        offset = 1
    else:
        offset = 0

    for i, c in enumerate(characters):
        code = EMPTY.copy()
        code[i + offset] = "1"
        code = header + "".join(code)
        if code in code_mapping:
            print(f"ERROR: Code already exists in mapping: {code} (Mapped char: '{mapping[code]}'. Current char: {c})")
            exit(1)
        code_mapping[code] = c
        character_mapping[c] = code

parser = argparse.ArgumentParser(description="Parse IBM-EBCDIC punchcard code or generate code from text, and in addition, create punchcards based on input data.")
parser.add_argument(
    "mode",
    help="parser mode. options: 'text' or 'code'"
)
parser.add_argument(
    "input",
    help="input data, either the text or code"
)
parser.add_argument(
    "--generate-card", "-gc", default=False, action="store_true",
    help="generate a punch card based on input data"
)
parser.add_argument(
    "--ignore-unknowns", "-iu", default=False, action="store_true",
    help="ignore unknown characters"
)
args = parser.parse_args()

mode = args.mode.lower()
if mode not in PARSER_MODES:
    print(f"ERROR: {mode} is not a valid mode. Available modes:")
    for mode in PARSER_MODES:
        print(f"- {mode}")
    exit(1)
mode_id = PARSER_MODES[mode]

user_input = args.input

output = ""
characters = ""
codes = []
if mode_id == PARSER_MODE_TEXT:
    for c in user_input:
        if c not in character_mapping:
            if not args.ignore_unknowns:
                print(f"ERROR: The character '{c}' does not exist in the character mapping, add the --ignore-unknown flag to ignore it")
                exit(1)
            else:
                output += IGNORE_UKNOWN 
                characters += IGNORE_UNKNOWN
        else:
            code = character_mapping[c]
            codes.append(code)
            characters += c
            output += code
elif mode_id == PARSER_MODE_CODE:
    # Codes need to have 12 rows, let's check that the input matches
    if len(user_input) % 12 != 0:
        print("ERROR: IBM-EBCDIC needs 12 rows per character, the input does not have a matching number of rows")
        print("Example (5 rows): 110010000000110001000000101100000000110000000001011000000001")
        print("Output: klarz")
        exit(1)
    elif any(c not in "01" for c in user_input):
        print("ERROR: Parser only accepts '1' and '0' as input for code. 1=punched, 0=not punched")
        print("Example (5 rows): 110010000000110001000000101100000000110000000001011000000001")
        print("Output: klarz")
        exit(1)

    codes = list(chunks(user_input, 12))
    for code in codes:
        if code not in code_mapping:
            if not args.ignore_unknowns:
                print(f"ERROR: '{code}' does not exist in the code mapping, add the --ignore-unknown flag to ignore it")
                exit(1)
            else:
                output += IGNORE_UKNOWN 
                characters += IGNORE_UNKNOWN
        else:
            c = code_mapping[code]
            output += c
            characters += c

print("Output:", output)

if args.generate_card:
    if len(characters) > 80:
        print(f"WARNING: The card only supports 80 columns, and will therefore cut out the following characters: '{characters[80:]}'")


    from PIL import Image, ImageFont, ImageDraw
    PUNCH_SIZE = (5, 12)
    PUNCH_PADDING_X = 7
    PUNCH_PADDING_Y = 20
    PUNCH_START_X = 15
    PUNCH_START_Y = 20
    PUNCH_START_POS = (PUNCH_START_X, PUNCH_START_Y)
    pos = PUNCH_START_POS

    PUNCH = Image.new("RGBA", PUNCH_SIZE, (255, 255, 255, 0))
    FONT_SIZE = 9
    FONT = ImageFont.truetype("IBMPlexMono-Regular.ttf", FONT_SIZE)
    FONT_Y = 3

    image = Image.open("./card_template.png").convert("RGBA")

    for i, code in enumerate(codes):
        c = characters[i]
        draw = ImageDraw.Draw(image)
        draw.text((pos[0], FONT_Y), c, font=FONT, fill="black")
        for b in code:
            if b == "1":
                image.paste(PUNCH, pos)
            pos = (pos[0], pos[1] + PUNCH_PADDING_Y)
        pos = (pos[0] + PUNCH_PADDING_X, PUNCH_START_Y)
    image.show()
    image.save("card.png")
```


### Reading materials
- https://homepage.divms.uiowa.edu/~jones/cards/codes.html
- http://quadibloc.com/comp/cardint.htm
- http://www.kloth.net/services/cardpunch.php
- https://en.wikipedia.org/wiki/EBCDIC
- https://www.ibm.com/support/knowledgecenter/zosbasics/com.ibm.zos.zappldev/zappldev_14.htm

### Failed attempts

In a last-ditch effort, we color each cell, based on if they have a box or not, and finially remove the rows with no boxes.

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/punchcard/screenshots/138dcbfeaddf43a3ab86729189d37b0e.png" width="200">



## 3.1.9_secret

**Note:** I solved this "challenge" after the CTF.

From the Norwegian Armed Force's page about the [Cybertalent Program](https://www.forsvaret.no/jobb/talentprogram-cyberoperasjoner) we find the following image, that contains some shell commands. We see that a file was moved to /dev/shm, and find the secret there.

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/rust_lett/screenshots/aa8ba51c503042c48257d4944ec668c6.jpg" width="200">

```
login@corax:~$ ls -altr /dev/shm/
total 4
drwxr-xr-x 5 root root 340 Jan 21 15:45 ..
-rw-r--r-- 1 root root  33 Jan 21 15:45 .secret
drwxrwxrwt 2 root root  60 Jan 21 15:45 .
login@corax:~$ cat /dev/shm/.secret
7238876002abdfd7f091fa8978cbadee
```

```
login@corax:~$ scoreboard 7238876002abdfd7f091fa8978cbadee
Kategori: 3.1. Utfordringer lett
Oppgave:  3.1.9_secret
Svar:     7238876002abdfd7f091fa8978cbadee

Gratulerer, korrekt svar!
```
