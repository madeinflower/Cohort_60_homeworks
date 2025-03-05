package homework22;

public class homework22Main {
    public static void main(String[] args) {

        int[] numbers = new int[]{1, 3, 5, 4, 100, 5, 200, 5};
        System.out.println("В numbers ячеек: " + numbers.length);

        // Создаем MagicArray на основе имеющегося массива
        homework22 magic = new homework22(numbers);
        System.out.println("Созданный MagicArray: " + magic);

        System.out.println("\n================");
        System.out.println("Тест метода lastIndexOf()");
        System.out.println("Последний индекс значения 5: " + magic.lastIndexOf(5));
        System.out.println("Последний индекс значения 100: " + magic.lastIndexOf(100));
        System.out.println("Последний индекс значения 500 (не существует): " + magic.lastIndexOf(500));

        System.out.println("\n================");
        System.out.println("Тест метода removeByValue()");
        boolean isRemoved = magic.removeByValue(5);
        System.out.println("Удалено ли значение 5? " + isRemoved);
        System.out.println("Массив после удаления: " + magic);

        isRemoved = magic.removeByValue(500);
        System.out.println("Удалено ли значение 500? " + isRemoved);
        System.out.println("Массив после попытки удаления 500: " + magic);

        System.out.println("\n================");
        System.out.println("Тесты остальных методов");

        magic.add(5);
        magic.add(20);
        magic.add(0);
        magic.add(100);
        magic.add(6, 7, 8);
        magic.add(10, 20, 30);

        System.out.println("В массиве сейчас элементов: " + magic.size());

        String arrayToString = magic.toString();
        System.out.println("arrayToString: " + arrayToString);
        System.out.print("Внутренний массив: ");
        magic.test();

        System.out.println("\n================");
        int value = magic.get(0);
        System.out.println("magic.get(0): " + value);

        int oldValue = magic.remove(3);
        System.out.println("magic.remove(3): " + oldValue);
        System.out.println(magic.toString());
        System.out.println("size: " + magic.size());

        System.out.println("\n================");
        System.out.println("magic.indexOf(20): " + magic.indexOf(20));

        int index = magic.indexOf(500);
        System.out.println("magic.indexOf(500): " + index);

        if (index >= 0) {
            System.out.println("Значение было найдено");
        } else {
            System.out.println("Вернулся отрицательный индекс. Такое значение в массиве отсутствует");
        }
    }
}
