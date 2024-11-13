//Determinar la primalidad de un numero, 1 si es primo, 0 en caso contrario
import java.util.Scanner;

public class Ej8_5 {

    public static int esPrimo(int w) {
        int c=0;
        
        for (int i=1; i<=w; i++) {
            if (w%i==0) {
                c=c+1;
            }
        }
        
        if (c==2) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el número: ");
        int n = sc.nextInt();
        
        int p=esPrimo(n);
        System.out.println(p);
        
        sc.close();
    }
}
