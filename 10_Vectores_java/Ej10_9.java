//Dado un vector de tamano N de caracteres verificar si se puede formar una palabra palindormo 
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ej10_9 {
    
    public static boolean palin(char[] vc) {
        Map<Character, Integer> ct = new HashMap<>();

        for (char ch : vc) {
            ct.put(ch, ct.getOrDefault(ch, 0) + 1);
        }

        int imp = 0;
        for (int count : ct.values()) {
            if (count % 2 != 0) {
                imp++;
            }
        }

        return imp <= 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el numero de intentos: ");
        int T = scanner.nextInt();

        for (int j = 0; j < T; j++) {
            System.out.print("Introduce N (tamaño del vector): ");
            int N = scanner.nextInt();
            scanner.nextLine();

            char[] vc = new char[N];
            for (int i = 0; i < N; i++) {
                System.out.print("Introduce el carácter " + (i + 1) + ": ");
                vc[i] = scanner.nextLine().charAt(0);
            }

            if (palin(vc)) {
                System.out.println("Es palindromo");
            } else {
                System.out.println("No es palindromo");
            }
        }
        
        scanner.close();
    }
}
