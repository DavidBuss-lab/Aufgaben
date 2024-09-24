import java.util.Scanner;

public class Primfaktorzerlegung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte eine Zahl für die Primfaktorzerlegung eingeben:");
        long zahl = sc.nextLong();
        long ergebnis = 0;
        long multiplikator1 = 2;
        long multiplikator1neu = 0;
        long multiplikator2neu = 0;
        long multiplikator2 = zahl;
        long testaufprimzahl = 1;
        boolean isPrim = true;
        boolean bool = true;
        boolean bool2 = true;
        boolean bool3 = true;

        while (bool3) {
            multiplikator2 = zahl;
            bool2 = true;
            bool = true;

            while (bool) {
                multiplikator1++;
                testaufprimzahl = 2;
                isPrim = true;
                while (testaufprimzahl < multiplikator1) {
                    while (multiplikator1 % testaufprimzahl == 0) {
                        isPrim = false;
                        testaufprimzahl++;
                    }
                    testaufprimzahl++;
                }
                while (isPrim) {
                    bool = false;
                    isPrim = false;
                }
            }
            bool = true;

            while (bool2) {
                bool = true;
                while (bool) {
                    multiplikator2--;
                    testaufprimzahl = 2;
                    isPrim = true;
                    while (testaufprimzahl < multiplikator2) {
                        while (multiplikator2 % testaufprimzahl == 0) {
                            isPrim = false;
                            testaufprimzahl++;
                        }
                        testaufprimzahl++;
                    }
                    while (isPrim) {
                        bool = false;
                        isPrim = false;
                    }
                }
                while (multiplikator1 == multiplikator2) {
                    bool2 = false;
                    break;
                }
                while (multiplikator1 * multiplikator2 == zahl) {
                    multiplikator1neu = multiplikator1;
                    multiplikator2neu = multiplikator2;
                    bool2 = false;
                    bool3 = false;
                    break;
                }
            }
        }
        while (multiplikator2neu != 1) {
            System.out.println(multiplikator1neu + " * " + multiplikator2neu + " = " + zahl);
            break;
        }
        while (multiplikator2neu == 1) {
            System.out.println("Es handelt sich um eine Primzahl, bei der keine Primfaktorzerlegung möglich ist");
            break;
        }
    }
}
