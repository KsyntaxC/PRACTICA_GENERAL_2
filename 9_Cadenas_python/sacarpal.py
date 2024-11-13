def numpal(b):
    b=b+" "; c=0; cc=len(b)
    for i in range(1,cc+1):
        y=b[i-1:i]
        if y==" ":
            c=c+1
    return(c)

def sacarpal(b,k):
    b=b+" "; c=0; w=""; v=""; cc=len(b)
    for i in range(1,cc+1):
        y=b[i-1:i]
        if y==" ":
            c=c+1
            if c==k:
                w=v
            v=""
        else:
            v=v+y
    return (w)

b=input("Introduce tu frase: ")
h=input("Introduce tu frase numero 2: ")
frase=b+" "+h
cp=numpal(frase)
w=""
for i in range(1,cp+1):
    pal=sacarpal(b,i)
    print (pal)
