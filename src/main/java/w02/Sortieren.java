package w02;

import java.util.Scanner;

public class Sortieren {
    public static void sortieren (int[] ergebnis) {
        int n = ergebnis.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ergebnis[j] > ergebnis[j + 1]) {
                    int temp = ergebnis[j];
                    ergebnis[j] = ergebnis[j + 1];
                    ergebnis[j + 1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] zahl =  {10,3,11,9,22,4,30000,-12,33};
        int position = 0;

        System.out.println("Schleife vor der Sortierung:");
        for (int w = 0; w < zahl.length; w++) {
            System.out.print(zahl[w] + " ");
        }
        System.out.println("\nSchleife nach der Sortierung:");
        sortieren(zahl);

        for (int q=0; q < zahl.length; q++) {
            System.out.print(zahl[q] + " ");
        }

    }
}
