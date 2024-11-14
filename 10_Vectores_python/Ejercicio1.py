'''Descripcion: Dado 3 vectores de tamanos t
Entrada: primero se proporciona el tamano del vector, luego sus elementos
Salida: En la primera linea mostrar el tamano del vector t
En la segunda linea mostrar los elementos primos del vector t ordenado de forma descendente
'''

def es_primo(w):
    c=0
    for i in range(1,w+1):
        if w%i==0:
            c=c+1
    if c==2:
        return True
    return False

Z = []
for u in range(3):
    t = int(input("Intro Tamano del Vector: "))
    l = []
    for i in range(t):
        elz=int(input("Introduce z elementos: "))
        l.append(elz)
    for i in range(t):
        if es_primo(l[i]):
            Z.append(l[i])
for i in range(len(Z)):
    for j in range(i+1,len(Z)):
        if Z[i]<Z[j]:
            Z[i],Z[j] = Z[j],Z[i]
print(len(Z))
for i in range(len(Z)):
    if i>0:
        print("  ", end="")
    print(Z[i], end="")
print()
