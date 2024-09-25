package w01;

import java.util.Scanner;

public class ASCIIKunst {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Wähle zwischen Viereck (1) und Dreieck (2) aus:");
        int auswahl = sc1.nextInt();
        int a = 0;
        int b = 0;

        while (auswahl == 1) {
            System.out.println("Wie groß soll das Viereck werden?");
            int groesse = sc1.nextInt();
            while (b < groesse) {
                while (a < groesse - 1) {
                    System.out.print("*");
                    a = a + 1;
                }
                System.out.println("*");
                b = b + 1;
                a = 0;
            }
            auswahl = 3;

        }
        while (auswahl == 2) {
            System.out.println("Wie viele Lagen soll das Dreieck haben?");
            int lagen = sc1.nextInt();
            while (b < lagen) {
                while (a < b) {
                    System.out.print("*");
                    a = a + 1;
                }

                System.out.println("*");
                b = b + 1;
                a = 0;
            }
            auswahl = 3;
        }
    }
}
