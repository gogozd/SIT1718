# Gordan Volarević, 02.11.2017.
# Vježba 2, zadatak 7

x = float(input('Unesi prvi broj: '))
y = float(input('Unesi drugi broj: '))
z = float(input('Unesi treći broj: '))

print('x= {}, y= {}, z= {}'.format(x, y, z))

# x = z
# y = x
# z = y

x, y, z = z, x, y

print('x= {}, y= {}, z= {}'.format(x, y, z))
