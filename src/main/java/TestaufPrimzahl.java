import java.util.Scanner;

public class TestaufPrimzahl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bool = true;
        System.out.println("Bitte Zahl für den Primetest eingeben:");
        long zahl = sc.nextLong();
        int Ergebnis = 2;
        while (Ergebnis < zahl) {
            if (zahl % Ergebnis == 0) {
                bool = false;
                Ergebnis = Ergebnis + 1;
            } else {
                Ergebnis = Ergebnis + 1;
            }
        }
        if (bool) {
            System.out.println("Es handelt sich um eine Primahl");
        } else {
            System.out.println("Es handelt sich um keine Primzahl");
        }
    }
}
