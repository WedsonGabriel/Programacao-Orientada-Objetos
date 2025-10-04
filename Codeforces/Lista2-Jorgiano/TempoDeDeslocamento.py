d=int(input())
v=int(input())

tempo_horas= d/v
tempo_minutos= int(tempo_horas*60)

horas= tempo_minutos//60
minutos= tempo_minutos%60

print(f"{horas:02d}:{minutos:02d}")

