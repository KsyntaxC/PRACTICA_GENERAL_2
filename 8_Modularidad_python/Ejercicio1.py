#Descripcion: Dado un lote de T numeros mostrar cuantos numeros son palındromos
#Utilizar al menos 2 funciones o procedimientos.
#Salida: Por cada numero N leido de teclado debe haber una salida que indique cuantos
#numeros son palındromos
def Comp(w):
    nn=0
    while w!=0:
        d=w%10
        w=w//10
        nn=nn*10+d
    return (nn)

def pal(w):
    if w==Comp(w):
        P=1
    else:
        P=0
    return(P)

T=int(input("Introduce T (El numero de numeros a verificar): "))
s=0
for i in range (1,T+1):
    N=int(input("Introduce N: "))
    s=s+pal(N)
print("Hay ",s," palindromos")