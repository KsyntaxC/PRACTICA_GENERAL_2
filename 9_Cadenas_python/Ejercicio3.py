'''Descripcion: Una cadena se llama bailarina, si y solo si, la primera letra es mayuscula
y cada una de las demas letras es lo opuesto a la anterior letra (mayuscula, minuscula,
mayuscula, minuscula, ..., etc.). Ahora, debes construir un programa para que lea varios casos de
prueba y que convierta la cadena de texto en una cadena BAILARINA.
Entrada: La entrada consiste en un entero T numero de casos de prueba, seguido por
T lineas, cada una contiene una cadena de texto, puede ser que este vacia.
Salida: Imprimir una linea por cada caso de prueba, que contiene la cadena bailarina
resultado.'''
def bailarina(w):
    s=""; c=1
    for i in range(len(w)):
        nc=w[i]
        if nc!=" ":
            asq=ord(nc)
            if c%2==0:
                if 'A'<=nc<='Z':
                    asq=asq+32
            else:
                if 'a'<=nc<='z':
                    asq=asq-32
            s=s+chr(asq)
        else:
            s=s+nc
            c=c+1
        c=c+1
    return (s)

T=int(input("Introduce el numero T de casos de prueba: "))
for i in range(1,T+1):
    c=input("Introduce la cadena: ")
    ba=bailarina(c)
    print(ba)