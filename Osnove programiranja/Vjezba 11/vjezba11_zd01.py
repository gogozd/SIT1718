# Gordan Volarevic
# Vjezba 11, zadatak 1

from turtle import *

reset()
pu()

goto(-200, -200)

pd()

vrhovi= 'ABCD'

for i in vrhovi:
    write(i, align= 'left', font=('Arial', 12, 'bold'))
    fd(400)
    lt(90)

goto(200, 200)
bk(400)
goto(200, -200)

mainloop()