c_estrada, d_pedágios= map(int, input().split())
custo_km, valor_cada_pedágio= map(int, input().split())
pedágio= c_estrada//d_pedágios
custo_total= int((custo_km*c_estrada)+(valor_cada_pedágio*pedágio))

print(int(custo_total))