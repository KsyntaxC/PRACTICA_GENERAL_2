/*Para que la contrasena sea segura debe cumplir las siguientes condiciones
Minimo una longitud de 10 caracteres.
Minimo 4 numeros.
Minimo 2 letras mayusculas.
Minimo 2 letras minusculas.
Debe contener al menos 1 caracter especial: *, !,#, <, > .
Entrada: La entrada consiste en un entero N que es el numero de contrasenas. 
Luego siguen N lineas, donde cada linea contiene una cadena S que es la contrasena.
Salida: Para cada contrasena, debes imprimir en una nueva linea Segura o Debil. */
import java.util.Scanner;

public class Ej9_9 {

    public static String dificultad(String S) {
        int cc = S.length();
        int num = 0;
        int may = 0;
        int min = 0;
        int esp = 0;

        for (int i = 0; i < S.length(); i++) {
            char l = S.charAt(i);
            if (l >= '0' && l <= '9') {
                num++;
            }
            if (l >= 'A' && l <= 'Z') {
                may++;
            }
            if (l >= 'a' && l <= 'z') {
                min++;
            }
            if (l == '*' || l == '!' || l == '#' || l == '<' || l == '>') {
                esp++;
            }
        }

        if (cc >= 10 && num >= 4 && may >= 2 && min >= 2 && esp >= 1) {
            return "Segura";
        } else {
            return "Debil";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número de contraseñas: ");
        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= N; i++) {
            System.out.print("Introduce contraseña: ");
            String S = scanner.nextLine();
            String dif = dificultad(S);
            System.out.println(dif);
        }

        scanner.close();
    }
}