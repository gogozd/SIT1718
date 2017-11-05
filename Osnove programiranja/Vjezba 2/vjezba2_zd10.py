# Gordan Volarević, 05.11.2017.
# Vježba 2, zadatak 10

broj = input('Unesite peteroznamenkasti broj: ')
while len(broj) != 5:
    print('Uneseni broj nije peteroznamenkast!')
    broj = input('Unesite peteroznamenkasti broj: ')
broj = int(broj)

dtisucice, tisucice = divmod(broj, 10000)
tisucice, stotice = divmod(tisucice, 1000)
stotice, desetice = divmod(stotice, 100)
desetice, jedinice = divmod(desetice, 10)

print(dtisucice + tisucice + stotice + desetice + jedinice)
