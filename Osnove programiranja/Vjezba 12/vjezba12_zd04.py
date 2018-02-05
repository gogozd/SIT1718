import math

def povrsina_trokuta(x_1, x_2, x_3, y_1, y_2, y_3):
    pov = 1 / 2 * abs(x_1 * (y_2 - y_3) + x_2 * (y_3 - y_1) + x_3 * (y_1 - y_2))
    print(pov)
    return pov

def main():
    x_1 = int(input('Unesi x_1: '))
    x_2 = int(input('Unesi x_2: '))
    x_3 = int(input('Unesi x_3: '))
    y_1 = int(input('Unesi y_1: '))
    y_2 = int(input('Unesi y_2: '))
    y_3 = int(input('Unesi y_3: '))
    T_1 = (x_1, y_1)
    T_2 = (x_2, y_2)
    T_3 = (x_3, y_3)
    print(T_1, T_2, T_3)
    povrsina_trokuta(x_1, x_2, x_3, y_1, y_2, y_3)
main()