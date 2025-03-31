package homework44.task1;

/*
Напишите метод, принимающий строку и возвращающий Список ее слов без повторений, отсортированный в порядке увеличения длин слов.
Если строки имеют одинаковую длину - сортировать в естественном порядке
public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(StringUtil.getUniqueSortedWords(testString));
    }
Copy
// Output:
[для, слов, строка, которые, Тестовая, удаления, повторяются]
 */

import java.util.*;

public class StringUtil {

    public static List<String> getUniqueSortedWords(String input) {
        if (input == null || input.isEmpty()) {
            return Collections.emptyList();
        }

        String[] words = input.toLowerCase().replaceAll("[^a-zA-Zа-яА-ЯёЁ\\s]", "").split("\\s+");

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));

        List<String> wordList = new ArrayList<>(uniqueWords);

        wordList.sort(Comparator.comparingInt(String::length).thenComparing(String::compareTo));

        return wordList;
    }

    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(StringUtil.getUniqueSortedWords(testString));
    }
}

