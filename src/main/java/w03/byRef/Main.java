package w03.byRef;

public class Main {
    public static void main(String[] args) {
        int i = 10;
    ByRef byRef = new ByRef();

    byRef.doubleValue(i);

    System.out.println(byRef.i);
    }
}
