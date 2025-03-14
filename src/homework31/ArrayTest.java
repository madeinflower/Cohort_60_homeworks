package homework31;

public class ArrayTest {
    public static void main(String[] args) {
        MagicArray<Integer> magicArray = new MagicArray<>(5);

        // Добавление элементов
        magicArray.add(10);
        magicArray.add(20);
        magicArray.add(30);
        System.out.println("Array after adding elements: " + java.util.Arrays.toString(magicArray.toArray()));

        // Добавление нескольких элементов
        magicArray.addAll(40, 50);
        System.out.println("Array after adding multiple elements: " + java.util.Arrays.toString(magicArray.toArray()));

        // Проверка размера
        System.out.println("Size of array: " + magicArray.size());

        // Поиск элемента
        System.out.println("Index of 30: " + magicArray.indexOf(30));
        System.out.println("Last index of 10: " + magicArray.lastIndexOf(10));
        System.out.println("Contains 20? " + magicArray.contains(20));

        // Удаление элемента по значению
        magicArray.remove(Integer.valueOf(20));
        System.out.println("Array after removing 20: " + java.util.Arrays.toString(magicArray.toArray()));

        // Удаление элемента по индексу
        magicArray.remove(1);
        System.out.println("Array after removing element at index 1: " + java.util.Arrays.toString(magicArray.toArray()));

        // Проверка получения и установки значения
        System.out.println("Element at index 1: " + magicArray.get(1));
        magicArray.set(1, 99);
        System.out.println("Array after setting index 1 to 99: " + java.util.Arrays.toString(magicArray.toArray()));

        // Проверка пустого массива
        System.out.println("Is array empty? " + magicArray.isEmpty());
    }
}
