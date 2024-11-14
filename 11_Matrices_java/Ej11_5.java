import java.util.Scanner;

public class Ej11_5 {
    
    public static int[][] m_pascal(int n) {
        int[][] m = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            m[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                m[i][j] = m[i - 1][j - 1] + m[i - 1][j];
            }
        }
        return m;
    }

    public static void imprimir_matriz(int[][] m) {
        for (int[] fila : m) {
            for (int elem : fila) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Intro n: ");
        int n = scanner.nextInt();
        scanner.close();
        int[][] pascal = m_pascal(n);
        imprimir_matriz(pascal);
    }
}
