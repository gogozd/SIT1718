from turtle import *
import random

reset()

n= textinput('Unos', 'Unesite broj točaka i veličinu točke (odvojeno zarezom): ').split(',')

ht()
colormode(255)
velicina= int(n[1])
broj= int(n[0])

for i in range(broj):
    pu()
    x= random.randint(-300, +300)
    y= random.randint(-300, +300)
    goto(x, y)
    pd()
    r= random.randint(0, 255)
    g= random.randint(0, 255)
    b= random.randint(0, 255)
    color(r, g, b)
    dot(velicina)
    color('black')
    pu()
    sety(y - velicina - 10)
    pd()
    write('('+str(x)+','+str(y)+')', align='center')

mainloop()