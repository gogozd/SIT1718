# Gordan Volarević, 05.11.2017.
# Vježba 2, zadatak 3

duljina_cm = int(input('Unesi duljinu u centimetrima: '))

duljina_ft, duljina_ostatak = divmod(duljina_cm, 30.48)
duljina_in = duljina_ostatak * 0.393701

print('Duljina od', duljina_cm, 'cm odgovara duljini od', int(duljina_ft), 'stopa i', int(duljina_in), 'inča.')
