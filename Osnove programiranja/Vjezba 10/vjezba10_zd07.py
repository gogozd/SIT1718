# Gordan Volarević
# Vježba 10, zadatak 7

f_in = open("ulaz7.txt", "r")
f_out = open("izlaz7.txt", "w")
lista1 = f_in.read().replace(",", ".").split()
f_in.close()
lista2 = list()

for i in lista1:
    while (i):
        try:
            if i[0] == "0":
                raise ValueError
            lista2.append(str(int(float(i))))
            break
        except ValueError:
            if (len(i) > 1):
                i = i[1:]
            else:
                break

lista2.sort()
str1 = ", ".join(lista2)
f_out.write(str1)
f_out.close()
