package w02;

import java.util.Scanner;

public class Schaltjahre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gebe ein Jahr ein, welches überprüft werden soll");
        int jahr = sc.nextInt();

        if (jahr % 4 != 0 || (jahr % 100 == 0 && jahr % 400 != 0)) {
            System.out.println("Dieses Jahr ist kein Schaltjahr");
        }
        else {
            System.out.println("Dieses Jahr ist ein Schaltjahr");
        }
    }
}
