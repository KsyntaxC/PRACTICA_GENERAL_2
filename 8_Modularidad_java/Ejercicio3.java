/*Dado un numero N, mostrar:
a) El enesimo primo.
b) El numero en base binaria.
c) La sumatoria de 1 a n */
import java.util.Scanner;

public class Ejercicio3 {

    public static int primo(int w) {
        int p=0;
        int i=2;
        
        while (w>0) {
            int c=1;
            int c2=0;
            
            while (c<=i) {
                if (i%c==0) {
                    c2=c2+1;
                }
                c=c+1;
            }
            
            if (c2==2) {
                p=i;
                w=w-1;
            }
            i=i+1;
        }
        
        return p;
    }

    public static int bin(int w) {
        if (w==0) {
            return 0;
        } else {
            return bin(w/2)*10+(w%2);
        }
    }

    public static int sum(int w) {
        int s=0;
        for (int i=1; i<=w; i++) {
            s=s+i;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce N: ");
        int N = sc.nextInt();
        
        int p=primo(N);
        int b=bin(N);
        int s=sum(N);
        
        System.out.println("El enésimo primo es: "+p);
        System.out.println("El binario es: "+b);
        System.out.println("La sumatoria hasta N es: "+s);
        
        sc.close();
    }
}
