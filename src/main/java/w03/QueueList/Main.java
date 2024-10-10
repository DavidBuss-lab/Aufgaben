package w03.QueueList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("Welche Aktion möchtest du ausführen? (1 - Popfront ; 2 - Poplast ; 3 - Pushfront ; 4 - Pushlast ; 5 - Array printen)");
            ArrayGenerator arrayGen = new ArrayGenerator();

            int auswahl = sc.nextInt();
            switch (auswahl) {
                case 1:
                    System.out.println(arrayGen.popFront());
                    break;
                case 2:
                    System.out.println(arrayGen.popLast());
                    break;
                case 3:
                    System.out.println("Bitte gebe eine Zahl (nicht 0) an, die vorne an das Array gehangen werden soll");
                    int front = sc.nextInt();
                    arrayGen.pushFront(front);
                    break;
                case 4:
                    System.out.println("Bitte gebe eine Zahl (nicht 0) an, die hinten an das Array gehangen werden soll");
                    int last = sc.nextInt();
                    arrayGen.pushLast(last);
                    break;
                case 5:
                    arrayGen.printArray();
                    break;
            }
        }
    }
}
