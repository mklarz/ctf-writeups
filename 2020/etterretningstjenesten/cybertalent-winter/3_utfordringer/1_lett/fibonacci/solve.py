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
