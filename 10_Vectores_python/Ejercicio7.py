'''Se te da una secuencia de numeros enteros. Debes imprimir la suma alternada de esta secuencia. 
Entrada: La primera linea de la prueba contiene t casos de prueba.
La primera linea de cada caso de prueba contiene la longitud de la secuencia. 
La segunda linea del caso de prueba contiene n numeros enteros
Salida: imprime la suma alternada requerida de los numeros.
'''
t=int(input("Introduce el numero de casos de prueba: "))
for j in range(t):
    l=int(input("Introduce la longitud de la secuencia: "))
    ar=[]
    for i in range(l):
        n=int(input("Introduce los elementos de la secuencia: "))
        ar.append(n)
    sa=0
    for i in range(len(ar)):
        if i%2==0:
            sa=sa+ar[i]
        else:
            sa=sa-ar[i]
    print(sa)