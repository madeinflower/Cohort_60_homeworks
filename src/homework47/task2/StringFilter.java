package homework47.task2;

/*
Task 2
Дан список строк.
Используя Stream API, отфильтруйте строки, которые начинаются на определенную букву (например, "A") и отсортируйте их в алфавитном порядке.
Результат сохраните в новый список строк.
 */

import java.util.List;
import java.util.stream.Collectors;

public class StringFilter {
    public static List<String> filterAndSort(List<String> input, String startsWithLetter) {
        return input.stream()
                .filter(s -> s.startsWith(startsWithLetter))
                .sorted()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Banana", "Avocado", "Cherry", "Apricot", "blueberry", "Almond");

        List<String> result = filterAndSort(words, "A");

        System.out.println("Filtered and sorted lines: " + result);
    }
}
