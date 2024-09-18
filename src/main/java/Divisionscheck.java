import java.util.Scanner;

public class Divisionscheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Welcher Divisor soll geprüft werden?");
        int divisor = sc.nextInt();
        System.out.println("Bis zu welcher Zahl?");
        int max = sc1.nextInt();
        int Ergebnis = 0;
        while (Ergebnis <= max)
        {
            if(Ergebnis % divisor == 0){
                System.out.println(Ergebnis);
                Ergebnis = Ergebnis + 1;}
            else{
                Ergebnis = Ergebnis + 1;
            }
        }
    }}
