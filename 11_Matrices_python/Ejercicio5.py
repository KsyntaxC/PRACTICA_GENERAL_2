def m_pascal(n):
    m=[[0]*n for k in range(n)]
    for i in range(n):
        m[i][0]=1
        for j in range(1,i+1):
            m[i][j]=m[i-1][j-1]+m[i-1][j]
    return m

def matriz(m):
    for fila in m:
        print(" ".join(map(str, fila)))

n=int(input("Intro n: "))
pascal=m_pascal(n)
matriz(pascal)