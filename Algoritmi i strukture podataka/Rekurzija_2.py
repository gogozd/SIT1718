
def binomna(n, k):
    if n == k or k == 0:
        return 1
    return binomna(n - 1, k - 1) + binomna(n - 1, k)

def main():
    n = int(input("Unesite broj (n): "))
    k = int(input("Unesite broj (k): "))
    print(binomna(n ,k))

main()
