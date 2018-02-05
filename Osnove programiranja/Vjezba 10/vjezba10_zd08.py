# Gordan Volarević
# Vježba 10, zadatak 8

from vjezba9_zd01 import kompresija, dekompresija

while True:
    izbor = input(
        "datoteka s kojom radimo je \"izlaz8.txt\" - odaberite: \n[1] za kompresiju \n[2] za dekompresiju\n[za prekid stisnite bilo koju drugu tipku]: ")

    fin = open("izlaz8.txt", "r")
    lista1 = fin.readlines()
    fin.close()

    if izbor == "1":
        for i in range(len(lista1)):
            lista1[i] = kompresija(lista1[i])
        print("datoteka \"izlaz8.txt\" uspješno kompresirana")
    elif izbor == "2":
        for i in range(len(lista1)):
            lista1[i] = dekompresija(lista1[i])
        print("datoteka \"izlaz8.txt\" uspješno dekompresirana")
    else:
        break

    fout = open("izlaz8.txt", "w")
    fout.writelines(lista1)
    fout.close()
    print()