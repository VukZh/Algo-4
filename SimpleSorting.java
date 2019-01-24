package simplesorting;

import java.util.Arrays;

public class SimpleSorting {

    public static void main(String[] args) {

        int arraySize = 200000;
        int maxNumber = 200000;

        array_random_numbers Arr = new array_random_numbers(arraySize, maxNumber);//генерация массива случайных чисел
        int[] randomArray = Arr.getArray();

        sorting A1 = new sorting(randomArray);
        sorting A2 = new sorting(Arrays.copyOf(randomArray, randomArray.length)); //копирование массивов
        sorting A3 = new sorting(Arrays.copyOf(randomArray, randomArray.length));
//        Arr.display();
        System.out.println("---------");

        long timeStartA1 = System.currentTimeMillis();
        A1.insSorting();
        long timeStopA1 = System.currentTimeMillis() - timeStartA1;
//        A1.display();
        System.out.println("время выполнения сортировки вставкой " + timeStopA1 + " миллисекунд");
        System.out.println("---------");

        long timeStartA3 = System.currentTimeMillis();
        A3.shellSortingKnut();
        long timeStopA3 = System.currentTimeMillis() - timeStartA3;
//        A3.display();
        System.out.println("время выполнения сортировки Шелла с последовательностью Кнута " + timeStopA3 + " миллисекунд");
        System.out.println("---------");

        long timeStartA2 = System.currentTimeMillis();
        A2.shellSorting();
        long timeStopA2 = System.currentTimeMillis() - timeStartA2;
//        A2.display();
        System.out.println("время выполнения сортировки Шелла " + timeStopA2 + " миллисекунд");

    }

}
