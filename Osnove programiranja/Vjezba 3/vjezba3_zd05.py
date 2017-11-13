# Gordan Volarević, 13.11.2017.
# Vježba 3, zadatak 5

import math

a = float(input('Unesite koeficijent a kvadratne jednadžbe: '))
b = float(input('Unesite koeficijent b kvadratne jednadžbe: '))
c = float(input('Unesite koeficijent c kvadratne jednadžbe: '))

while a == 0:
    print('Ovo nije kvadratna jednadžba.')
    a = float(input('Unesite koeficijent a kvadratne jednadžbe: '))
    b = float(input('Unesite koeficijent b kvadratne jednadžbe: '))
    c = float(input('Unesite koeficijent c kvadratne jednadžbe: '))

d = (b ** 2) - (4 * a * c)

if d > 0:
    rj_1 = (- b - math.sqrt(d) / (2 * a))
    rj_2 = (- b + math.sqrt(d) / (2 * a))
    print('Rješenja kvadratne jednadžbe', a, 'x^2 +', b, 'x +', c, '= 0 su: {:.2f} i {:.2f}'.format(rj_1, rj_2))
elif d == 0:
    rj = (- b / (2 * a))
    print('Rješenje kvadratne jednadžbe', a, 'x^2 +', b, 'x +', c, '= 0 je: {:.2f}'.format(rj))
else:
    print('Kvadratna jednadžba', a, 'x^2 +', b, 'x +', c, '= 0 nema realnih rješenja.')
