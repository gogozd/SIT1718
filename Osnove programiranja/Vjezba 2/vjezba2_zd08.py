# Gordan Volarević, 02.11.2017.
# Vježba 2, zadatak 8

broj = int(input('Unesite troznamenkasti cijeli broj: '))

stotice, desetice = divmod(broj, 100)
desetice, jedinice = divmod(desetice, 10)

# print('{}\n{}\n{}'.format(stotice, desetice, jedinice))

print(stotice, desetice, jedinice, sep='\n')
