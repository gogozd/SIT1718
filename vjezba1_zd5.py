#Gordan Volarević, 26.10.2017.
#vježba1_zd5.py

sekunde=184713

dani=sekunde//(24*60*60)
sekunde_ostatak=sekunde%(24*60*60)

sati=sekunde_ostatak//(60*60)

sekunde_ostatak%=60**2

minute=sekunde_ostatak//60
sekunde_ostatak%=60

print(sekunde, 'sekundi jednako je',dani,'dana,',sati,'sata',minute,'minuta',sekunde_ostatak,'sekundi')
