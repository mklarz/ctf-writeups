# 3.3. Utfordringer vanskelig ([Simple version](./README.md))

## [3.3.1_euler](./euler)

### [3.3.1_euler_1](./euler/1)

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/3_vanskelig/euler/1/screenshots/598ffa7704b3426e82aca79ff2f28875.png" width="300">

Simple challenge where we are supposed to calculate each equation separately and use the results (ASCII charactercodes) to concat them into a string. I used Python, [SageMath](https://www.sagemath.org/), [SymPy](https://www.sympy.org/en/index.html) (for Eulers Polynomial), and some mathematical principles.

##### [`solve_1.py`](./euler/1/solve_1.py)
```python
from sage.all import *
from sympy import * # for eulers polynomial/number

A = []

# binomial coefficient
A.append(binomial(8, 4) + binomial(5, 1))
# complex numbers
# |a + bi| = sqrt((a + bi)(a - bi)) = sqrt(a^2 + b^2)
A.append(sqrt(45**2 + 108**2))
# trigometric + binomial coeff
A.append(cos(pi/3) * binomial(12, 3))
# complex + euler polynomial/number
A.append(sqrt(105**2 + 36**2) + (4 * euler(0, 75)))
# logarithmic
A.append(2 * ln(e**58))
# phi
# e^{i\pi}: eulers identity/equation => e^{i\pi} + 1 = 0 => e^{i\pi} = -1
A.append(euler_phi(189) + -1)
# euler polynomial/number + trig
A.append(euler(2, 10) - 7 * cos(pi))
# trig
# e^{i\pi}: eulers identity/equation => e^{i\pi} + 1 = 0 => e^{i\pi} = -1
A.append((sin(pi / 6) * euler_phi(484)) + -1)
# euler polynomial/number + trig
# i * sin(pi) = 0, because sin(pi) = 0
A.append(euler(2, 11) + cos(pi) + 0)
# trig + phi + trig
A.append((sin(pi / 6) * euler_phi(303)) + sin(pi / 2))
# trig + phi
A.append(cos(pi / 3) * euler_phi(458))

print("Flag:", "".join([chr(int(a)) for a in A]))
```

```sh
$ python solve_euler.py
Flag: Kunstkammer
```

```sh
login@corax:~$ scoreboard kunstkammer
Kategori: 3.3. Utfordringer vanskelig
Oppgave:  3.3.1_euler_1
Svar:     kunstkammer

Gratulerer, korrekt svar!
```

### [3.3.1_euler_2](./euler/2)

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/3_vanskelig/euler/2/screenshots/3c76aac2e08946b8addd1aae3152c2a3.png" width="300">

We are given hints regarding [William Rowan](https://en.wikipedia.org/wiki/William_Rowan_Hamilton) and _Cycles_ (Sykler).

---

#### Theory
After doing some quick research (see **Reading materials** below), we find [Hamiltonian paths](https://en.wikipedia.org/wiki/Hamiltonian_path).
> In the mathematical field of graph theory, a Hamiltonian path (or traceable path) is a path in an undirected or directed graph that visits each vertex exactly once. A Hamiltonian cycle (or Hamiltonian circuit) is a Hamiltonian path that is a cycle. Determining whether such paths and cycles exist in graphs is the Hamiltonian path problem, which is **NP-complete.** 

And in addition:
> A Hamiltonian cycle, Hamiltonian circuit, vertex tour or graph cycle is a cycle that **visits each vertex exactly once**. A graph that contains a Hamiltonian cycle is called a Hamiltonian graph. 
---

#### Mapping
Mapping each node to their own ID makes it easier to process later on (I almost missed one node, this it has the ID of `99`).

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/3_vanskelig/euler/2/screenshots/9d48b3f334514b21ba9394580dc1fe84.png" width="300">

With the nodes and their edges mapped, we can now generate our own graphs:

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/3_vanskelig/euler/2/screenshots/654637bc280e4b7f9f377ac931fd3350.png" width="300">

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/3_vanskelig/euler/2/screenshots/8126a9299fe84b98bf8d4c1b477ef414.png" width="300">

---

#### Solution
Knowing that the problem is NP-Complete we can attempt to brute force the solution, and after some searching we find [this method](
https://gist.github.com/mikkelam/ab7966e7ab1c441f947b) and add it to the final code.

###### [solve_2.py](./euler/2/solve_2.py)

```python
import networkx as nx
import matplotlib.pyplot as plt

DEBUG = True

NODES = {
    1: { "label": "n", "edges": [2, 4] },
    2: { "label": " ", "edges": [1, 3, 8] },
    3: { "label": " ", "edges": [2, 40] },
    4: { "label": "r", "edges": [1, 5, 36, 40] },
    5: { "label": "e", "edges": [4, 6, 38] },
    6: { "label": "v", "edges": [5, 7] },
    7: { "label": " ", "edges": [6, 8, 40] },
    8: { "label": " ", "edges": [2, 7, 9, 38] },
    9: { "label": "r", "edges": [8, 10, 35] },
    10: { "label": "o", "edges": [9, 28, 30, 35] },
    11: { "label": " ", "edges": [12, 30] },
    12: { "label": "m", "edges": [11, 13] },
    13: { "label": "o", "edges": [12, 14, 17] },
    14: { "label": " ", "edges": [13, 15, 16, 17, 99] },
    15: { "label": "r", "edges": [14, 16, 19] },
    16: { "label": "g", "edges": [14, 15, 17, 18, 19, 24] },
    17: { "label": "v", "edges": [13, 14, 16, 20, 25] },
    18: { "label": "n", "edges": [16, 22, 99] },
    99: { "label": " ", "edges": [14, 18, 21] },
    19: { "label": "o", "edges": [15, 16, 36] },
    20: { "label": " ", "edges": [17, 21, 23] },
    21: { "label": " ", "edges": [20, 24, 25, 99] },
    22: { "label": "e", "edges": [18, 23] },
    23: { "label": "t", "edges": [20, 22, 24, 25] },
    24: { "label": "e", "edges": [16, 21, 23] },
    25: { "label": "i", "edges": [17, 21, 23] },
    26: { "label": "e", "edges": [27, 32, 35] },
    27: { "label": "e", "edges": [26, 28, 33, 34] },
    28: { "label": "f", "edges": [10, 27, 29] },
    29: { "label": " ", "edges": [28, 30, 31] },
    30: { "label": " ", "edges": [10, 11, 29, 31, 33, 35] },
    31: { "label": " ", "edges": [29, 30, 32] },
    32: { "label": "n", "edges": [26, 31, 33, 34] },
    33: { "label": "v", "edges": [27, 30, 32] },
    34: { "label": "r", "edges": [27, 32, 35] },
    35: { "label": "d", "edges": [9, 10, 26, 30, 34] },
    36: { "label": "n", "edges": [4, 19, 37] },
    37: { "label": " ", "edges": [36, 38] },
    38: { "label": " ", "edges": [5, 8, 37, 39] },
    39: { "label": "v", "edges": [38, 40] },
    40: { "label": "a", "edges": [3, 4, 7, 39] },
}

EDGES = set()

LABELS = {}

# From https://gist.github.com/mikkelam/ab7966e7ab1c441f947b
def hamilton(G):
    F = [(G,[list(G.nodes())[0]])]
    n = G.number_of_nodes()
    while F:
        graph,path = F.pop()
        confs = []
        neighbors = (node for node in graph.neighbors(path[-1]) 
                     if node != path[-1]) #exclude self loops
        for neighbor in neighbors:
            conf_p = path[:]
            conf_p.append(neighbor)
            conf_g = nx.Graph(graph)
            conf_g.remove_node(path[-1])
            confs.append((conf_g,conf_p))
        for g,p in confs:
            if len(p)==n:
                return p
            else:
                F.append((g,p))
    return None

# Loop through nodes and make sure they have valid edges
for node_id, node in NODES.items():
    edges = ""
    LABELS[node_id] = node["label"]
    for edge_node_id in node["edges"]:
        edge_node = NODES[edge_node_id]

        if node_id not in edge_node["edges"]:
            print(f"Node #{node_id} has Node #{edge_node_id} as an edge node, but Node #{edge_node_id} does not have Node #{node_id}")
            print(f"Node #{node_id}:")
            print(node)
            print(f"Node #{edge_node_id}:")
            print(edge_node)
            exit(1)

        edges += f"\t-> {edge_node_id}\n"

        # Let's add the edge to our global set, if it doesn't exist there yet
        # Very inefficient method to check if the edge exists or not
        for global_edge in EDGES:
            if (global_edge[0] == node_id and global_edge[1] == edge_node_id) \
            or (global_edge[1] == node_id and global_edge[0] == edge_node_id):
                break
        else:
            EDGES.add((node_id, edge_node_id))


    print(f"Node #{node_id} [label='{node['label']}'] has {len(node['edges'])} edges")
    if DEBUG:
        print(edges)

print(f"Found a total of {len(EDGES)} edges")

# Let's re-create the graph
G = nx.DiGraph()

for node in NODES:
    G.add_node(node)

for edge in EDGES:
    G.add_edge(edge[0], edge[1])


print("This might take a while....") # 706893343 iterations...
# path = hamilton(G)
path = [1, 4, 5, 6, 7, 8, 9, 10, 28, 29, 31, 32, 34, 35, 26, 27, 33, 30, 11, 12, 13, 14, 99, 18, 22, 23, 25, 17, 20, 21, 24, 16, 15, 19, 36, 37, 38, 39, 40, 3, 2]

# Reverse the path or we get:
# nrev  rof  nrdeev  mo  netiv  egron  va
path = path[::-1]


# Generate the flag
answer = ""
for node_id in path:
    answer += NODES[node_id]["label"]

print("Answer:", answer)

nx.draw(G, labels=LABELS, with_labels=True)
plt.show()
```

---

#### Flag
```sh
$ python solve_2.py
Answer:   av  norge  viten  om  veedrn  for  vern
```
The sentence does not seem correct, but after a quick Google search we find the Norwegian Armed Force's [yearly focus report **FOKUS 2020**](https://www.forsvaret.no/aktuelt-og-presse/publikasjoner/fokus/Fokus%202020.pdf/_/attachment/inline/639faaf2-7009-4056-9e0d-6dc5a6c5519b:1b228e374a207c8f79b1d8a166d902d7c0edd5e1/Fokus%202020.pdf) with the text `VITEN OM VERDEN FOR VERN AV NORGE` on the frontpage.

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/3_vanskelig/euler/2/screenshots/6379b9155b6a49ae835589b2b99ced2d.png" width="300">

```sh
login@corax:~$ scoreboard viten om verden for vern av norge
Kategori: 3.3. Utfordringer vanskelig
Oppgave:  3.3.1_euler_2
Svar:     viten om verden for vern av norge

Gratulerer, korrekt svar!
```

---

#### Reading materials
- [Icosian game](https://en.wikipedia.org/wiki/Icosian_game)
- [Hamiltonian path](https://en.wikipedia.org/wiki/Hamiltonian_path)
- [Hamiltonian Paths and Cycles](https://medium.com/stamatics-iit-kanpur/hamiltonian-paths-and-cycles-4f233bfbc53a)
- [Icosian calculus](https://en.wikipedia.org/wiki/Icosian_calculus)
- [Hamiltonian cycle for a large graph](https://en.wikipedia.org/wiki/Zero-knowledge_proof#Hamiltonian_cycle_for_a_large_graph)













### [3.3.1_euler_3](./euler/3)

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/3_vanskelig/euler/3/screenshots/a154454b37f14c5cb0e31bb606158a52.png" width="300">

#### `h`

We are provided with a binary (`h`), we see that it generates 2 numbers based on the input number.
```shell
$ ./h 1
0, 1
$ ./h 2
1, 2
$ ./h 3
2, 2
```

After attempting to enter invalid characters, we are presented with this output (this can also be found if we open the binary in Ghidra).

```shell
$ ./h -

usage: ./h [options] [one_number]

numbers starting with '0' are treated as octal,
numbers starting with '0x' are treated as hexadecimal
```

Trying the verbose flag (`-v`) we see that the binary uses [Miseve](https://github.com/radii/msieve), "A Library for Factoring Large Integers".
```shell
$ ./h -v 1


Msieve v. 1.54 (SVN unknown)
Sun Dec 20 19:54:17 2020
random seeds: 0031b72a 8498c607
factoring 1 (1 digits)
p1 factor: 1
0,

Msieve v. 1.54 (SVN unknown)
Sun Dec 20 19:54:17 2020
random seeds: 0031b72a 8498c607
factoring 2 (1 digits)
p1 factor: 2
elapsed time 00:00:00
1
```

> What Msieve Does
> ----
> There are plenty of algorithms for performing **integer factorization**.  The Msieve library implements most of them from scratch, and relies on optional external libraries for the rest of them. Trial division and Pollard Rho is used on all inputs; if the result is less than 25 digits in size, tiny custom routines do the factoring. For larger numbers, the code switches to the GMP-ECM library and runs the P-1, P+1 and ECM algorithms, expending a user-configurable amount of effort to do so. If these do not completely factor the input number, the library switches to the heavy artillery. Unless told otherwise, Msieve runs the self initializing quadratic sieve algorithm, and if this doesn't factor the input number then you've found a library problem. If you know what you're doing, Msieve also contains a complete implementation of the number field sieve, that has helped complete some of the largest public factorization efforts known.

Shortly put, it is a library that performs integer factorization with various algorithmns.

#### Pattern
Knowing that there is some form of factorization in play, we continue by looking at the pattern between the numbers. Notice when the input is **5**, how the last number (**2**) of the output (**4, 2**), corresponds with the first number (**2**) of the output (**2, 6**) when the input is **6** (5 + 1).

```shell
$ ./h 5
4, 2
$ ./h 6
2, 6
$ ./h 7
6, 4
$ ./h 8
4, 6
```

In other words, the binary `h` does the following: `h(n) = f(n), f(n + 1)`, where `n` is the input number and `f` is function that calculates the value.

#### Numbers
Now that we have a pattern, what do [the numbers](https://www.youtube.com/watch/vVPT0JT1dOw) themselves mean, what function is being used? We know that the general theme of these challenges is "Euler", and that we have some form of integer factorization. After some quick "Googling" we find [Euler's totient function](https://en.wikipedia.org/wiki/Euler%27s_totient_function) (also called  Euler's phi function).

> In number theory, Euler's totient function **counts the positive integers up to a given integer n that are relatively prime to n**. It is written using the Greek letter phi as φ(n) or ϕ(n), and may also be called Euler's phi function. **In other words, it is the number of integers k in the range 1 ≤ k ≤ n for which the greatest common divisor gcd(n, k) is equal to 1**. The integers k of this form are sometimes referred to as totatives of n.

Using this, we can test the same numbers that we passed into the `h` binary above, and see that they matches.
```shell
# $ ./h 5 
φ(5) = 4
φ(6) = 2
φ(7) = 6
φ(8) = 4
```
---

#### 3.3.1_euler_3a
> h(n) = 8, 8

This is easily solveable by pure bruteforcing, `n = 15` because:

```
φ(15) = 8
φ(15 + 1) = φ(16) = 8
h(15) = 8, 8
```

```
login@corax:~$ scoreboard 15
Kategori: 3.3. Utfordringer vanskelig
Oppgave:  3.3.1_euler_3a
Svar:     15

Gratulerer, korrekt svar!
```
---

#### 3.3.1_euler_3b
> h(n) = 217772874500023635365563422386019273512381236824318290514357322123165713825792, 636647330747919895136525940302294632068470331232708261863503953920000000000000

Here we use [factordb](http://factordb.com/index.php?query=217772874500023635365563422386019273512381236824318290514357322123165713825792) to provide us with the facotrization of `217772874500023635365563422386019273512381236824318290514357322123165713825792`: `2^100 * 3^99`.

Here we can consider primes and primes to a power, `P = 2^a * 3^b * 5^c...`, in this case we assume `n = 2^a * 3^b`, as every number has to be prime factored this way. 

> If the prime factorisation of n is given by n = p_1^e_1*...*p_n^e_n, then φ(n) = n *(1 - 1/p_1)* ... (1 - 1/p_n).
[Source](https://www.doc.ic.ac.uk/~mrh/330tutor/ch05s02.html)

Writing a quick bruteforce to find `a` and `b` we get the following:

##### [`brute.py`](./euler/3/brute.py)

```python
from sage.all import *;

number = 217772874500023635365563422386019273512381236824318290514357322123165713825792
for a in range(200):
	for b in range(200):
		n = ZZ(pow(2, a)) * ZZ(pow(3, b))
		result = euler_phi(n)
		if result == number:
			print("Found n: 2^{} * 3^{} = {}".format(a, b, n))
			exit(0)
```
```shell
$ python brute.py
Found n: 2^100 * 3^100 = 653318623500070906096690267158057820537143710472954871543071966369497141477376
```
Which is the same as `(2 * 3)^100`.

```
login@corax:~$ scoreboard 653318623500070906096690267158057820537143710472954871543071966369497141477376
Kategori: 3.3. Utfordringer vanskelig
Oppgave:  3.3.1_euler_3b
Svar:     653318623500070906096690267158057820537143710472954871543071966369497141477376

Gratulerer, korrekt svar!
```
---

#### 3.3.1_euler_3c
> h(n) = 9000000000000000000000000000000000000000000000000000000000, 3756326117848493706034345777213934145547380150921415411200

> **Example 3.8.3** If p is a prime, then ϕ(p) = p − 1, because 1, 2, …, p − 1 are all relatively prime to p, and 0 is not.
>
> **Theorem 3.8.4** If p is a prime and a is a positive integer, then
ϕ(p^a) = p^a − p^a−1
[Source](https://www.whitman.edu/mathematics/higher_math_online/section03.08.html)

Using **Example 3.8.3** we test for `p = (a + 1)`, where `a` is our first number (`900000000...`):
```
is_prime(9000000000000000000000000000000000000000000000000000000000 + 1) = true
ϕ(9000000000000000000000000000000000000000000000000000000000 + 1) = 9000000000000000000000000000000000000000000000000000000000
```

```
login@corax:~$ scoreboard 9000000000000000000000000000000000000000000000000000000001
Kategori: 3.3. Utfordringer vanskelig
Oppgave:  3.3.1_euler_3c
Svar:     9000000000000000000000000000000000000000000000000000000001

Gratulerer, korrekt svar!
```
---

#### 3.3.1_euler_3d
> d) h(n) = 200000000000001220000000000000120, 99999922911895859181617256996352
> (hint: n = p · q)

Here we are given an additional hint, that `n = p * q`, referring to [RSA](https://en.wikipedia.org/wiki/RSA_(cryptosystem)).

Having a smaller number in this challenge, we can attempt to find [the number of solutions of φ(x) = m](https://faculty.math.illinois.edu/~ford/wwwpapers/sierp.pdf) (or [here](http://www.numbertheory.org/php/carmichael.html).)

Instead making something ourselves, we use [Wolfram Alpha](https://www.wolframalpha.com/input/?i=phi%28n%29%3D200000000000001220000000000000120) to find possible `n`s in `ϕ(n) = 200000000000001220000000000000120`:


###### [`find_3d.py`](./euler/3/find_3d.py)

```python
ns = [
	200000000000001250000000000000183,
	200057307038170774697836995216983,
	201886792452832730975686574640791,
	400000000000002500000000000000366,
	400114614076341549395673990433966,
	403773584905665461951373149281582
]
# And finish by checking each `n`:
for n in ns:
    a = euler_phi(n)
    b = euler_phi(n + 1)
    if a == 200000000000001220000000000000120 and b == 99999922911895859181617256996352:
        print("Found n:", n)
```

`Found n: 200000000000001250000000000000183`

```
login@corax:~$ scoreboard 200000000000001250000000000000183
Kategori: 3.3. Utfordringer vanskelig
Oppgave:  3.3.1_euler_3d
Svar:     200000000000001250000000000000183

Gratulerer, korrekt svar!
```
---

### Reading materials
- [Euler's Totient Function and Euler's Theorem](https://www.doc.ic.ac.uk/~mrh/330tutor/ch05s02.html)
- [What is a good way to introduce Euler's totient function?](https://math.stackexchange.com/questions/3470094/what-is-a-good-way-to-introduce-eulers-totient-function) 
- [Solving φ(x)=n, where φ(x) is Euler's totient function - testing Carmichael's conjecture](http://www.numbertheory.org/php/carmichael.html)
- [Estimating the φ(n) of Upper/Lower Bound in its RSA Cryptosystem](https://eprint.iacr.org/2012/666.pdf)
- [The Euler Phi Function](https://www.whitman.edu/mathematics/higher_math_online/section03.08.html)
- [Complexity of Inverting the Euler Function](https://arxiv.org/pdf/math/0404116v3.pdf)
- [The number of solutions of φ(x) = m](https://faculty.math.illinois.edu/~ford/wwwpapers/sierp.pdf)
- [Finding the Inverse of Euler Totient Function](https://library.wolfram.com/infocenter/MathSource/696/)










## [3.3.2_rusty_reversing_hard](./rust_vanskelig)
We are yet again provided with a binary, but this time without `debug_info`.
```sh
$ file rust_hard
rust_hard: setuid ELF 64-bit LSB pie executable, x86-64, version 1 (SYSV), dynamically linked, BuildID[sha1]=54fec6fc3b4190b65ea4c4cb6ae7f91bf7c48cb2, stripped
```

Opening the binary in Ghidra also doesn't help, we continue with `gdb` and use `CTRL + C` when prompted for a password, and the continue with stepping until we find something interesting.

```sh
$ gdb -q rust_hard
gdb-peda$ r
Starting program: ./rust_hard
Enter password: ^C
```

By watching the registers and stack whilst stepping over functions, we see the the `RBX` register changing with various characters, and the we start seeing something appear in the stack: `sometimes_a_password_is_not_very_long_but_this_one_actually_is_supe`. 

```
[----------------------------------registers-----------------------------------]
RAX: 0x555556f7d823 --> 0x0
RBX: 0x72 ('r')
RCX: 0xc ('\x0c')
RDX: 0x555556f7b166 --> 0x7ad74c1d39e314bc
RSI: 0x555556f7b1c6 --> 0x14b820424b8664c9
RDI: 0x0
RBP: 0x555556f7b180 --> 0xe706955ab9544192
RSP: 0x7fffb4a551b0 --> 0x9 ('\t')
RIP: 0x7f97796745f9 (mov    BYTE PTR [rax+rdi*1],bl)
R8 : 0x2
R9 : 0x1701
R10: 0x29 (')')
R11: 0x346
R12: 0x7fffb4a552b8 --> 0x0
R13: 0x0
R14: 0x4f ('O')
R15: 0x555556f7b120 --> 0x826bfc2edc392ee1
EFLAGS: 0x206 (carry PARITY adjust zero sign trap INTERRUPT direction overflow)
[-------------------------------------code-------------------------------------]
   0x7f97796745ec:	nop    DWORD PTR [rax+0x0]
   0x7f97796745f0:	movzx  ebx,BYTE PTR [rdx+rdi*1-0x3]
   0x7f97796745f5:	xor    bl,BYTE PTR [rsi+rdi*1-0x3]
=> 0x7f97796745f9:	mov    BYTE PTR [rax+rdi*1],bl
   0x7f97796745fc:	movzx  ebx,BYTE PTR [rdx+rdi*1-0x2]
   0x7f9779674601:	xor    bl,BYTE PTR [rsi+rdi*1-0x2]
   0x7f9779674605:	mov    BYTE PTR [rax+rdi*1+0x1],bl
   0x7f9779674609:	movzx  ebx,BYTE PTR [rdx+rdi*1-0x1]
[------------------------------------stack-------------------------------------]
0000| 0x7fffb4a551b0 --> 0x9 ('\t')
0008| 0x7fffb4a551b8 --> 0x555556f7d7c0 ("PASSWORD\n\360ly\227\177")
0016| 0x7fffb4a551c0 --> 0x555556f7d7e0 ("sometimes_a_password_is_not_very_long_but_this_one_actually_is_supe")
0024| 0x7fffb4a551c8 --> 0x4f ('O')
0032| 0x7fffb4a551d0 --> 0x0
0040| 0x7fffb4a551d8 --> 0x8
0048| 0x7fffb4a551e0 --> 0x7fffb4a55280 --> 0x555556f7d7c0 ("PASSWORD\n\360ly\227\177")
0056| 0x7fffb4a551e8 --> 0x1
[------------------------------------------------------------------------------]
Legend: code, data, rodata, value
0x00007f97796745f9 in ?? ()
```

```sh
[----------------------------------registers-----------------------------------]
RAX: 0x555556f7d823 --> 0x72 ('r')
RBX: 0x72 ('r')
--- snip ---
[------------------------------------stack-------------------------------------]
0008| 0x7fffb4a551b8 --> 0x555556f7d7c0 ("PASSWORD\n\360ly\227\177")
0016| 0x7fffb4a551c0 --> 0x555556f7d7e0 ("sometimes_a_password_is_not_very_long_but_this_one_actually_is_super")
--- snip ---
```

And finially giving us:

```sh
0016| 0x7fffb4a551c0 --> 0x555556f7d7e0 ("sometimes_a_password_is_not_very_long_but_this_one_actually_is_super_duper_long")

```

```sh
login@corax:~/3_utfordringer/3_vanskelig/rust_vanskelig$ ./rust_hard
Enter password: sometimes_a_password_is_not_very_long_but_this_one_actually_is_super_duper_long
Flag: etj{i_did_not_know_rust_did_dynamic_dispatch_with_such_weird_vftable_placement}
```

```sh
login@corax:~/3_utfordringer/3_vanskelig/rust_vanskelig$ scoreboard etj{i_did_not_know_rust_did_dynamic_dispatch_with_such_weird_vftable_placement}
Kategori: 3.3. Utfordringer vanskelig
Oppgave:  3.3.2_rusty_reversing_hard
Svar:     i_did_not_know_rust_did_dynamic_dispatch_with_such_weird_vftable_placement

Gratulerer, korrekt svar!
```

