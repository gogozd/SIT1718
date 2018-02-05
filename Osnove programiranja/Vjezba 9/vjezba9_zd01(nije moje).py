# Gordan Volarević
# Vjezba 9, zadatak 1

def kompresija(s):

    d = len(s)
    br = 1
    bro = 0
    var = ''

    for bro in range(d):
        if bro < d - 1:
            if s[bro] == s[bro+1]:
                br += 1
            else:
                if br == 1:
                    var += s[bro]
                else:
                    var += s[bro]+str(br)
                    br = 1
        if bro == d - 1:
            if br == 1:
                var += s[bro]
            else:
                var += s[bro] + str(br)
    return var

def dekomp(s):
    n = 0
    d = len(s)
    br = 0
    num = ''
    bro = 0
    var = ''

    for i in range(d):
        f = '1234567890'
        if i < d - 1:
            if s[i] in f:
                num += s[i]
                br += 1
                if not s[i+1] in f:
                    n = int(num)
                    num = ''
                    var += s[i-br]*(n)
                    br = 0
            else:
                if not s[i+1] in f:
                    var += s[i]
        elif i == d - 1:
            if s[i] in f:
                num += s[i]
                br += 1
                n = int(num)
                var += s[i - br] * (n)
            else:
                var += s[i]
    return var

def main():

    niz = input('Unesi niz:')
    op = input('Unesi opciju K-Komprimiraj , D-Dekomprimiraj:')
    op.lower()

    if op == 'k':
        print(kompresija(niz))
    elif op == 'd':
        print(dekomp(niz))

main()
