import java.util.Scanner;

public class Fibonaccizahlen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Gib eine maximale Zahl ein");
        int n = sc.nextInt();
        int max = 0;
        int current1 = 0;
        int current2 = 1;
        int temp = 0;

        while (max <= n) {
            System.out.print(max + " ");
            temp++ ;

            while (temp == 1){
                System.out.print(1 + " ");
                temp++ ;
            }

            max = current1 + current2;
            current1 = current2;
            current2 = max;
        }

    }
}
