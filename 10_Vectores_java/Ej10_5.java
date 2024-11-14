/*Dado un arreglo de numeros de tamano par, se pide mostrar si la suma de elementos
pares[0, 2, 4...] es mayor a la suma de elementos impares[1, 3, 5...]. */
import java.util.Scanner;
public class Ej10_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el tamaño del arreglo (debe ser par): ");
        int N = scanner.nextInt();
        int[] ar = new int[N];
        
        for (int i = 0; i < N; i++) {
            System.out.print("Introduce un elemento del arreglo: ");
            ar[i] = scanner.nextInt();
        }
        
        int sp = 0;
        int sim = 0;
        
        for (int i = 0; i < ar.length; i++) {
            if (i % 2 == 0) {
                sp = sp + ar[i];
            } else {
                sim = sim + ar[i];
            }
        }
        if (sp > sim) {
            System.out.println("La suma de mayor tamaño son los elementos pares");
            System.out.println(sp);
        } else {
            System.out.println("La suma de mayor tamaño son los elementos impares");
            System.out.println(sim);
        }
        
        scanner.close();
    }
}
