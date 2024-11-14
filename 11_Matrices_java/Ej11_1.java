import java.util.Scanner;

public class Ej11_1 {
    public static void mEspiral(int N) {
        int[][] m = new int[N][N];
        int sup = 0, inf = N - 1;
        int izq = 0, der = N - 1;
        int num = 1;

        while (num <= N * N) {
            for (int i = izq; i <= der; i++) {
                m[sup][i] = num;
                num++;
            }
            sup++;

            for (int i = sup; i <= inf; i++) {
                m[i][der] = num;
                num++;
            }
            der--;

            for (int i = der; i >= izq; i--) {
                m[inf][i] = num;
                num++;
            }
            inf--;

            for (int i = inf; i >= sup; i--) {
                m[i][izq] = num;
                num++;
            }
            izq++;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(m[i][j]);
                if (j < N - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero impar: ");
        int N = scanner.nextInt();

        if (N % 2 == 0 || N < 1 || N > 31) {
            System.out.println("Por favor, introduce un número impar entre 1 y 31.");
        } else {
            mEspiral(N);
        }

        scanner.close();
    }
}
