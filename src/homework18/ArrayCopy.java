package homework18;

//Написать метод со следующим функционалом:
//На вход метод принимает массив целых чисел и число - длину нового массива. Метод должен создать и распечатать массив заданной в параметрах длинны. В начало массива должны быть скопированы элементы из входящего массива:
//{0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
//Copy
//{0, 1, 2} -> copyOfArray(array, 5) -> вывод на печать {0, 1, 2, 0, 0}
//Copy
//Arrays.copyOf() использовать нельзя. Суть задачи - написать собственную реализацию этого метода

public class ArrayCopy {

    public static void main(String[] args) {
        int[] array1 = {0, 1, 2, 3, 4, 5, 6};
        int[] array2 = {0, 1, 2};

        copyOfArray(array1, 3);
        copyOfArray(array2, 5);
    }

    public static void copyOfArray(int[] original, int newLength) {
        int[] newArray = new int[newLength];

        for (int i = 0; i < original.length && i < newArray.length; i++) {
            newArray[i] = original[i];
        }

        System.out.print("{");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]);
            if (i < newArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}

