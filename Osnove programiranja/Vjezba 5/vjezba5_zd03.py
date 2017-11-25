# Gordan Volarevic
# Vjezba 5, zadatak 3

m = int(input('Unesite prvi prirodni broj veći od 0: '))
n = int(input('Unesite drugi prirodni broj veći od 0: '))

if m > 0 and n > 0:
    lista_nzd = []
    for i in range(1, m+1 or n+1):
        if m%i == 0 and n%i == 0:
            lista_nzd.append(i)
    print('Najveći zajednički djelitelj brojeva', m,'i', n,'je', max(lista_nzd))
else:
    print('Uneseni broj nije veći od 0.')
