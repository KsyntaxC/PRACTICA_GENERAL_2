def trans_matriz(m):
    f = len(m)
    c = len(m[0])
    tr = [[0] * f for _ in range(c)]
    for i in range(f):
        for j in range(c):
            tr[j][i] = m[i][j]
    for fila in tr:
        print(" ".join(map(str, fila)))

f=int(input("Introduce el número de filas: "))
c=int(input("Introduce el número de columnas: "))
m = []
print("Introduce los valores de la matriz:")
for i in range(f):
    fl = list(map(int, input(f"Fila {i + 1}: ").split()))
    m.append(fl)
trans_matriz(m)