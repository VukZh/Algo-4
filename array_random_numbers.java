package simplesorting;

import static java.lang.Math.random;

public class array_random_numbers {

    private final int[] arr;
    private final int size;

    array_random_numbers(int s, int maxnumber) {
        size = s;
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (maxnumber * random());
//            arr[i] = size - i;
//            arr[i] = i;

        }
    }

    void display() {
        System.out.println("Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(" - ");
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    int[] getArray() {
        return arr;
    }

}
