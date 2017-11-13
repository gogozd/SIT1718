# Gordan Volarević, 09.11.2017.
# Vježba 3, zadatak 10

from string import *

# korisnik unosi 5 znakova
a, b, c, d, e = input('Unesite 5 znakova: ')

if a == e and b == d:
    print('Znakovi',a, b, c, d, e, 'čine palindrom.')
else:
    print('Znakovi', a, b, c, d, e, 'ne čine palindrom.')

print('Adresa varijable a je:', id(a))
print('Adresa varijable b je:', id(b))
print('Adresa varijable c je:', id(c))
print('Adresa varijable d je:', id(d))
print('Adresa varijable e je:', id(e))
