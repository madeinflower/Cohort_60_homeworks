package homework23;

//Инкапсулировать класс нашего магического массива
//Написать метод public int[] toArray() возвращающий массив, состоящий из элементов магического массива.

public class MagicArray {
    private int[] array;
    private int size;

    public MagicArray(int capacity) {
        array = new int[capacity];
        size = 0;
    }

    public void add(int value) {
        if (size < array.length) {
            array[size++] = value;
        } else {
            System.out.println("Array is full");
        }
    }

    public int get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }

    public int[] toArray() {
        int[] result = new int[size];
        System.arraycopy(array, 0, result, 0, size);
        return result;
    }
}

