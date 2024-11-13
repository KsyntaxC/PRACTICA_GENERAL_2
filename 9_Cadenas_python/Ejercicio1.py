#Entrada: La cadena S y un numero entero R que representa el numero de rotaciones a
#la derecha a realizar sobre la cadena S. S no tendra espacios.(1 ≤ Longitud de la cadena
#S ≤ 40, 0 ≤ R ≤Longitud de S)
#Salida: La cadena S despues de realizar R rotaciones a la derecha
def rot_der(w,e):
    cc=len(w)
    sc1=w[0:cc-e]
    sc2=w[cc-e:cc]
    nc=sc2+sc1
    return(nc)

S=input("Introduce la cadena: ")
R=int(input("Introduce el número de rotaciones a la derecha: "))
r=rot_der(S,R)
print(r)