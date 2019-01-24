package simplesorting;

public class sorting {

    private final int arr[];

    sorting(int a[]) {
        arr = a;
    }

    public void insSorting() {
        int in, out;
        for (out = 1; out < arr.length; out++) //out - разделитель
        {
            int temp = arr[out]; // Скопировать элемент на разделителе
            in = out; // Начать перемещения с out
            while (in > 0 && arr[in - 1] >= temp) //Ищем наименьший
            {
                arr[in] = arr[in - 1]; //и пока не равен сдвигаем элемент вправо
                --in; // Перейти на одну позицию влево
            }
            arr[in] = temp; // Вставляем помеченный элемент

//            for (int i = 0; i < arr.length; i++) {
//                System.out.print(" - " + arr[i]);                
//            }
        }
    }

    public void shellSortingKnut() {
        int in, out;
        int temp;
        int h = 1; // Вычисление исходного значения h 
        while (h <= arr.length / 3) {
            h = h * 3 + 1; // (1,4,13,...) - Кнут
        }
        while (h > 0) // Уменьшение h до 1
        {
            for (out = h; out < arr.length; out++) { // h-сортировка файла
                temp = arr[out];
                in = out;
                while (in > h - 1 && arr[in - h] >= temp) { //сортировка вставкой в подмассиве
                    arr[in] = arr[in - h];
                    in -= h;
                }
                arr[in] = temp;
            }
            h = (h - 1) / 3; // Уменьшение h по Кнуту
        }
    }

    public void shellSorting() {
        int in, out;
        int temp;
        int h = 1; // Вычисление исходного значения h 
        while (h <= arr.length / 2) {
            h = h * 2; // (1,2,4,...) - Щелл
        }
        while (h > 0) // Уменьшение h до 1
        {
            for (out = h; out < arr.length; out++) { // h-сортировка файла
                temp = arr[out];
                in = out;
                while (in > h - 1 && arr[in - h] >= temp) { //сортировка вставкой в подмассиве
                    arr[in] = arr[in - h];
                    in -= h;
                }
                arr[in] = temp;
            }
            h = (h) / 2; // Уменьшение h по Шеллу
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
