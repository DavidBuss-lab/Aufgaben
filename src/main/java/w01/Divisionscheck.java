package w01;

import java.util.Scanner;

public class Divisionscheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcher Divisor soll geprüft werden?");
        int divisor = sc.nextInt();

        System.out.println("Bis zu welcher Zahl?");
        int max = sc.nextInt();
        Boolean bool = true;

        int ergebnis = 0;
        while (ergebnis <= max) {
            while (ergebnis % divisor == 0) {
                System.out.println(ergebnis);
                ergebnis = ergebnis + 1;
            }
                ergebnis = ergebnis + 1;
        }
    }
}
