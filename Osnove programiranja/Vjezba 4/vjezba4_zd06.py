# Gordan Volarević, 19.11.2017.
# Vjezba 4, zadatak 6

niz_1 = input('Unesite prvi niz znakova: ')
niz_2 = input('Unesite drugi niz znakova: ')

if niz_1 in niz_2:
    od = (niz_2.find(niz_1) + len(niz_1))
    print(niz_2[od:])
else:
    print('Prvi niz znakova se ne nalazi u drugom nizu znakova.')
