/*Entrada: La cadena S y un numero entero R que representa el numero de rotaciones a
la derecha a realizar sobre la cadena S. S no tendra espacios.(1 ≤ Longitud de la cadena
S ≤ 40, 0 ≤ R ≤Longitud de S)
Salida: La cadena S despues de realizar R rotaciones a la derecha */
import java.util.Scanner;

public class Ej9_1 {

    public static String rot_der(String w, int e) {
        int cc = w.length();
        String sc1 = w.substring(0, cc - e);
        String sc2 = w.substring(cc - e);
        String nc = sc2 + sc1;
        return nc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cadena: ");
        String S = sc.nextLine();
        System.out.print("Introduce el número de rotaciones a la derecha: ");
        int R = sc.nextInt();
        
        String r = rot_der(S, R);
        System.out.println(r);
        
        sc.close();
    }
}
