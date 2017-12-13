# Gordan Volarević
# Vjezba 7, zadatak 4

niz = str(input('Unesite niz: '))
niz = niz.lower()
if 'č' or 'ć' or 'š' or 'đ' or 'ž' in niz:
    niz = niz.replace('č', 'c').replace('ć', 'c').replace('š', 's').replace('đ', 'd').replace('ž', 'z')
    print(niz)
