/*Descripcion: Dado un lote de T numeros mostrar cuantos numeros son palındromos
Utilizar al menos 2 funciones o procedimientos.
Salida: Por cada numero N leido de teclado debe haber una salida que indique cuantos
numeros son palındromos*/
import java.util.Scanner;

public class Ej8_1 {
    
    public static int Comp(int w) {
        int nn=0;
        while (w!=0) {
            int d=w%10;
            w=w/10;
            nn=nn*10+d;
        }
        return nn;
    }

    public static int pal(int w) {
        int P;
        if (w==Comp(w)) {
            P=1;
        } else {
            P=0;
        }
        return P;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce T (El numero de numeros a verificar): ");
        int T=sc.nextInt();
        int s=0;
        
        for (int i=1; i<=T; i++) {
            System.out.print("Introduce N: ");
            int N = sc.nextInt();
            s=s+pal(N);
        }
        
        System.out.println("Hay "+s+" palindromos");
        sc.close();
    }
}
