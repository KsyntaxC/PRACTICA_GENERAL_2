/*Mediante funciones disene una calculadora basica que acepta un simbolo que representa una
operacion: ˆ, ∗, +, −, !, b. Luego se leen los operandos a y b del calculo a realizar, en el caso
del simbolo ! (factorial) y b (conversion a binario) solo se lee un operando.
Escriba un programa que lee un entero N el numero de operaciones a realizar, le siguen N ∗ 2
lineas, en la primera linea de cada caso se escribe el operador, y en la segunda los operadores.
En la salida para cada operacion realizada se muestra el resultado. */
import java.util.Scanner;

public class Ej8_9 {

    public static int Expo(int a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el exponente de a: ");
        int b=sc.nextInt();
        int r=(int) Math.pow(a,b);
        return r;
    }

    public static int Mult(int a) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce el numero a multiplicar a: ");
        int b=sc.nextInt();
        int r=a*b;
        return r;
    }

    public static int Sum(int a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el valor que se sumara: ");
        int b=sc.nextInt();
        int r=a+b;
        return r;
    }

    public static int Rest(int a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el valor que se restara: ");
        int b=sc.nextInt();
        int r=a-b;
        return r;
    }

    public static int facto(int w) {
        int r=1;
        for (int i=1; i<=w; i++) {
            r=r*i;
        }
        return r;
    }

    public static int bin(int w) {
        if (w==0) {
            return 0;
        } else {
            return bin(w/2) *10+(w%2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero de ejercicios que realizara: ");
        int N=sc.nextInt();
        
        for (int i=1; i<=N; i++) {
            System.out.print("Bien, ahora ingrese un simbolo entre ^, *, +, -, !, b: ");
            String s=sc.next();
            System.out.print("Intro a: ");
            int a=sc.nextInt();
            int r;

            if (s.equals("^")) {
                r=Expo(a);
            } else if (s.equals("*")) {
                r=Mult(a);
            } else if (s.equals("+")) {
                r=Sum(a);
            } else if (s.equals("-")) {
                r=Rest(a);
            } else if (s.equals("!")) {
                r=facto(a);
            } else if (s.equals("b")) {
                r=bin(a);
            } else {
                System.out.println("Ingrese un simbolo valido");
                continue;
            }
            System.out.println(r);
        }
        sc.close();
    }
}
