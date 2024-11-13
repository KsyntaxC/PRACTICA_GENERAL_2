#Dado un numero N, mostrar:
#a) El enesimo primo.
#b) El numero en base binaria.
#c) La sumatoria de 1 a n
def primo(w):
    p=0
    i=2
    while w>0:
        c=1
        c2=0
        while c<=i:
            if i%c==0:
                c2=c2+1
            c=c+1
        if c2==2:
            p=i
            w=w-1
        i=i+1
    return(p)

def bin(w):
    if w==0:
        return(0)
    else:
        return(bin(w//2)*10+(w%2))

def sum(w):
    s=0
    for i in range (1,w+1):
        s=s+i
    return(s)

N=int(input("Introduce N:"))
p=primo(N)
b=bin(N)
s=sum(N)
print("El enesimo primo es ",p)
print("El binario es ", b)
print("La sumatoria hasta N es: ",s)