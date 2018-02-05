def zbroj(a=0, b=0):
    '''Funkcija zbroj vraća zbroj brojeva a i b'''
    return a + b

def zbroj_znamenaka(n):
    if n < 0: n *= -1
    zbroj_n = 0
    while n != 0:
        zbroj_n += n % 10
        n //= 10
    return zbroj_n

def udaljenost_od_0(x, y):
    d = math.sqrt(x**2 + y**2)
    return d

def udaljenost_tocaka(T_1, T_2):
    '''Funkcija vraća udaljenost između točaka T-1 i T_2 koje su uređeni parovi brojeva'''
    d = math.sqrt((T_1[0] - T_2[0])**2 + (T_1[1] - T_2[1])**2)
    return d

def palindrom(s):
    return s == s[::-1]

def kvadrant(x, y):
    if x and y > 0:
        print('Točka se nalazi u prvom kvadrantu.')
    elif x < 0 and y > 0:
        print('Točka se nalazi u drugom kvadrantu.')
    elif x and y < 0:
        print('Točka se nalazi u trećem kvadrantu.')
    elif x > 0 and y < 0:
        print('Točka se nalazi u četvrtom kvadrantu.')
    elif x == 0 and y == 0:
        print('Točka se nalazi u ishodištu.')
    elif x == 0 and y != 0:
        print('Točka se nalazi na y osi.')
    elif y == 0 and x != 0:
        print('Točka se nalazi na x osi')

def binarno_pretrazivanje(lista, s):

    l = len(lista)
    if l == 0:
        return False
    if s == lista[l//2]:
        return True
    elif s < lista[l//2]:
        return binarno_pretrazivanje(lista[0:l//2], s)
    else:
        return binarno_pretrazivanje(lista[l//2 + 1:l], s)

def unos_int():
    try:
        n = int(input('Unesite cijeli broj: '))
    except ValueError:
        print('Nije unesen cijeli broj.')
    return n

def prost(n):
    for i in range(2, round(n ** (1 / 2)) + 1):
        if n % i == 0:
            return print('Broj je složen.')
    if n > 1:
        return print('Broj je prost.')
    else:
        return print('Broj je složen.')

def unos_u_listu(lista):
    x = input('Unesite broj (ili slovo za prekid): ')

    if x.isdigit():
        lista.append(float())
        return lista
    else:
        return lista

def max_element(lista):

    if len(lista) == 0:
        return

    max_el = lista[0]
    for i in lista:
        if i > max_el:
            max_el = i

    return max_el

