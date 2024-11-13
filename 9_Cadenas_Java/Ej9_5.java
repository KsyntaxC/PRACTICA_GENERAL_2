import java.util.Scanner;

public class Ej9_5 {

    public static int numPal(String b) {
        b = b + " ";
        int c = 0;
        int lc = b.length();
        for (int i = 1; i <= lc; i++) {
            String y = b.substring(i - 1, i);
            if (y.equals(" ")) {
                c++;
            }
        }
        return c;
    }

    // Función para extraer la palabra en la posición k de una cadena
    public static String sacPal(String b, int k) {
        b = b + " ";
        int c = 0;
        String w = "";
        String v = "";
        int lc = b.length();
        for (int i = 1; i <= lc; i++) {
            String y = b.substring(i - 1, i);
            if (y.equals(" ")) {
                c++;
                if (c == k) {
                    w = v;
                }
                v = "";
            } else {
                v = v + y;
            }
        }
        return w;
    }

    // Función para convertir una palabra a minúsculas
    public static String minus(String p) {
        String r = "";
        for (int i = 0; i < p.length(); i++) {
            char l = p.charAt(i);
            if ('A' <= l && l <= 'Z') {
                int a = (int) l + 32;
                r = r + (char) a;
            } else {
                r = r + l;
            }
        }
        return r;
    }

    // Función para capitalizar la primera letra y convertir el resto a minúsculas
    public static String mayPrim(String f) {
        int i = 0;
        while (i < f.length() && f.charAt(i) == ' ') {
            i++;
        }
        
        String r = "";
        if (i < f.length() && 'a' <= f.charAt(i) && f.charAt(i) <= 'z') {
            r = r + (char) (f.charAt(i) - 32);
        } else {
            r = r + (i < f.length() ? f.charAt(i) : "");
        }

        for (int j = i + 1; j < f.length(); j++) {
            if ('A' <= f.charAt(j) && f.charAt(j) <= 'Z') {
                r = r + (char) (f.charAt(j) + 32);
            } else {
                r = r + f.charAt(j);
            }
        }
        
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Entradas
        System.out.print("Introduce tu frase: ");
        String b = sc.nextLine();
        System.out.print("Introduce tu frase numero 2: ");
        String h = sc.nextLine();
        
        // Procesamiento
        int nb = numPal(b);
        int nh = numPal(h);
        int mp = nb + nh;
        String r = "";

        for (int i = 1; i <= mp; i++) {
            if (i <= nb) {
                String pb = sacPal(b, i);
                pb = minus(pb);
                r = r + pb + " ";
            }
            if (i <= nh) {
                String ph = sacPal(h, i);
                ph = minus(ph);
                r = r + ph + " ";
            }
        }
        
        // Capitalizar la primera letra y convertir el resto en minúsculas
        r = mayPrim(r);
        
        // Imprimir el resultado
        System.out.println(r);
        
        sc.close();
    }
}
