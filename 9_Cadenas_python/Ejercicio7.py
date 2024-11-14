'''Queremos saber si ”Han Solo” o Chewbacca” esta hablando, ¿Como distinguimos quien esta
hablando?. Se sabe que Chewbacca solo conoce dos letras la a y r. Se te dara una cadena
23
y debes imprimir quien esta hablando, si esta hablando Chewbacca imprimir Chewbacca si
esta hablando Han Solo imprimir ”Han Solo”.'''

h = input("Introduce lo que se habla: ")
hab = "Chewbacca"
for i in h:
    if i != "a" and i != "r" and i != " ":
        hab = "Han Solo"
print(hab)

