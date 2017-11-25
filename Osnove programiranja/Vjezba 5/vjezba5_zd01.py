# Gordan Volarević
# Vježba 5, zadatak 1

n = int(input('Unesite prirodan broj: '))

# ispis prvih n prirodnih brojeva
print('a) Prvih n prirodnih brojeva', end=' ')
for i in range(n):
    print(i+1, end=' ')
print()

'''
i=1
while i<=n:
    print(i, end=' ')
    i += 1
'''

# ispis prvih n neparnih prirodnih brojeva
print('b) Prvih n neparnih prirodnih brojeva', end=' ')
for i in range(n):
    print(2*i+1, end=' ')
print()

# ispis n faktorijela

faktorijele = 1

print('c) n faktorijela', end=' ')
for i in range(1, n+1):
    faktorijele *= i
print(faktorijele)

#ispis parnih/neparnih manjih od n

if n%2 :
    for i in range (1, n+1):
        if i%2 : print(i, end=' ')
else:
    for i in range (1, int(n/2 + 1)):
        print(2*i, end=' ')
