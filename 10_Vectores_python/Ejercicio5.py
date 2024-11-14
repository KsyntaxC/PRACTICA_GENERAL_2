'''Dado un arreglo de numeros de tamano par, se pide mostrar si la suma de elementos
pares[0, 2, 4...] es mayor a la suma de elementos impares[1, 3, 5...].'''
N = int(input("Introduce el tamaño del arreglo (debe ser par): "))
ar=[]
for i in range(N):
    el=int(input("Introduce un elemento del arreglo: "))
    ar.append(el)
sp=0
sim=0
for i in range(len(ar)):
    if i%2==0:
        sp=sp+ar[i]
    else:
        sim=sim+ar[i]
if sp>sim:
    print("La suma de mayor tamaño son los elementos pares")
    print(sp)
else:
    print("La suma de mayor tamaño son los elementos impares")
    print(sim)