import java.util.Scanner;

public class rückwärtsAusgeben {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gebe eine Zahl an, die Rückwärts ausgegeben werden soll:");
        String zahl = sc.nextLine();
        zahl = new StringBuffer(zahl).reverse().toString();
        System.out.println(zahl);

        System.out.println("Bitte noch eine Zahl eingeben");
        int zahl2 = sc.nextInt();
        int uzahl = 0;

        while (zahl2 != 0) {
            uzahl = uzahl * 10 + zahl2 % 10;
            zahl2 = zahl2 / 10;
        }
        System.out.println(uzahl);

    }
}
