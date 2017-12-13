# Gordan Volarević
# Vjezba 7, zadatak 2

k = int(input('Unesi prirodni broj k koji je veći od 0: '))

i = 2
j = 0
while j < k:
    if i % 3 == 0 or i % 5 == 0:
        j += 1
        print(i, end='')
        i += 2
    else:
        i += 2
