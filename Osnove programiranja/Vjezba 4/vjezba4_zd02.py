# Gordan Volarević, 19.11.2017.
# Vjezba 4, zadatak 2

prvi_niz = input('Unesite prvi niz znakova: ')
drugi_niz = input('Unesite drugi niz znakova: ')

if prvi_niz in drugi_niz:
    print(prvi_niz, 'se nalazi u drugom nizu', drugi_niz)
else:
    print(prvi_niz, 'se ne nalazi u drugom nizu', drugi_niz)
