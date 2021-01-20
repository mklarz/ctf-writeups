# 3.3.1_euler_3

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/3_vanskelig/euler/finn_n/screenshots/a154454b37f14c5cb0e31bb606158a52.png" width="300">

## `h`

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

## Pattern
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

## Numbers
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

## 3.3.1_euler_3a
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

## 3.3.1_euler_3b
> h(n) = 217772874500023635365563422386019273512381236824318290514357322123165713825792, 636647330747919895136525940302294632068470331232708261863503953920000000000000

Here we use [factordb](http://factordb.com/index.php?query=217772874500023635365563422386019273512381236824318290514357322123165713825792) to provide us with the facotrization of `217772874500023635365563422386019273512381236824318290514357322123165713825792`: `2^100 * 3^99`.

Here we can consider primes and primes to a power, `P = 2^a * 3^b * 5^c...`, in this case we assume `n = 2^a * 3^b`, as every number has to be prime factored this way. 

> If the prime factorisation of n is given by n = p_1^e_1*...*p_n^e_n, then φ(n) = n *(1 - 1/p_1)* ... (1 - 1/p_n).
[Source](https://www.doc.ic.ac.uk/~mrh/330tutor/ch05s02.html)

Writing a quick bruteforce to find `a` and `b` we get the following:

#### [`brute.py`](./brute.py)

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

## 3.3.1_euler_3c
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

## 3.3.1_euler_3d
> d) h(n) = 200000000000001220000000000000120, 99999922911895859181617256996352
> (hint: n = p · q)

Here we are given an additional hint, that `n = p * q`, referring to [RSA](https://en.wikipedia.org/wiki/RSA_(cryptosystem)).

Having a smaller number in this challenge, we can attempt to find [the number of solutions of φ(x) = m](https://faculty.math.illinois.edu/~ford/wwwpapers/sierp.pdf) (or [here](http://www.numbertheory.org/php/carmichael.html).)

Instead making something ourselves, we use [Wolfram Alpha](https://www.wolframalpha.com/input/?i=phi%28n%29%3D200000000000001220000000000000120) to find possible `n`s in `ϕ(n) = 200000000000001220000000000000120`:

##### [`find_3d.py`](./find_3d.py)

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

## Reading materials
- [Euler's Totient Function and Euler's Theorem](https://www.doc.ic.ac.uk/~mrh/330tutor/ch05s02.html)
- [What is a good way to introduce Euler's totient function?](https://math.stackexchange.com/questions/3470094/what-is-a-good-way-to-introduce-eulers-totient-function) 
- [Solving φ(x)=n, where φ(x) is Euler's totient function - testing Carmichael's conjecture](http://www.numbertheory.org/php/carmichael.html)
- [Estimating the φ(n) of Upper/Lower Bound in its RSA Cryptosystem](https://eprint.iacr.org/2012/666.pdf)
- [The Euler Phi Function](https://www.whitman.edu/mathematics/higher_math_online/section03.08.html)
- [Complexity of Inverting the Euler Function](https://arxiv.org/pdf/math/0404116v3.pdf)
- [The number of solutions of φ(x) = m](https://faculty.math.illinois.edu/~ford/wwwpapers/sierp.pdf)
- [Finding the Inverse of Euler Totient Function](https://library.wolfram.com/infocenter/MathSource/696/)
