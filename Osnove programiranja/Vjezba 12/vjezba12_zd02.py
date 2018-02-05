# Gordan Volarević
# Vježba 12, zadatak 2

def samoglasnici(s):
    global brojac
    brojac = 0
    for i in range(len(s)):
        if s[i] in 'aeiouAEIOU':
            brojac += 1
    return brojac

def main():
    s = str(input('Unesite niz znakova: '))
    samoglasnici(s)
    print('Broj samoglasnika u stringu \'{}\' je {}, što čini {:.2f}% od ukupnog broja znakova.'.format(s, brojac, brojac / len(s) * 100))

main()
