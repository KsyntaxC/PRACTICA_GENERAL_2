#Dado un lote de N numeros, formar dos nuevos numeros, el primer numero formado por los
#pares y el segundo formado por los impares de cada numero del lote luego determine cual es mayor
N=int(input("Introduce N: "))
P=0; IM=0
for i in range (1,N+1):
    x=int(input("Introduce x: "))
    if x%2==0:
        P=P*10+x
    else:
        IM=IM*10+x
if P>IM:
    print(P)
else:
    print(IM)