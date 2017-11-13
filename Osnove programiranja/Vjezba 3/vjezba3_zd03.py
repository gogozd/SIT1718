# Gordan Volarević, 09.11.2017.
# Vježba 3, zadatak 3

a = int(input('Unesite prvi broj: '))
b = int(input('Unesite drugi broj: '))

operacija = input('Unesite računsku operaciju (+, -, *, /): ')

if operacija == '+':
    print('Zbroj je: ', a + b)
elif operacija == '-':
    print('Razlika je: ', a - b)
elif operacija == '*':
    print('Umnožak je: ', a * b)
elif operacija == '/':
    print('Kvocijent je: ', a / b)
else:
    print('Niste unijeli ispravnu računsku operaciju.')
