# Gordan Volarević
# Vjezba 7, zadatak 5

niz = str(input('Unesite niz znakova: '))
lista = list(niz)
lista.sort()
while ',' in lista:
    lista.remove(',')
while '.' in lista:
    lista.remove('.')
print(lista)