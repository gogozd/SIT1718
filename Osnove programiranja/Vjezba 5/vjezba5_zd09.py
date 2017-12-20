# Gordan Volarević
# Vjezba 5, zadatak 9

m = int(input('Unesi prvi broj: '))
n = int(input('Unesi drugi broj: '))

br = 0

if m < n:
    for i in range(m + 1, n):
        broj = [int(x) for x in str(i)]
        suma = sum(broj)
        if suma == 10:
            print(i)
            br += 1
    if br == 0:
        print('U rasponu od {} do {} nema brojeva kojima je zbroj znamenaka jednak 10.'.format(m ,n))

else:
    for i in range(n + 1, m):
        broj = [int(x) for x in str(i)]
        suma = sum(broj)
        if suma == 10:
            print(i)
            br += 1
    if br == 0:
        print('U rasponu od {} do {} nema brojeva kojima je zbroj znamenaka jednak 10.'.format(n ,m))
