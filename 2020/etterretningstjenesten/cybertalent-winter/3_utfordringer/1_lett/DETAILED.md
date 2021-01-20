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

