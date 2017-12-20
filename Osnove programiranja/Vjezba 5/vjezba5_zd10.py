# Gordan Volarević
# Vježba 5, zadatak 10

n = int(input('Unesite prirodni broj: '))

if n <= 0:
    print('Greška kod unosa.')
else:
    while n > 0:
        niz = str(n)
        pronadjen = True

        for i in range(len(niz)):
            if niz[i] != niz[(len(niz) - 1) - i]:
                pronadjen = False

        if pronadjen:
            print(n)
            break
        else:
            n -= 1
