package homeworks.homework16;

import java.util.Arrays;

public class Task6 {
    //Дан массив целых чисел. Поменять местами элементы с максимальным и минимальным значениями.
    //Пример:
    //{ 5, 6, -25, 0, 31, -15 } -> { 5, 6, 31, 0, -25, -15 }

    public static void main(String[] args) {
        int[] array = {5, 6, -25, 0, 31, -15};

        System.out.println("Original array: " + Arrays.toString(array));

        int minIndex = 0, maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;

        System.out.println("Modified array: " + Arrays.toString(array));
    }
}
