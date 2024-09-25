package w01;

import java.util.Scanner;

public class Quersumme {
    public static void main(String[] args) {

        System.out.println("Bitte ganze Zahl eingeben (long)");
        Scanner scanner = new Scanner(System.in);
        long zahllong = scanner.nextLong();
        int quersumme = 0;
        int quersumme2 = 0;

        while (zahllong != 0) {
            quersumme += zahllong % 10;
            zahllong = zahllong / 10;
        }

        System.out.println("Ergebnis: " + quersumme);

        System.out.println("Bitte ganze Zahl eingeben (string)");
        String zahlstring = scanner.next();
        int zahl = Integer.parseInt(zahlstring);

        while (zahl != 0) {
            quersumme2 += zahl % 10;
            zahl = zahl / 10;
        }
        System.out.println("Ergebnis: " + quersumme);
    }
}
