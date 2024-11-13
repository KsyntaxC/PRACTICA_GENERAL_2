//Verificar si el numero "es primo" o "no es primo"
import java.util.Scanner;

public class Ej8_7 {

    public static boolean esPrimo(int w) {
        int c = 0;
        
        for (int i=1; i<=w; i++) {
            if (w%i==0) {
                c=c+1;
            }
        }
        
        if (c==2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introducir número: ");
        int n=sc.nextInt();
        
        if (esPrimo(n)) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
        
        sc.close();
    }
}
