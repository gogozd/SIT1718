# Gordan Volarević, 09.11.2017.
# Vježba 3, zadatak 9

from string import *

slovo = input('Unesite slovo: ')

if slovo in ascii_lowercase:
    print(slovo, 'je malo slovo.')
    print('Odgovarajući ASCII kod je:', ord(slovo))
elif slovo in ascii_uppercase:
    print(slovo, 'je veliko slovo.')
    print('Odgovarajući ASCII kod je:', ord(slovo))
else:
    print('Ovo nije slovo engleske abecede.')
