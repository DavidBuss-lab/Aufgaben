package w01;

import java.util.Scanner;

public class PiAufDefinierteGenauigkeit {
    public static void main(String[] args) {
        double pi = 0;
        double klammer = 0;
        double zahl1 = 1;
        double zahl2 = 3;
        int it = 0;
        int i = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Wie viele Iterationen sollen gemacht werden um Pi zu berechnen?");
        it = sc.nextInt();

        while (i < it) {
            klammer = klammer + (1 / zahl1);
            klammer = klammer - (1 / zahl2);
            zahl1 = zahl1 + 4;
            zahl2 = zahl2 + 4;
            i++;
        }

        pi = 4 * klammer;

        while (pi == 0){
            pi = 4.0;
        }

        System.out.println(pi);

    }
}
