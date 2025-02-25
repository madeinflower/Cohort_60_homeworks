package homeworks.homework16;

import java.util.Random;

public class Task5 {
    //Массивы
    //Task 5
    //Создать массив целых чисел произвольной длины от 5 до 15. Заполнить массив случайными значениями от -50 до 50.
    //Вывести на экран:
    //Минимальное значение в массиве
    //Максимальное значение в массиве
    //Среднее арифметическое всех значений в массиве

    public static void main(String[] args) {
        Random random = new Random();
        int length = random.nextInt(11) + 5;
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(101) - 50;
        }

        System.out.print("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        int min = array[0];
        int max = array[0];
        int sum = 0;

        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            sum += num;
        }

        double average = (double) sum / length;

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Average value: " + average);
    }
}
