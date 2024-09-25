package w02;

import java.util.Scanner;

public class QuadratischeGleichung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gebe drei Variablen Formel: ax^2 + bx + c");
        System.out.println("a:");
        double a = sc.nextDouble();
        System.out.println("b:");
        double b = sc.nextDouble();
        System.out.println("c:");
        double c = sc.nextDouble();

        double diskriminante = b * b - 4 * a * c;

        if (diskriminante < 0) {
            System.out.println("Keine Nullstelle");
        } else if (diskriminante == 0) {
            System.out.println("Eine Nullstelle");
        } else {
            System.out.println("Zwei Nullstellen");
        }
    }
}
