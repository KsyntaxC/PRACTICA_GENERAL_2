/*Descripcion: Dado 3 vectores de tamanos t
Entrada: primero se proporciona el tamano del vector, luego sus elementos
Salida: En la primera linea mostrar el tamano del vector t
En la segunda linea mostrar los elementos primos del vector t ordenado de forma descendente */
import java.util.ArrayList;
import java.util.Scanner;

public class Ej10_1 {

    public static boolean esPrimo(int w) {
        int c = 0;
        for (int i = 1; i <= w; i++) {
            if (w % i == 0) {
                c = c + 1;
            }
        }
        return c == 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> Z = new ArrayList<>();

        for (int u = 0; u < 3; u++) {
            System.out.print("Intro Tamano del Vector: ");
            int t = scanner.nextInt();
            ArrayList<Integer> l = new ArrayList<>();

            for (int i = 0; i < t; i++) {
                System.out.print("Introduce z elementos: ");
                int elemento = scanner.nextInt();
                l.add(elemento);
            }

            for (int i = 0; i < t; i++) {
                if (esPrimo(l.get(i))) {
                    Z.add(l.get(i));
                }
            }
        }

        for (int i = 0; i < Z.size(); i++) {
            for (int j = i + 1; j < Z.size(); j++) {
                if (Z.get(i) < Z.get(j)) {
                    int temp = Z.get(i);
                    Z.set(i, Z.get(j));
                    Z.set(j, temp);
                }
            }
        }
        System.out.println(Z.size());

        for (int i = 0; i < Z.size(); i++) {
            if (i > 0) {
                System.out.print("  ");
            }
            System.out.print(Z.get(i));
        }
        System.out.println();

        scanner.close();
    }
}
