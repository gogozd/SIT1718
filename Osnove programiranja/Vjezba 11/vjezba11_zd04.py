# Gordan Volarevic
# Vjezba 11, zadatak 4

from turtle import *

n = int(input('Unesite broj vrhova: '))

reset()

if n > 2:
    pu()
    goto(0, -200)
    pd()
    circle(200)
    circle(200, steps= n)
else:
    print('Krivi unos.')

mainloop()