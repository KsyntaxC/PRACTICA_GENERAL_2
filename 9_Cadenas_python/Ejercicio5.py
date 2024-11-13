'''Dadas dos cadenas se pide crear una nueva cadena intercalando palabra de una y otra cadena,
mostrar la cadena resultante. La cadena debe tener solo una letra mayuscula al principio.'''
def num_pal(b):
    b=b+" "; c=0; lc=len(b)
    for i in range(1, lc+1):
        y=b[i-1:i]
        if y==" ":
            c=c+1
    return (c)

def sac_pal(b,k):
    b=b+" "; c=0; w=""; v=""; lc=len(b)
    for i in range(1,lc+1):
        y=b[i-1:i]
        if y==" ":
            c=c+1
            if c==k:
                w=v
            v=""
        else:
            v=v+y
    return (w)

def minus(p):
    r=""
    for l in p:
        if 'A'<=l<='Z':
            a=ord(l)+32
            r=r+chr(a)
        else:
            r=r+l
    return (r)

def may_prim(f):
    i=0
    while i<len(f) and f[i]==" ":
        i=i+1
    r=""
    if i<len(f) and 'a'<=f[i]<='z':
        r=r+chr(ord(f[i])-32)
    else:
        r=r+f[i] if i<len(f) else ""
    for j in range(i+1,len(f)):
        if 'A' <= f[j] <= 'Z':
            r=r+chr(ord(f[j]) + 32)
        else:
            r=r+f[j]
    return (r)

b=input("Introduce tu frase: ")
h=input("Introduce tu frase numero 2: ")
nb=num_pal(b)
nh=num_pal(h)
mp=nb+nh
r=""
for i in range(1,mp+1):
    if i<=nb:
        pb=sac_pal(b, i)
        pb=minus(pb)
        r=r+pb + " "
    if i<=nh:
        ph=sac_pal(h, i)
        ph=minus(ph)
        r=r+ph + " "
r=may_prim(r)
print(r)