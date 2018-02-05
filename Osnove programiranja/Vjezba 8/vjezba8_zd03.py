# Gordan Volarević
# Vježba 8, zadatak 3

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

def main():
    x = int(input('Unesite x: '))
    y = int(input('Unesite y: '))
    kvadrant(x, y)

main()
