/*Se tiene un sistema de clasificacion de equipos, cuyos puntajes son determinados de la siguiente manera. 
Cada equipo ha jugado 8 partidos
Cada victoria vale 3 puntos, cada empate 1 punto y cada derrota 0 puntos. 
Se sabe que clasificaran los 4 puntajes mas altos. Mostrar los 4 puntajes de clasificacion.
Entrada: La entrada consiste en un numero N(1 ≤ N ≤ 9) que seria el numero de equipos, y
seguidamente se leen N lineas con 3 enteros a, b, c, que consistiran en el numero de victorias,
empates y derrotas respectivamente, los cuales sumados deben ser 8.*/
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Introduce N: ");
        int N = sc.nextInt();
        
        int P4=0, P3=0, P2=0, P1=0;

        for (int i=1; i<=N; i++) {
            int sw = 0;
            
            while (sw==0) {
                System.out.print("Introduce a (victorias): ");
                int a = sc.nextInt();
                System.out.print("Introduce b (empates): ");
                int b = sc.nextInt();
                System.out.print("Introduce c (derrotas): ");
                int c = sc.nextInt();
                
                if (a+b+c==8) {
                    sw=1;
                } else {
                    System.out.println("La suma de a, b y c debe ser 8");
                }

                int P=a*3+b;

                if (P>P4) {
                    P4=P;
                    if (P>P3) {
                        P4=P3;
                        P3=P;
                        if (P>P2) {
                            P3=P2;
                            P2=P;
                            if (P>P1) {
                                P2=P1;
                                P1=P;
                            }
                        }
                    }
                }
            }
        }

        System.out.println("Puntaje de clasificacion 1: "+P1);
        System.out.println("Puntaje de clasificacion 2: "+P2);
        System.out.println("Puntaje de clasificacion 3: "+P3);
        System.out.println("Puntaje de clasificacion 4: "+P4);

        sc.close();
    }
}
