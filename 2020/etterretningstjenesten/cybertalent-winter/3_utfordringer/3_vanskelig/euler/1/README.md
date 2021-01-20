# 3.3.1_euler_1

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/3_vanskelig/euler/euler/screenshots/598ffa7704b3426e82aca79ff2f28875.png" width="300">

Simple challenge where we are supposed to calculate each equation separately and use the results (ASCII charactercodes) to concat them into a string. I used Python, [SageMath](https://www.sagemath.org/), [SymPy](https://www.sympy.org/en/index.html) (for Eulers Polynomial), and some mathematical principles.

##### [`solve_1.py`](./solve_1.py)
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
$ python solve_1.py
Flag: Kunstkammer
```

```sh
login@corax:~$ scoreboard kunstkammer
Kategori: 3.3. Utfordringer vanskelig
Oppgave:  3.3.1_euler_1
Svar:     kunstkammer

Gratulerer, korrekt svar!
```
