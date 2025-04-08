package homework47.task1;

import java.util.List;
import java.util.stream.Collectors;

/*
Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.
В новом списке должны быть только те числа из старого списка, которые соответствуют всем условиям: четные, больше 10 и меньше 100
Для фильтрации используйте Stream API
 */
public class NumberFilter {
    public static List<Integer> filterNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .filter(n -> n > 10)
                .filter(n -> n < 100)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> input = List.of(5, 12, 24, 101, 8, 99, 100, 150, 88, 33, 66);

        List<Integer> filtered = filterNumbers(input);
        System.out.println("Filtered numbers: " + filtered);
    }
}
