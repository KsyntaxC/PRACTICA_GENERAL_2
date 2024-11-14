'''Queremos saber si ”Han Solo” o Chewbacca” esta hablando, ¿Como distinguimos quien esta
hablando?. Se sabe que Chewbacca solo conoce dos letras la a y r. Se te dara una cadena
y debes imprimir quien esta hablando, si esta hablando Chewbacca imprimir Chewbacca si
esta hablando Han Solo imprimir ”Han Solo”.'''

C = input("Introduce lo que se habla: ")
h = "Chewbacca"
for i in C:
    if i!="a" and i!="r" and i!=" ":
        h="Han Solo"
print(h)

