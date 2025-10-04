c,q= map(int,input().split())

if c==1:
    preço=q*4
elif c==2:
    preço=q*4.50
elif c==3:
    preço=q*5.00
elif c==4:
    preço= q*2
elif c==5:
    preço=q*1.50

print(f"Total: R$ {preço:.2f}")