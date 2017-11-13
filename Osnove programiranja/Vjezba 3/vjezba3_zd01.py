# Gordan Volarević, 09.11.2017.
# Vježba 3, zadatak 1

# varijable x i y predstavljaju uređeni par koordinata

x = float(input('Unesite koordinatu x: '))
y = float(input('Unesite koordinatu y: '))

if x == 0 and y == 0:
    print('Točka ({}, {}) se nalazi u ishodištu koordinatnog sustava.'.format(x, y))
elif x == 0:
    print('Točka ({}, {}) leži na y osi.'.format(x, y))
elif y == 0:
    print('Točka ({}, {}) leži na x osi.'.format(x, y))
elif x > 0 and y > 0:
    print('Točka ({}, {}) se nalazi u prvom kvadrantu.'.format(x, y))
elif x < 0 and y > 0:
    print('Točka ({}, {}) se nalazi u drugom kvadrantu.'.format(x, y))
elif x > 0 and y < 0:
    print('Točka ({}, {}) se nalazi u četvrtom kvadrantu.'.format(x, y))
else:
    print('Točka ({}, {}) se nalazi u trećem kvadrantu.'.format(x, y))
