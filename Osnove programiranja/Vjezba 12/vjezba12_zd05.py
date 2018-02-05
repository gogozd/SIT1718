from turtle import *
import random

reset()
speed(0)
colormode(255)

n = int(input('Unesi n (0<n<50): '))

pu()
goto(-150, -100)
pd()

for i in range(5):
    s = random.randint(0, 255)
    fillcolor(s, s, s)
    begin_fill()
    for j in range(3):
        fd(300 - n * i)
        lt(120)
    end_fill()

mainloop()
