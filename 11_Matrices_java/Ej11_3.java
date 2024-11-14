import java.util.Scanner;
public class Ej11_3 {
    
    public static void transMatriz(int[][] m) {
        int f = m.length;
        int c = m[0].length;
        int[][] tr = new int[c][f];
        
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                tr[j][i] = m[i][j];
            }
        }
        
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < f; j++) {
                System.out.print(tr[i][j]);
                if (j < f - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de filas: ");
        int f = scanner.nextInt();
        System.out.print("Introduce el número de columnas: ");
        int c = scanner.nextInt();
        int[][] m = new int[f][c];
        System.out.println("Introduce los valores de la matriz:");
        for (int i = 0; i < f; i++) {
            System.out.print("Fila " + (i + 1) + ": ");
            for (int j = 0; j < c; j++) {
                m[i][j] = scanner.nextInt();
            }
        }
        
        transMatriz(m);
        
        scanner.close();
    }
}
