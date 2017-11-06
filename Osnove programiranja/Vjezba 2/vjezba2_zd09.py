# Gordan Volarević, 05.11.2017.
# Vježba 2, zadatak 9

broj = int(input('Unesite četveroznamenkasti broj: '))
while broj / 1000 >= 10:
    print('Uneseni broj sadrži više od četiri znamenke.')
    broj = int(input('Unesite četveroznamenkasti broj: '))

if broj >= 1000:
    tisucice, stotice = divmod(broj, 1000)
    stotice, desetice = divmod(stotice, 100)
    desetice, jedinice = divmod(desetice, 10)
    print('{}{}{}{}'.format(jedinice, desetice, stotice, tisucice))

elif 100 <= broj < 1000:
    stotice, desetice = divmod(broj, 100)
    desetice, jedinice = divmod(desetice, 10)
    print('{}{}{}{}'.format(0, jedinice, desetice, stotice))

elif 10 <= broj < 100:
    desetice, jedinice = divmod(broj, 10)
    print('{}{}{}{}'.format(0, 0, jedinice, desetice))

elif 0 <= broj < 10:
    jedinice = broj
    print('{}{}{}{}'.format(0, 0, 0, jedinice))
