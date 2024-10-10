package w03.QueueList;

public class ArrayGenerator implements Methods {
    private static int[] array = {1, 2, 3, 4};

    @Override
    public int popFront() {

        int value = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;
        return value;
    }

    @Override
    public int popLast() {
        int temp = 1;
        int value = 0;
        while (value == 0) {
            value = array[array.length - temp];
            if (value == 0) {
                temp++;
            }
        }

        array[array.length - temp] = 0;
        return value;
    }

    @Override
    public int pushFront(int i) {
        if (array[array.length - 1] != 0) {
            int[] newArray = new int[array.length * 2];
            for (int j = 0; j < array.length; j++) {
                newArray[j] = array[j];
            }
            for (int j = array.length; j < newArray.length; j++) {
                newArray[j] = 0;
            }
            array = newArray;
        }
        for (int j = array.length - 1; j > 0; j--) {
            array[j] = array[j - 1];
        }
        array[0] = i;

        return array[0];
    }

    @Override
    public int pushLast(int i) {
        int position = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == 0) {
                position = j;
                break;
            }
        }

        if (array[array.length - 1] != 0) {
            int[] newArray = new int[array.length * 2];
            for (int j = 0; j < array.length; j++) {
                newArray[j] = array[j];
            }
            for (int j = array.length; j < newArray.length; j++) {
                newArray[j] = 0;
            }
            array = newArray;
        }
        array[position] = i;
        return array[position];
    }

    @Override
    public int get(int i) {
        return array[i];
    }

    public void printArray() {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\nDie länge des Arrays ist: " + array.length);
        System.out.println();
    }
}
