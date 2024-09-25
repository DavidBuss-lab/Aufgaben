import java.util.Scanner;

public class Allesgroß {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String eingabe = sc.nextLine();
        int currentl = 0;
        int currentint = 0;
        String ergebnis = "";

        while (currentl < eingabe.length()) {
            currentint = eingabe.charAt(currentl);
            currentint = currentint - 32;

            while (currentint == 0) {
                currentint = 32;
            }

            ergebnis = ergebnis + (char) currentint;
            currentl++;
        }
        System.out.println(ergebnis);
    }
}
