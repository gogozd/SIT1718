# Gordan Volarević
# Vježba 8, zadatak 5

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

def main():
    n = unos_int()
    prost(n)

main()
