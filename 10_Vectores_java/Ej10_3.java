//Dado un vector de N terminos ordenarlos de manera ascendente
import java.util.Scanner;

public class Ej10_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el tamaño del vector: ");
        int N = scanner.nextInt();
        int[] v = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Introduce un elemento del vector: ");
            v[i] = scanner.nextInt();
        }

        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i] > v[j]) {
                    int temp = v[i];
                    v[i] = v[j];
                    v[j] = temp;
                }
            }
        }

        for (int i = 0; i < v.length; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(v[i]);
        }
        System.out.println();
        scanner.close();
    }
}
