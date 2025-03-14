package homework31;

import java.util.Arrays;

public class MagicArray<T> implements MyList<T> {
    private T[] array;
    private int size;

    @SuppressWarnings("unchecked")
    public MagicArray(int capacity) {
        array = (T[]) new Object[capacity];
        size = 0;
    }

    @Override
    public void add(T value) {
        if (size < array.length) {
            array[size++] = value;
        } else {
            System.out.println("Array is full");
        }
    }

    @Override
    public void addAll(T... values) {
        for (T value : values) {
            add(value);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int indexOf(T value) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T value) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(T value) {
        return indexOf(value) != -1;
    }

    @Override
    public T[] toArray() {
        return Arrays.copyOf(array, size);
    }

    @Override
    public boolean remove(T value) {
        int index = indexOf(value);
        if (index != -1) {
            remove(index);
            return true;
        }
        return false;
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        T removedValue = array[index];
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        size--;
        return removedValue;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public T get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }

    @Override
    public void set(int index, T value) {
        if (index >= 0 && index < size) {
            array[index] = value;
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }
}
