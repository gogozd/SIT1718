#Gordan Volarević, 29.10.2017.
#vježba1_zd3.py

duljina_cm= 196

duljina_ft= duljina_cm//30.48
duljina_ostatak= duljina_cm%30.48
duljina_in= duljina_ostatak*0.393701

print('Duljina od',duljina_cm,'cm odgovara duljini od',int(duljina_ft),'stopa i',int(duljina_in),'inča')
