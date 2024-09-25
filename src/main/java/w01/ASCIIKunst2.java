package w01;

import java.util.Scanner;

public class ASCIIKunst2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Gib die Größe der Sanduhr an");
        int groesse = sc.nextInt();
        int x = 1;
        int y = 1;
        int staticgroesse = groesse;

        while (y <= staticgroesse) {
            while (x <= groesse) {
                System.out.print("* ");
                x++;
            }
            System.out.println();
            y++;
            groesse--;
            x = 1;
        }
        y = 2;
        groesse = 2;
        while (y <= staticgroesse) {
            while (x <= groesse) {
                System.out.print("* ");
                x++;
            }
            System.out.println();
            y++;
            groesse++ ;
            x = 1;
        }
    }
}
