# Gordan Volarević
# Vjezba 7, zadatak 3

m = int(input('Unesite cijeli broj m: '))
n = int(input('Unesite cijeli broj n: '))

p = 1
if m < n:
    for i in range(m + 1, n):
        p *= i
    print(p)
else:
    print(m, 'je veći ili jednak', n)
