# Gordan Volarevic
# Vjezba 11, zadatak 2

from turtle import *

def kvadrat(duljina):

    pu()
    goto(-duljina // 2, -duljina // 2)
    pd()
    for i in range(4):
        fd(duljina)
        lt(90)

    return

def main():

    reset()
    n = int(input('Unesite duljinu stranice: '))

    if n > 0:
        kvadrat(n)
    else:
        print('Pogrešan unos.')

    return

main()
mainloop()