# 3.2.1_coordinate_g

![109188dae86c4f75a6402560b02a357f.png](./screenshots/109188dae86c4f75a6402560b02a357f.png)

From our initial checking, we know that the green layer contains embedded XYZ coordinates.

```shell
$ zsteg coordinate.png -e b8,g,lsb,xy > b8_g.txt
$ cat b8_g.txt | head
[ X, Y, Z ] =
[[ 4.46951449e+00, 2.56443868e+01, 4.82221609e+01, 2.75919604e+00,
   6.39779539e+00, 5.82768924e+00, 4.59417363e+01, 1.02990843e+01,
   9.02752721e+00, 2.95875663e+01, 5.21653404e+01, 7.40382644e+00,
   1.87583859e+01, 4.15926138e+00, 2.18268791e+01, 1.19171121e+01,
   4.43151990e+01, 7.97109610e+00, 2.98474193e+01, 4.33063315e+01,
   4.83478327e+01, 1.10814799e+01, 4.48824687e+01, 2.39702859e+01,
   3.95335509e+01, 5.43953649e+01, 1.31411056e+01, 3.44025955e+01,
   3.10266857e+01, 3.60681869e+01, 1.70946907e+01, 1.44202318e+01,
   2.36704385e+01, 2.66075870e+01, 4.00664992e+01, 1.56470618e+01,
```

Plotting this with `matplotlib` and its `scatter(X, Y, Z)` function, we get the following image.

`$ python solve_g.py`

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/2_middels/coordinate/g/screenshots/2bd636b36639402b84bc5c33d3fce03d.gif" width="300">

##### [`solve_g.py`](./solve_g.py)
```python
import re
import matplotlib.pyplot as plt
from mpl_toolkits.mplot3d import axes3d

# Quick messy data parsing
with open("b8_g.txt") as f:
    data = f.read().replace("[ X, Y, Z ] =", "").replace("\n", "").replace(" ", "").strip()
	XYZ = []
	for positions in data.split("]")[:-2]:
		positions = positions.replace("]", "").replace("[", "")
		XYZ.append([float(value) for value in positions.split(",") if value])

X, Y, Z = XYZ
fig = plt.figure()
ax = fig.add_subplot(111, projection='3d')
ax.scatter(X, Y, Z)
plt.show()
```

```shell
login@corax:~$ scoreboard focal point
Kategori: 3.2. Utfordringer middels
Oppgave:  3.2.1_coordinate_g
Svar:     focal point

Gratulerer, korrekt svar!
```
