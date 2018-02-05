# Gordan Volarevič
# Vježba 10, zadatak 2

f_ulaz = open('ulaz2.txt', 'r')

s = f_ulaz.read()
izlaz = str()

for i in s:
    brojac = 0
    for j in s:
        if j == i:
            brojac += 1
    if brojac > 1:
        if not i in izlaz:
            izlaz += i

if len(izlaz) > 0:
    print(izlaz)
else:
    print('Niti jedan znak se ne ponavlja.')

f_ulaz.close()
