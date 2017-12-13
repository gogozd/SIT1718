# Gordan Volarević
# Vjezba 6, zadatak 5

niz = str(input('Unesite niz znakova: '))

lista = list(niz)
print(lista)
lista.pop()
lista.append('+')
lista.sort()
print(''.join(str(x) for x in lista))