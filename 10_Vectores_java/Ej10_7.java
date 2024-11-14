/*Se te da una secuencia de numeros enteros. Debes imprimir la suma alternada de esta secuencia. 
Entrada: La primera linea de la prueba contiene t casos de prueba.
La primera linea de cada caso de prueba contiene la longitud de la secuencia. 
La segunda linea del caso de prueba contiene n numeros enteros
Salida: imprime la suma alternada requerida de los numeros. */
import java.util.Scanner;

public class Ej10_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de casos de prueba: ");
        int t = sc.nextInt();

        for (int j = 0; j < t; j++) {
            System.out.print("Introduce la longitud de la secuencia: ");
            int l = sc.nextInt();

            int[] ar = new int[l];
            for (int i = 0; i < l; i++) {
                System.out.print("Introduce los elementos de la secuencia: ");
                ar[i] = sc.nextInt();
            }

            int sa = 0;
            for (int i = 0; i < ar.length; i++) {
                if (i % 2 == 0) {
                    sa += ar[i];
                } else {
                    sa -= ar[i];
                }
            }

            System.out.println(sa);
        }

        sc.close();
    }
}