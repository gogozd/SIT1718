# Gordan Volarević
# Vjezba 5, zadatak 4

niz = input('Unesite niz znakova: ')
eng_abc = ('abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ')

for i in niz:
  if i in eng_abc:
    print(i)
    
'''
niz = str(input('Unesite niz znakova: '))

import string

for i in niz:
  if i in string.ascii_letters:
    print(i)
'''
