# Gordan Volarević, 16.11.2017.
# Vjezba 4, zadatak 7

n = int(input('Unesite cijeli broj veći od 1: '))

if n > 1:
    lista = list(range(1, n + 1))
    lista.reverse()
    print(lista)

    lista2 = list(range(2, 2 * (n + 1), 2)) # (2*n,0,-2)
    lista2.reverse()
    print(lista2)

else:
    print('Broj nije veći od 1.')
