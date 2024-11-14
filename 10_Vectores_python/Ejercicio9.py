#Dado un vector de tamano N de caracteres verificar si se puede formar una palabra palindormo 
def palin(vc):
    ct={}
    for i in vc:
        if i in ct:
            ct[i]=ct[i]+1
        else:
            ct[i]=1
    imp=0
    for j in ct.values():
        if j%2!=0:
            imp=imp+1
    return imp<=1

T=int(input("Introduce el numero de intentos: "))
for j in range(T):
    N=int(input("Introduce N (tamaño del vector): "))
    vc=[]
    for i in range(N):
        c=input(f"Introduce el carácter {i+1}: ")
        vc.append(c)
    if palin(vc):
        print("Es palindromo")
    else:
        print("No es palindromo")