package homework22;

import java.util.Arrays;

public class homework22 {
    int[] array;
    int cursor;

    public homework22() {
        this.array = new int[10];
    }

    // Этот конструктор принимает обычный массив, копирует его и создает новый массив удвоенного размера.
    public homework22(int[] array) {
        this.array = Arrays.copyOf(array, array.length * 2);
        this.cursor = array.length;
    }

    void add(int value) {
        if (cursor == array.length) {
            expandArray();
        }
        array[cursor++] = value;
    }

    void expandArray() {
        int[] newArray = new int[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, cursor);
        array = newArray;
    }

    void add(int... numbers) {
        for (int number : numbers) {
            add(number);
        }
    }

    public String toString() {
        return cursor == 0 ? "[]" : Arrays.toString(Arrays.copyOf(array, cursor));
    }

    int size() {
        return cursor;
    }

    int get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        }
        throw new IndexOutOfBoundsException("Invalid index: " + index);
    }

    int remove(int index) {
        if (index >= 0 && index < cursor) {
            int value = array[index];
            System.arraycopy(array, index + 1, array, index, cursor - index - 1);
            cursor--;
            return value;
        }
        throw new IndexOutOfBoundsException("Invalid index: " + index);
    }
    
    

    int indexOf(int value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // Метод ищет последний индекс указанного значения, начиная с конца массива.
    int lastIndexOf(int value) {
        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // Метод удаляет первое вхождение указанного значения и возвращает true, если удаление произошло.
    boolean removeByValue(int value) {
        int index = indexOf(value);
        if (index != -1) {
            remove(index);
            return true;
        }
        return false;
    }

    public void test() {
    }
}
