import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ej11_9 {

    public static ArrayList<ArrayList<Integer>> m_serp(int n, int m) {
        ArrayList<ArrayList<Integer>> ma = new ArrayList<>();
        int nu = 1;
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> f = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                f.add(nu);
                nu++;
            }
            if (i % 2 == 1) {
                Collections.reverse(f);
            }
            ma.add(f);
        }
        return ma;
    }

    public static void imprimir_matriz(ArrayList<ArrayList<Integer>> matriz) {
        for (ArrayList<Integer> fila : matriz) {
            for (Integer valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de N (filas): ");
        int n = scanner.nextInt();
        System.out.print("Ingrese el valor de M (columnas): ");
        int m = scanner.nextInt();
        ArrayList<ArrayList<Integer>> mat = m_serp(n, m);
        System.out.println("\nMatriz serpenteante:");
        imprimir_matriz(mat);

        scanner.close();
    }
}
