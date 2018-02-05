# Gordan Volarević
# Vježba 8, zadatak 1

import math

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

def main():
    T = (1, 2)
    F = (4, 5)
    print(udaljenost_tocaka(T, F))
    return

main()