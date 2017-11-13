# Gordan Volarević, 13.11.2017.
# Vježba 3, zadatak 7

import math

argument = float(input('Unesite argument logaritma: '))
baza = float(input('Unesite bazu logaritma: '))

while argument < 0:
    print('Neispravno unesen argument.')
    argument = float(input('Unesite argument logaritma: '))
while baza < 0 or baza == 1:
    print('Neispravno unesena baza.')
    baza = float(input('Unesite bazu logaritma: '))
else:
    print('Vrijednost logaritma sa zadanom bazom i argumentom iznosi: ', math.log(argument, baza))
