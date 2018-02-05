# Gordan Volarević
# Vježba 12, zadatak 1

import random

parni = 0
neparni = 0

n = int(input('Unesite n koji je veći od 0: '))
while n <= 0:
    print('Neispravno unesen n: ')
    n = int(input('Unesite n koji je veći od 0: '))

lista = []
for i in range(n):
    lista.append(random.randint(1, 100))
print(lista)

for j in range(len(lista)):
    if lista[j] % 2 == 0:
        parni += 1
    else:
        neparni += 1

print('U listi ima {} parni/h i {} neparni/h brojeva.'.format(parni, neparni))
