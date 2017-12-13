lista = list('abcd')

for i in lista:
    for j in lista:
        for k in lista:
            for l in lista:
                if i != j and i != k and j != l and i != l and j != k and j != l and k != l:
                    print(i,j,k,l)
