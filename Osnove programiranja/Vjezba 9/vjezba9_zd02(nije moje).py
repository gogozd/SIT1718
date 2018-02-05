# Gordan Volarević
# Vjezba 9, zadatak 2

def dupla_rijec(niz):
    d = len(niz)
    br_1 = 0
    br_2 = 2
    n = ''
    m = ''
    d_2 = 0
    while br_2 < d:
        if br_1 == 0:
            n = niz[br_1:br_2]
            d_2 = len(n)
        if n == niz[br_2:br_2 + d_2]:
            m = n + niz[br_2:br_2 + d_2]
            return m
        else:
            br = 0
            br_1 += 1
            br_2 += 1
        if br_2 == d - 1:
            br_2 = d_2 + 1
            br_1 = 0

    return 'Nema dvostruke rijeci'

def main():
    niz = input('Unesi niz:')
    print(dupla_rijec(niz))

main()
