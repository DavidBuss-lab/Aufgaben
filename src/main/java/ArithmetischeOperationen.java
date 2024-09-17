public class ArithmetischeOperationen {
    public static void main(String[] args) {
        int Var1 = 10;
        int Var2 = 10;
        if(++Var1 == Var2++) {
            System.out.println("Die Zahlen sind gleich");
        }
        else{
            System.out.println("Es ist nicht dasselbe");
        }
        System.out.println("Variable 1 (++Var) ist: " + Var1);
        System.out.println("Variable 2 (Var++) ist: " + Var2);
    }
}
