# Gordan Volarević
# Vjezba 6, zadatak 1

from math import sqrt

broj = float(input('Unesite decimalni broj a, koji je veći od 0: '))
while broj < 0:
    print('Uneseni broj je manji od nule.')
    broj = float(input('Unesite decimalni broj a, koji je veći od 0: '))

povrsina = (broj**2*sqrt(3))/4
print('Površina trokuta sa stranicom', broj,'iznosi', povrsina)
