/*Dado un lote de N numeros, formar dos nuevos numeros, el primer numero formado por los
pares y el segundo formado por los impares de cada numero del lote luego determine cual es mayor*/
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce N: ");
        int N = sc.nextInt();
        
        int P=0, IM=0;

        for (int i=1; i<=N; i++) {
            System.out.print("Introduce x: ");
            int x = sc.nextInt();
            
            if (x%2==0) {
                P=P*10+x;
            } else {
                IM=IM*10+x;
            }
        }

        if (P>IM) {
            System.out.println(P);
        } else {
            System.out.println(IM);
        }

        sc.close();
    }
}
