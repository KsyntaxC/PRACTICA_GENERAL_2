//Dado un lote de N numeros, determinar los divisores de cada x numero
import java.util.Scanner;

public class Ej6_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Introduce N: ");
        int N=sc.nextInt();
        int i=0;
        
        while (i<N) {
            System.out.print("Introduce x: ");
            int x=sc.nextInt();
            int j=1;
            
            while (j<=x) {
                if (x%j==0) {
                    System.out.print(j+", ");
                }
                j=j+1;
            }
            
            System.out.println();
            i=i+1;
        }
        
        sc.close();
    }
}
