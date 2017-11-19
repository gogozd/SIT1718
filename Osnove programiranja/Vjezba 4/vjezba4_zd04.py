# Gordan Volarević, 19.11.2017.
# Vjezba 4, zadatak 4

niz = input('Unesite niz znakova: ')

niz_0 = niz[::3]
niz_1 = niz_0.replace('', ' ')
print(niz_1.strip())
