package w01;

import java.util.Scanner;

public class Geometrie {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Bitte auswählen (1=Kreis ; 2=Rechteck)");
        int n = sc1.nextInt();

        while (n == 1) {
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Gebe einen Radius in cm an");
            double radius = sc2.nextDouble();
            double ErgebnisKreis = Math.PI * radius * radius;
            System.out.println("Ergebnis: " + ErgebnisKreis + "cm2");
            n = 30000000;
        }

        while (n == 2) {
            Scanner sc3 = new Scanner(System.in);
            Scanner sc4 = new Scanner(System.in);
            System.out.println("Gebe die Breite des Rechtecks in cm an");
            double breite = sc3.nextDouble();
            System.out.println("Gebe die Länge des Rechtecks an");
            double länge = sc4.nextDouble();
            double Ergebnis2 = breite * länge;
            System.out.println("Ergebnis: " + Ergebnis2 + "cm2");
            n = 3000000;
        }

    }
}