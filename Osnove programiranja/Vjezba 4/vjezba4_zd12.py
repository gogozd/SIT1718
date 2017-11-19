# Gordan Volarević, 16.11.2017.
# Vjezba 4, zadatak 12

niz = input('Umesite niz znamenaka: ')

lista = list(niz)

suma = lista.count('0') * 0
suma += lista.count('1') * 1
suma += lista.count('2') * 2
suma += lista.count('3') * 3
suma += lista.count('4') * 4
suma += lista.count('5') * 5
suma += lista.count('6') * 6
suma += lista.count('7') * 7
suma += lista.count('8') * 8
suma += lista.count('9') * 9

aritm_sredina = suma / len(lista)

print('Aritmetička sredina je ', aritm_sredina)
