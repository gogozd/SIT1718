# Gordan Volarević
# Vježba 5, zadatak 11

niz = str(input('Unesite niz znakova: '))

for i in niz:
    print(ord(i) + 1)

for i in niz:
    print(chr(ord(i) + 1), end ='')
