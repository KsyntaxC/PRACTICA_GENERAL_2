#Verificar si el numero "es primo" o "no es primo"
def es_primo(w):
    c=0
    for i in range(1,w+1):
        if w%i==0:
            c=c+1
    if c==2:
        return True
    return False

n=int(input("Introducir numero: "))
if es_primo(n):
    print("Es primo")
else:
    print("No es primo")