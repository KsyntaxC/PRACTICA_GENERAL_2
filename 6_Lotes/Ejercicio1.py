#Dado un lote de N numeros, determinar los divisores de cada x numero
N=int(input("Intro n: "))
i=0
while i < N:
    x=int(input("Intro x: "))
    j=1
    while j <= x:
        if x%j==0:
            print(j,end=", ")
        j=j+1
    print()
    i=i+1
