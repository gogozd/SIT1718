from turtle import *

reset()

speed(0)
start= 300

r= 1.0

for i in range(10):
    pu()
    goto(0, -start)
    pd()
    r*= 0.95
    fillcolor(r, r, r)
    begin_fill()
    circle(start)
    end_fill()

    start *= 0.9

mainloop()