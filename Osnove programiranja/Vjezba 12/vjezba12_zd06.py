import random

def usporedi(lista1, lista2):
    global br
    br = 0
    for i in range(len(lista1)):
        for j in range(len(lista2)):
            if lista1[i] == lista2[j]:
                br += 1
    return br

def izvlacenje_brojeva():
    global lista1
    lista1 = []
    for l in range(7):
        broj = random.randint(1, 39)
        while broj in lista1:
            broj = random.randint(1, 39)
        lista1.append(broj)

# nije do kraja napravljen zadatak
def main():
    lista2 = []
    for k in range(7):
        n = int(input('Unesite broj: '))
        while 0 < n > 40:
            print('Neispravno unesen broj.')
            n = int(input('Unesite broj: '))
        lista2.append(n)
    izvlacenje_brojeva()
    usporedi(lista1, lista2)
    str1 = ', '.join(str(e) for e in lista1)
    str2 = ', '.join(str(f) for f in lista2)
    print('Izvučeni brojevi: {}\nIzabrani brojevi: {}\nBroj pogođenih brojeva: {}'.format(str1, str2, br))

main()
