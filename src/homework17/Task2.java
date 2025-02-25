package homeworks.homework17;

public class Task2 {
    //Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.
    //{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]
    //Copy
    //Перегрузить метод, если в него приходит массив + индекс, то часть массива слева до этого индекса распечатывается в обычном порядке, а начиная с этого индекса в обратном:
    //{1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]

    public static void main(String[] args) {
        int[] array = {1, 4, 3, 6, 7};

        printReversedArray(array);

        printPartiallyReversedArray(array, 2);
    }

    public static void printReversedArray(int[] array) {
        System.out.print("Reversed array: [");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void printPartiallyReversedArray(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            System.out.println("Invalid index");
            return;
        }

        System.out.print("Partially reversed array: [");
        // Выводим левую часть в обычном порядке
        for (int i = 0; i <= index; i++) {
            System.out.print(array[i]);
            System.out.print(i == index ? ", " : ", ");
        }
        for (int i = array.length - 1; i > index; i--) {
            System.out.print(array[i]);
            if (i > index + 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
