def m_espiral(N):
    m=[[0]*N for j in range(N)]
    sup, inf=0,N-1
    izq, der=0,N-1
    num=1
    
    while num<=N*N:
        for i in range(izq,der+1):
            m[sup][i]=num
            num=num+1
        sup=sup+1
        for i in range(sup,inf+1):
            m[i][der]=num
            num=num+1
        der=der-1
        for i in range(der,izq-1,-1):
            m[inf][i]=num
            num=num+1
        inf=inf-1
        for i in range(inf,sup-1,-1):
            m[i][izq]=num
            num=num+1
        izq=izq+1
    for fila in m:
        print(" ".join(map(str, fila)))

N=int(input("Introduce un numero impar: "))
m_espiral(N)