# Gordan Volarević
# Vježba 10, zadatak 6

f_in = open("ulaz6.txt", "r")
f_out = open("izlaz6.txt", "w")
lista = list()
lista = f_in.readlines()

for i in range(len(lista)):
    lista[i] = lista[i].split()

for i in range(len(lista)):
    lista[i] = (float(lista[i][1]) / float(lista[i][2]) ** 2, lista[i][0])

lista.sort(reverse=True)

for i in lista:
    f_out.write(i[1] + " {0:.2f}\n".format(i[0]))
