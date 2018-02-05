# Gordan Volarević
# Vježba 10, zadatak 5

def broji_znamenke(znamenka, string):
    brojac = 0
    for i in string:
        if (str(i) == str(znamenka)):
            brojac += 1
    return brojac

f_in = open("ulaz5.txt", "r")
f_out = open("izlaz5.txt", "w")

str1 = f_in.read()

for i in str1:
    if not i.isdigit():
        str1 = str1.replace(i, "")

for i in range(10):
    brojac = broji_znamenke(i, str1)
    if brojac > 0:
        f_out.write("# {} - {:0.2f}\n".format(i, float(brojac) / float(len(str1))))
