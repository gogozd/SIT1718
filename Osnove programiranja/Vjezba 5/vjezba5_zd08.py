# Gordan Volarević
# Vjezba 5, zadatak 8

n = int(input('Unesite broj u sustavu s bazom 5: '))
lista = [int(x) for x in str(n)]

if int(max(lista)) > 4:
    print('Uneseni broj niju u sustavu s bazom 5.')
else:
    print(int('{}'.format(n), 5))
