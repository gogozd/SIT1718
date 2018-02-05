# Gordan Volarević
# Vježba 10, zadatak 4

f_ulaz = open('ulaz4.txt', 'r')
f_izlaz = open('izlaz4.txt', 'w')

lista = f_ulaz.readlines()

for i in range(len(lista)):

    linija = lista[i].split()

    if len(linija) != 3:
        continue

    if linija[1] == '+':
        temp = float(linija[0]) + float(linija[2])
    elif linija[1] == '-':
        temp = float(linija[0]) - float(linija[2])
    elif linija[1] == '*':
        temp = float(linija[0]) * float(linija[2])
    elif linija[1] == '/':
        temp = float(linija[0]) / float(linija[2])
    else:
        continue

    f_izlaz.write(str(temp) + '\n')

f_ulaz.close()
f_izlaz.close()