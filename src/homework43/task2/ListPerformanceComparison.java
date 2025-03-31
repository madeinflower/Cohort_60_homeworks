package homework43.task2;

/*
Создайте два списка. Один на реализации ArrayList, второй на LinkedList.
Заполните их 5_000 одинаковыми случайными значениями от 0 до 1_000.
Создайте 4 метода, принимающий реализацию интерфейса List.
В первом методе - получение всех значений элементов списка по его индексу
Второй метод - вставка 2_000 новых значений по случайному индексу (диапазон индексов от 0 до размера списка)
Третий метод - удалить 1_000 элементов по случайному индексу. (диапазон индексов от 0 до размера коллекции)
Удалить 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000)
Все методы должны возвращать время, затраченное на выполнение метода в миллисекундах.
Сравните для каждого из списка время выполнения каждого метода.
И сравните время последовательного выполнения всех методов для каждой реализации List-а.
 */

import java.util.*;

public class ListPerformanceComparison {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        fillList(arrayList);
        fillList(linkedList);

        System.out.println("ArrayList - Получение по индексу: " + getTimeOfGetOperation(arrayList) + " ms");
        System.out.println("LinkedList - Получение по индексу: " + getTimeOfGetOperation(linkedList) + " ms");

        System.out.println("ArrayList - Вставка по случайному индексу: " + getTimeOfInsertOperation(arrayList) + " ms");
        System.out.println("LinkedList - Вставка по случайному индексу: " + getTimeOfInsertOperation(linkedList) + " ms");

        System.out.println("ArrayList - Удаление по индексу: " + getTimeOfRemoveByIndexOperation(arrayList) + " ms");
        System.out.println("LinkedList - Удаление по индексу: " + getTimeOfRemoveByIndexOperation(linkedList) + " ms");

        System.out.println("ArrayList - Удаление по значению: " + getTimeOfRemoveByValueOperation(arrayList) + " ms");
        System.out.println("LinkedList - Удаление по значению: " + getTimeOfRemoveByValueOperation(linkedList) + " ms");
    }

    private static void fillList(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 5000; i++) {
            list.add(random.nextInt(1000));
        }
    }

    private static long getTimeOfGetOperation(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        return System.currentTimeMillis() - startTime;
    }

    private static long getTimeOfInsertOperation(List<Integer> list) {
        Random random = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 2000; i++) {
            int index = random.nextInt(list.size());
            list.add(index, random.nextInt(1000));
        }
        return System.currentTimeMillis() - startTime;
    }

    private static long getTimeOfRemoveByIndexOperation(List<Integer> list) {
        Random random = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            int index = random.nextInt(list.size());
            list.remove(index);
        }
        return System.currentTimeMillis() - startTime;
    }

    private static long getTimeOfRemoveByValueOperation(List<Integer> list) {
        Random random = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list.remove(Integer.valueOf(random.nextInt(10000)));
        }
        return System.currentTimeMillis() - startTime;
    }
}
