#Dado un vector de N terminos ordenarlos de manera ascendente
N=int(input("Introduce el tamaño del vector: "))
v=[]
for i in range(N):
    elv=int(input("Introduce un elemento del vector: "))
    v.append(elv)
for i in range(len(v)):
    for j in range(i + 1, len(v)):
        if v[i]>v[j]:
            v[i],v[j]=v[j],v[i]
for i in range(len(v)):
    if i>0:
        print(" ", end="")
    print(v[i], end="")
print()