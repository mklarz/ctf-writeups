from sage.all import *

ns = [
	200000000000001250000000000000183,
	200057307038170774697836995216983,
	201886792452832730975686574640791,
	400000000000002500000000000000366,
	400114614076341549395673990433966,
	403773584905665461951373149281582
]

for n in ns:
    a = euler_phi(n)
    b = euler_phi(n + 1)
    if a == 200000000000001220000000000000120 and b == 99999922911895859181617256996352:
        print("Found n:", n)