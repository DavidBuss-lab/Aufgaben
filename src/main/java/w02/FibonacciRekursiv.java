package w02;

import java.util.Scanner;

public class FibonacciRekursiv {

    public static int fibonacci(int [] reihe, int n) {
        if (n < reihe.length - 2){
            reihe[n + 2] = reihe[n] + reihe[n + 1];
            n++;
            return fibonacci(reihe, n);
            }

        else {
            return n;
        }
    }
    public static void main(String[] args) {
        int zahl1 = 0;
        int zahl2 = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Gebe die Menge der Fibonaccizahlen ein, die berechnet werden sollen");
        int max = scan.nextInt();
        int [] ergebnis = new int[max];
        ergebnis[0] = 0;
        ergebnis[1] = 1;
        int n = 0;

        fibonacci(ergebnis,n);

        for (int i = 0; i < max; i++){
            System.out.print(ergebnis[i] + " ");
        }




    }
}
