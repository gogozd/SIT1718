# Gordan Volarević, 05.11.2017.
# Vježba 2, zadatak 5

sekunde_input = int(input('Molimo unesite vrijeme u sekundama: '))

minute, sekunde = divmod(sekunde_input, 60)
sati, minute = divmod(minute, 60)
dani, sati = divmod(sati, 24)

print('{0} dana, {1} sati, {2} minuta i {3} sekunde.'.format(dani, sati, minute, sekunde))
