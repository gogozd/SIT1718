# Gordan Volarević
# Vježba 5, zadatak 2

n = int(input('Unesite prirodni broj veći od 0: '))
i = 0
a = 0

if n<1:
    print('Unos mora biti veći od 0.')
else:
    for i in range(1, n+1):
        if n%i == 0:
            print(i)
            i += 1
            a += 1
    if n == 1:
        print('Broj 1 nije prost ni složen.')
    elif a == 2:
        print('Broj', n,'je prost broj.')
    else:
        print('Broj', n,'je složen i ima', a,'djelitelja.')
