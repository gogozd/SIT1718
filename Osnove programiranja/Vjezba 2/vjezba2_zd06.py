# Gordan Volarević, 02.11.2017.
# Vježba 2,zadatak 6

a = float(input('Unesi prvi broj: '))
b = float(input('Unesi drugi broj: '))

kolicnik = a / b

print('Količnik brojeva {} i {} je {:.5f}'.format(a, b, kolicnik))
print('Količnik brojeva {} i {} je {:.2f}'.format(a, b, kolicnik))
print('Količnik brojeva {} i {} je {:.0f}'.format(a, b, kolicnik))
