#Ejercicio 1
#Definimos una rotacion a la derecha de una cadena S como tomar el ultimo caracter de la cadena y llevarlo al inicio.
#Entrada: La cadena S y un numero entero R que representa el n´umero de rotaciones a
#la derecha a realizar sobre la cadena S. S no tendra espacios.(1 ≤ Longitud de la cadena
#S ≤ 40, 0 ≤ R ≤Longitud de S)
#Salida: La cadena S despues de realizar R rotaciones a la derecha
def rotar_derecha(c,r):
    r=r%len(c)
    rt=c[-r:]+c[:-r] 
    return(rt)

S = input("Introduce la cadena: ")
R = int(input("Introduce el número de rotaciones a la derecha: "))
r=rotar_derecha(S,R)
print(r)
