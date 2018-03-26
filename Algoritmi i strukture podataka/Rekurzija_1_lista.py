
def rekurzija(n):
    if n < 10:
        return [n]
    return rekurzija(n // 10) + [n % 10]

def main():
    n = int(input("Unesite neki broj: "))
    rekurzija(n)

main()
