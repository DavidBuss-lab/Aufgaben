package w02;

import java.util.Scanner;

public class ImmerPositiv {
    public static void main(String[] args) {
        System.out.println("Bitte gebe eine Zahl ein, die dann positiv ausgegeben werden sollte");
        Scanner scanner = new Scanner(System.in);
        int zahl = scanner.nextInt();

        if (zahl < 0) {
            zahl = zahl * -1;
        }
        System.out.println(zahl);
    }
}
