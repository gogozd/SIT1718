# Gordan Volarevic
# Vjezba 11, zadatak 3

from turtle import *

n = int(input('Unesite broj vrhova: '))

reset()

if n > 2:
    for i in range(n):
        write(str(i + 1), align= 'right', font= ('Arial', 15, 'bold'))
        fd(100)
        lt(360/n)
else:
    print('Krivi unos.')

mainloop()