package simplesorting;

public class sorting {

    private final int arr[];

    sorting(int a[]) {
        arr = a;
    }

    public void insSorting(Integer... args) {
        int in, out, inc;
        if (args.length == 0) {
            inc = 1;
        } else {
            inc = args[0];
        }
        for (out = 1; out < arr.length; out++) //out - разделитель
        {
            int temp = arr[out]; // Скопировать элемент на разделителе
            in = out; // Начать перемещения с out
            while (in > inc - 1 && arr[in - inc] >= temp) //Ищем наименьший
            {
                arr[in] = arr[in - inc]; //и пока не равен сдвигаем элемент вправо
                in = in - inc; // Перейти на одну позицию влево
            }
            arr[in] = temp; // Вставляем помеченный элемент
        }
    }

    public void shellSorting(int inc) {
        int incr = inc;
        if (incr == 1) {
            insSorting();
        } else {
            int h = 1;
            while (h <= arr.length / incr) { //Вычисление исходного значения h 
                h = h * incr; // (1,2,4,...)
            }
            while (h > 0) // Уменьшение h до 1
            {
                insSorting(h);
                h = (h) / incr; // Уменьшение h
            }
        }
    }

    void display() {
        System.out.println("Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" - ");
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    int[] getArray() {
        return arr;
    }

}
