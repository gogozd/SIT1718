# Gordan Volarević, 20.11.2017.
# Vjezba 4, zadatak 11

niz = input('Unesite niz znakova koji se sastoji od kombinacije slova A, B i C: ')

lista = list(niz)

a = lista.count('A')
b = lista.count('B')
c = lista.count('C')

ukupno = a + b + c

ap = a * 100 / ukupno
bp = b * 100 / ukupno
cp = c * 100 / ukupno

print('Udio pojavljivanja slova A u nizu iznosi: ', float(round(ap, 2)),'%')
print('Udio pojavljivanja slova B u nizu iznosi: ', float(round(bp, 2)),'%')
print('Udio pojavljivanja slova C u nizu iznosi: ', float(round(cp, 2)),'%')

lista.sort()
print(lista)
