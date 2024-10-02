package w01;

import java.util.Scanner;

public class Kassiersystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte alle Produkte in Cent eingeben und mit 0 die Liste beenden");

        long gesamt = 0L;
        long produkte = 1L;
        long euro = 0L;
        long cent = 0L;

        while (produkte != 0) {
            produkte = sc.nextLong();
            gesamt = gesamt + produkte;
        }

        euro = gesamt / 100;
        cent = gesamt % 100;
        boolean bool = true;

        System.out.println("Der Gesamt-Betrag ist " + euro + " Euro und " + cent + " Cent");

        System.out.println("Gebe den Betrag in Cent an, den der Kunde dir gegeben hat");
        long geld = sc.nextInt();

        geld = geld - gesamt;

        while (geld >= 0) {

            long zweihundert = geld / 20000;
            geld = geld % 20000;
            long hundert = geld / 10000;
            geld = geld % 100000;
            long fuenfzig = geld / 5000;
            geld = geld % 5000;
            long zwanzig = geld / 2000;
            geld = geld % 2000;
            long zehn = geld / 1000;
            geld = geld % 1000;
            long fuenf = geld / 500;
            geld = geld % 500;
            long zwei = geld / 200;
            geld = geld % 200;
            long eins = geld / 100;
            geld = geld % 100;
            long fuenfzigc = geld / 50;
            geld = geld % 50;
            long zwanzigc = geld / 20;
            geld = geld % 20;
            long zehnc = geld / 10;
            geld = geld % 10;
            long fuenfc = geld / 5;
            geld = geld % 5;
            long zweic = geld / 2;
            geld = geld % 2;
            long einc = geld;


            System.out.println("\nDas musst du zurückgeben: ");
            System.out.println("200 Euro: " + zweihundert);
            System.out.println("100 Euro: " + hundert);
            System.out.println("50 Euro: " + fuenfzig);
            System.out.println("20 Euro: " + zwanzig);
            System.out.println("10 Euro: " + zehn);
            System.out.println("5 Euro: " + fuenf);
            System.out.println("2 Euro: " + zwei);
            System.out.println("1 Euro: " + eins);
            System.out.println("50 cent: " + fuenfzigc);
            System.out.println("20 cent: " + zwanzigc);
            System.out.println("10 cent: " + zehnc);
            System.out.println("5 cent: " + fuenfc);
            System.out.println("2 cent: " + zweic);
            System.out.println("1 cent: " + einc);

            bool = false;
            break;

        }

        while (bool) {
            while (geld < gesamt) {
                System.out.println("Da fehlt aber noch was, so geht das nicht");
                bool = false;
                break;
            }
        }





    }
}
