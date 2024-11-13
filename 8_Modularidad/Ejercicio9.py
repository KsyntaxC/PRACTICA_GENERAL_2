#Mediante funciones disene una calculadora basica que acepta un simbolo que representa una
#operacion: ˆ, ∗, +, −, !, b. Luego se leen los operandos a y b del calculo a realizar, en el caso
#del simbolo ! (factorial) y b (conversion a binario) solo se lee un operando.
#Escriba un programa que lee un entero N el numero de operaciones a realizar, le siguen N ∗ 2
#lineas, en la primera linea de cada caso se escribe el operador, y en la segunda los operadores.
#En la salida para cada operacion realizada se muestra el resultado.
def Expo(w):
    b=int(input("Introduce el exponente de a: "))
    r=a**b
    return(r)

def Mult(w):
    b=int(input("Introduce el numero a multiplicar a: "))
    r=a*b
    return(r)

def Sum(w):
    b=(int(input("Introduce el valor que se sumara: ")))
    r=a+b
    return(r)

def Rest(w):
    b=(int(input("Introduce el valor que se restara: ")))
    r=a-b
    return (r)

def facto(w):
    r=1
    for i in range(1,w+1):
        r=r*i
    return(r)

def bin(w):
    if w==0:
        return(0)
    else:
        return(bin(w//2)*10+(w%2))

N=int(input("Introduce el numero de ejercicios que realizara: "))
for i in range(1,N+1):
    s=input("Bien, ahora ingrese un simbolo entre ^, *, +, -, !, b: ")
    a=int(input("Intro a: "))
    if s=="^":
        r=Expo(a)
    elif s=="*":
        r=Mult(a)
    elif s=="+":
        r=Sum(a)
    elif s=="-":
        r=Rest(a)
    elif s=="!":
        r=facto(a)
    elif s=="b":
        r=bin(a)
    else:
        r="Ingrese un simbolo valido"
    print(r)