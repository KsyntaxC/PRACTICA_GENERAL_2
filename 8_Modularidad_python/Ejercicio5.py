#Determinar la primalidad de un numero, 1 si es primo, 0 en caso contrario
def es_primo(w):
    c=0
    for i in range(1,w+1):
        if w%i==0:
            c=c+1
    if c==2:
        return(1)
    else:
        return(0)

n=int(input("Introduce el numero: "))
p=es_primo(n)
print(p)