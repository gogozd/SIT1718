# Gordan Volarević
# Vjezba 5, zadatak 6

n = int(input('Unesite prirodan broj: '))
suma_ocjena = 0

for i in range(1, n+1):
    ocjena = int(input('Unesite ocjenu od 1 do 5: '))
    if ocjena < 1:
        print('Neispravno unesena ocjena.')
        ocjena = int(input('Unesite ocjenu od 1 do 5: '))
    elif ocjena > 5:
        print('Neispravno unesena ocjena.')
        ocjena = int(input('Unesite ocjenu od 1 do 5: '))
    suma_ocjena += ocjena
    i += 1
    prosjek = suma_ocjena / (i-1)

if prosjek > 1:
    print('Prosjek unesenih ocjena iznosi', prosjek)
else:
    print('Nedovoljan.')
