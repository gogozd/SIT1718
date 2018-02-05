# Gordan Volarević
# Vježba 8, zadatak 2

def palindrom(s):
    return s == s[::-1]

def main():
    s = str(input('Unesite riječ: '))
    if palindrom(s):
        print('Riječ je palindrom.')
    else:
        print('Riječ nije palindrom.')
main()
