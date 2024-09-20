import java.util.Scanner;

public class TestaufPrimzahl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bool = true;
        System.out.println("Bitte Zahl für den Primetest eingeben:");
        long zahl = sc.nextLong();
        int Ergebnis = 2;
        while (Ergebnis < zahl) {
            while (zahl % Ergebnis == 0) {
                bool = false;
                Ergebnis = Ergebnis + 1;
            }
            Ergebnis = Ergebnis + 1;
        }
        while (bool) {
            System.out.println("Es handelt sich um eine Primzahl");
            break;
        }
        while (!bool) {
            System.out.println("Es handelt sich um keine Primzahl");
            break;
        }
    }
}


