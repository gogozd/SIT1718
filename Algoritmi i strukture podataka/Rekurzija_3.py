
def rekurzija(niz):
    if len(niz) == 1:
        return niz[0]
    else:
        min = rekurzija(niz[1:])
        return min if min < niz[0] else niz[0]

def main():
    niz = [23, 65, 14, 7, 34, 126, 234]
    print(rekurzija(niz))

main()
