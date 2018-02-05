# Gordan Volarević
# Vježba 12, zadatak 3

f_in = open('ulaz.txt', 'r')
f_out = open('izlaz.txt', 'w')
lista = []
lista = f_in.readlines()

for i in range(len(lista)):
    lista[i] = lista[i].split()

lista.sort(reverse = True)

for i in range(len(lista)):
    f_out.write('{}. {} {}\n'.format(i + 1, lista[i][0], lista[i][1]))

f_in.close()
f_out.close()
