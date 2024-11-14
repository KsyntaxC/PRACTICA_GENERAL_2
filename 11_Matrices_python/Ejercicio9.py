def m_serp(n,m):
    ma=[]
    nu=1
    for i in range(n):
        f=[]
        for j in range(m):
            f.append(nu)
            nu=nu+1
        if i%2==1:
            f.reverse()
        ma.append(f)
    return ma

def imprimir_matriz(matriz):
    for fila in matriz:
        print(" ".join(map(str, fila)))

n=int(input("Ingrese el valor de N (filas): "))
m=int(input("Ingrese el valor de M (columnas): "))
mat=m_serp(n,m)
print("\nMatriz serpenteante:")
imprimir_matriz(mat)
