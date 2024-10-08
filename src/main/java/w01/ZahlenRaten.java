package w01;

import java.util.Random;
import java.util.Scanner;

public class ZahlenRaten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bitte geben Sie eine maximale Zahlengröße in Bit ein: ");
        int max = sc.nextInt();
        max = (int) (Math.pow(2, max) - 1);
        int eingabe = -1;
        int zufallszahl = random.nextInt(max);
        int counter = 1;

        while (eingabe != zufallszahl) {
            System.out.println(counter + ". Versuch: Bitte eine Zahl im Bereich 0 und " + max + " angeben:");
            eingabe = sc.nextInt();
            if (eingabe < zufallszahl) {
                System.out.println("Die Zahl ist größer");
            } else if (eingabe > zufallszahl) {
                System.out.println("Die Zahl ist kleiner");
            }
            counter++;
        }
        System.out.println("Das ist die richtige Zahl");
    }
}
