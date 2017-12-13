# Gordan Volarević
# Vjezba 6, zadatak 2

broj = int(input('Unesite prirodan broj veći od 0: '))
while broj < 0:
    print('Uneseni broj je manji od nule.')
    broj = int(input('Unesite prirodan broj veći od 0: '))

i = 1
br = 0
while br < broj:
    if i % 2 == 0 or i % 3 == 0:
        br += 1
        print(i)
        i += 1
    else:
        i += 1
