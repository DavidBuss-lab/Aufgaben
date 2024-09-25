package w01;

import java.util.Scanner;

public class Rückwärtsausgeben {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gebe eine Zahl an, die Rückwärts ausgegeben werden soll:");
        String zahl = sc.nextLine();
        String ergebnis = "";
        int currentl = zahl.length() - 1;

        while (currentl >= 0) {
            ergebnis = ergebnis + zahl.charAt(currentl);
            currentl--;
        }
        System.out.println(ergebnis);


        System.out.println("Bitte noch eine Zahl eingeben");
        int zahl2 = sc.nextInt();
        int uzahl = 0;

        while (zahl2 != 0) {
            uzahl = uzahl * 10 + zahl2 % 10;
            zahl2 = zahl2 / 10;
        }
        System.out.println(uzahl);

    }
}
