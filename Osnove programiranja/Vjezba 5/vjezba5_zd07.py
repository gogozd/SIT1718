# Gordan Volarević
# Vjezba 5, zadatak 7

n = int(input('Unesite dvoznamenkasti broj: '))

while 99 < n < 10:
    print('Uneseni broj nije dvoznamenkast.')
    n = int(input('Unesite dvoznamenkasti broj: '))


for i in range(10, n +1):
    if i % 2 != 0:
        j = i // 10
        if j % 2 != 0:
            print(i, end=', ')
