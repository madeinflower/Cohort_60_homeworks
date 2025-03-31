package homework43.task1;

/*
Напишите метод, который принимает на вход две реализации интерфейса List.
Метод должен возвращать список состоящий из элементов, которые присутствуют в обеих коллекциях.
 */

import java.util.ArrayList;
import java.util.List;

public class ListIntersection {

    public static <T> List<T> getIntersection(List<T> list1, List<T> list2) {
        List<T> intersection = new ArrayList<>(list1);
        intersection.retainAll(list2);
        return intersection;
    }

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = List.of(3, 4, 5, 6, 7);

        List<Integer> result = getIntersection(list1, list2);
        System.out.println("Пересечение списков: " + result);
    }
}

