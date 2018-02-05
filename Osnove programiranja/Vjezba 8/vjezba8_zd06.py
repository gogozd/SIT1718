# Gordan Volarević
# Vježba 8, zadatak 6

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

def main():
    lista = []
    l = len(lista)

    while l == len(lista):
        lista = unos_u_listu(lista)

    print('Maksimalni element liste je', max_element(lista))

    return

main()