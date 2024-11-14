def leer_matriz(fl,cl):
    m=[]
    print("Ingrese los elementos de la matriz (cada elemento debe tener tres dígitos):")
    for i in range(fl):
        f=[]
        for j in range(cl):
            n=int(input(f"Elemento [{i+1},{j+1}]: "))
            while n<100 or n>999:
                print("Por favor, ingrese un número de tres dígitos.")
                n=int(input(f"Elemento [{i+1},{j+1}]: "))
            f.append(n)
        m.append(f)
    return m

def d_centrales(m):
    r=[]
    for fila in m:
        nf=[]
        for n in fila:
            dc=str(n)[1]
            nf.append(int(dc))
        r.append(nf)
    return r

def imprimir_matriz(m):
    for fila in m:
        print(" ".join(map(str, fila)))
        
fl=int(input("Ingrese el número de filas: "))
ccl=int(input("Ingrese el número de columnas: "))
M=leer_matriz(fl, ccl)
R=d_centrales(M)
print("\nMatriz R con los dígitos centrales de cada elemento:")
imprimir_matriz(R)