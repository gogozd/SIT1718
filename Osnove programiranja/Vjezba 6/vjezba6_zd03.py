# Gordan Volarević
# Vjezba 6, zadatak 3

m = int(input('Unesite prvi prirodni broj veći od 0: '))
n = int(input('Unesite drugi prirodni broj veći od 0: '))

i = 1
lista = []
if m <= n:
    for i in range(2, m + 1):
        if m % i == 0 and n % i == 0:
            lista.append(i)
            i += 1
else:
    for i in range(2, n + 1):
        if m % i == 0 and n % i == 0:
            lista.append(i)
            i += 1
print(min(lista))