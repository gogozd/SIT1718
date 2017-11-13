# Gordan Volarević, 09.11.2017.
# Vježba 3, zadatak 2

import math
# from math import sqrt

a = float(input('Unesi duljinu stranice a: '))
b = float(input('Unesi duljinu stranice b: '))
c = float(input('Unesi duljinu stranice c: '))

if a + b < c or b + c < a or a + c < b:
    print('Zadane stranice ne mogu sačinjavati trokut.')
    a = float(input('Unesi duljinu stranice a: '))
    b = float(input('Unesi duljinu stranice b: '))
    c = float(input('Unesi duljinu stranice c: '))
else:
    s = (a + b + c) / 2
    d = s * (s - a) * (s - b) * (s - c)
    p = math.sqrt(d)
    print('Površina trokuta je:', p)
