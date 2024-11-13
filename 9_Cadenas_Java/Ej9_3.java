/*Descripcion: Una cadena se llama bailarina, si y solo si, la primera letra es mayuscula
y cada una de las demas letras es lo opuesto a la anterior letra (mayuscula, minuscula,
mayuscula, minuscula, ..., etc.). Ahora, debes construir un programa para que lea varios casos de
prueba y que convierta la cadena de texto en una cadena BAILARINA.
Entrada: La entrada consiste en un entero T numero de casos de prueba, seguido por
T lineas, cada una contiene una cadena de texto, puede ser que este vacia.
Salida: Imprimir una linea por cada caso de prueba, que contiene la cadena bailarina
resultado. */
import java.util.Scanner;

public class Ej9_3 {
    
    public static String bailarina(String w) {
        String s="";
        int c=1;

        for (int i=0; i < w.length(); i++) {
            char nc=w.charAt(i);
            int a=(int) nc;

            if (nc!=' ') {
                if (c%2==0) {
                    if ('A' <= nc && nc <= 'Z') {
                        a=a+32;  
                    }
                } else {
                    if ('a' <= nc && nc <= 'z') {
                        a=a-32;  
                    }
                }
                s=s+(char) a;
            } else {
                s=s+nc;
                c++;
            }
            c++;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero T de casos de prueba: ");
        int T = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer

        for (int i=1; i <= T; i++) {
            System.out.print("Introduce la cadena: ");
            String c = sc.nextLine();
            String ba = bailarina(c);
            System.out.println(ba);
        }
        sc.close();
    }
}
