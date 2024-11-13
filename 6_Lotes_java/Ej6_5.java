//Sumar todos los digitos de los numeros ingresados hasta que se ingrese -1 sin adicionar este mismo
import java.util.Scanner;

public class Ej6_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce n: ");
        int n = sc.nextInt();
        int s=0;
        
        while (n!=-1) {
            int sd=0;
            
            while (n!=0) {
                int d=n%10;
                n=n/10;
                sd=d+d;
            }
            
            s=s+sd;
            System.out.print("Introduce n: ");
            n = sc.nextInt();
        }
        
        System.out.println(s);
        sc.close();
    }
}