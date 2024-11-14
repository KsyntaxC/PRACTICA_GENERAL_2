'''Para que la contrasena sea segura debe cumplir las siguientes condiciones
Minimo una longitud de 10 caracteres.
Minimo 4 numeros.
Minimo 2 letras mayusculas.
Minimo 2 letras minusculas.
Debe contener al menos 1 caracter especial: *, !,#, <, > .
Entrada: La entrada consiste en un entero N que es el numero de contrasenas. 
Luego siguen N lineas, donde cada linea contiene una cadena S que es la contrasena.
Salida: Para cada contrasena, debes imprimir en una nueva linea Segura o Debil.'''
def dificultad(S):
    cc=len(S); num=0; may=0; min=0; esp=0 
    for l in S:
        if '0'<=l<='9':
            num=num+1
        if 'A'<=l<='Z':
            may=may+1
        if 'a'<=l<='z':
            min=min+1
        if l in "*!#<>":
            esp=esp+1
    if cc>=10 and num>=4 and may>=2 and min>=2 and esp>=1:
        return "Segura"
    else:
        return "Debil"

N = int(input("Número de contraseñas: "))
for i in range(1, N + 1):
    S = input("Introduce contraseña: ")
    dif = dificultad(S)
    print(dif)