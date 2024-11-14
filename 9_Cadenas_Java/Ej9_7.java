/*Queremos saber si ”Han Solo” o Chewbacca” esta hablando, ¿Como distinguimos quien esta
hablando?. Se sabe que Chewbacca solo conoce dos letras la a y r. Se te dara una cadena
y debes imprimir quien esta hablando, si esta hablando Chewbacca imprimir Chewbacca si
esta hablando Han Solo imprimir ”Han Solo”.*/
import java.util.Scanner;

public class Ej9_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce lo que se habla: ");
        String C = scanner.nextLine();
        String h = "Chewbacca";
        
        for (int i = 0; i < C.length(); i++) {
            if (C.charAt(i) != 'a' && C.charAt(i) != 'r' && C.charAt(i) != ' ') {
                h = "Han Solo";
            }
        }
        
        System.out.println(h);
        scanner.close();
    }
}
