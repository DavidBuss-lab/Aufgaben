package w01;

public class Arithmetischeoperationen {
    public static void main(String[] args) {
        int Var1 = 10;
        int Var2 = 10;
        while (++Var1 == Var2++) {
            System.out.println("Die Zahlen sind gleich");
            break;
        }
        while (++Var1 != Var2++) {
            System.out.println("Es ist nicht dasselbe");
            break;
        }
        System.out.println("Variable 1 (++Var) ist: " + Var1);
        System.out.println("Variable 2 (Var++) ist: " + Var2);
    }
}
