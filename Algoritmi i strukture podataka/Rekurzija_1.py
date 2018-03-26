
def rekurzija(n):
    if n < 10:
        return print(n)
    else:
        print (n % 10)
    return rekurzija(n // 10)

def main():
    n = int(input("Unesite neki broj: "))
    rekurzija(n)

main()
