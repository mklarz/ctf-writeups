import re
import matplotlib.pyplot as plt
from mpl_toolkits.mplot3d import axes3d

with open("b8_g.txt") as f:
    # Quick dirty data cleaning
    data = f.read().replace("[ X, Y, Z ] =", "").replace("\n", "").replace(" ", "").strip()

# Quick messy data parsing
XYZ = []
for positions in data.split("]")[:-2]:
    positions = positions.replace("]", "").replace("[", "")
    XYZ.append([float(value) for value in positions.split(",") if value])
X, Y, Z = XYZ

fig = plt.figure()
ax = fig.add_subplot(111, projection='3d')
ax.scatter(X, Y, Z)
plt.show()
