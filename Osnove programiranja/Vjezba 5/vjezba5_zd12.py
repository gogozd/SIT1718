# Gordan Volarević
# Vježba 5, zadatak 12

lista = []
n = int(input('Unesite broj: '))
lista.append(n)

while n >= 0:
    n = int(input('Unesite broj: '))
    lista.append(n)
    if n < 0:
        break

suma = sum(lista)
br = len(lista)
arit = suma/br
print('Aritmetička sredina svih unesenih brojeva, uključujući i negativan broj, iznosi:', round(arit, 2))
