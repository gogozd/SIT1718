# Gordan Volarević, 13.11.2017.
# Vježba 3, zadatak 4

bodovi = int(input('Unesite broj postignutih bodova: '))
while bodovi > 100 or bodovi < 0:
    print('Nije dobro unesen broj postignutih bodova.')
    bodovi = int(input('Unesite broj postignutih bodova: '))

if 0 <= bodovi <= 59:
    print('Pripadajuća ocjena prema broju postignutih bodova je 1(nedovoljan).')
elif 60 <= bodovi <= 69:
    print('Pripadajuća ocjena prema broju postignutih bodova je 2(dovoljan).')
elif 70 <= bodovi <= 79:
    print('Pripadajuća ocjena prema broju postignutih bodova je 3(dobar).')
elif 80 <= bodovi <= 89:
    print('Pripadajuća ocjena prema broju postignutih bodova je 4(vrlo dobar).')
else:
    print('Pripadajuća ocjena prema broju postignutih bodova je 5(izvrstan)')
