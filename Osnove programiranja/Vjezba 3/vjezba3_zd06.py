# Gordan Volarević, 13.11.2017.
# Vježba 3, zadatak 6

i = int(input('Unesite cijeli broj: '))
baza = int (input('Unesite bazu u kojoj će se taj broj ispisati (2, 8 ili 16): '))

if baza == 2:
    print('Zadani broj ispisan u binarnom obliku: ', bin(i))
elif baza == 8:
    print('Zadani broj ispisan u oktalnom obliku: ', oct(i))
elif baza == 16:
    print('Zadani broj ispisan u heksadecimalnom obliku: ', hex(i))
else:
    print('Neispravno unesena baza.')
