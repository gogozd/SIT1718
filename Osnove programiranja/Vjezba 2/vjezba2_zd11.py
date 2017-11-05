# Gordan Volarević, 05.11.2017.
# Vježba 2, zadatak 11

import cmath

a = int(input('Unesi koeficijent a: '))
b = int(input('Unesi koeficijent b: '))
c = int(input('Unesi koeficijent c: '))

d = (b ** 2) - (4 * a * c)
rj_1 = (- b - cmath.sqrt(d) / (2 * a))
rj_2 = (- b + cmath.sqrt(d) / (2 * a))

print('Rješenja kvadratne jednadžbe', a, 'x^2 +', b, 'x +', c, '= 0 su: {:.2f} i {:.2f}'.format(rj_1, rj_2))
