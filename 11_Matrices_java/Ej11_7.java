import java.util.Scanner;

public class Ej11_7 {

    public static int[][] leerMatriz(int filas, int columnas) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[filas][columnas];
        
        System.out.println("Ingrese los elementos de la matriz (cada elemento debe tener tres dígitos):");
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + (i + 1) + "," + (j + 1) + "]: ");
                int numero = scanner.nextInt();
                while (numero < 100 || numero > 999) {
                    System.out.println("Por favor, ingrese un número de tres dígitos.");
                    System.out.print("Elemento [" + (i + 1) + "," + (j + 1) + "]: ");
                    numero = scanner.nextInt();
                }
                
                matriz[i][j] = numero;
            }
        }
        return matriz;
    }

    public static int[][] obtenerDigitosCentrales(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] resultado = new int[filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                String numeroStr = Integer.toString(matriz[i][j]);
                int digitoCentral = Character.getNumericValue(numeroStr.charAt(1));
                resultado[i][j] = digitoCentral;
            }
        }
        return resultado;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();
        int[][] M = leerMatriz(filas, columnas);
        int[][] R = obtenerDigitosCentrales(M);
        System.out.println("\nMatriz R con los dígitos centrales de cada elemento:");
        imprimirMatriz(R);
        
        scanner.close();
    }
}
