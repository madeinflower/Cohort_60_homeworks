package homework45.task1;

/*
Частотный словарь слов: Напишите метод, который принимает строку текста и возвращает Map<String, Integer>,
где каждому слову соответствует количество его вхождений в текст.
 */
import java.util.*;

public class WordFrequencyCounter {
    public static Map<String, Integer> getWordFrequency(String text) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Приводим текст к нижнему регистру и разбиваем на слова
        String[] words = text.toLowerCase().split("\\W+");

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        return wordCountMap;
    }

    public static void main(String[] args) {
        String text = "Hello hello world! Hello Java.";
        Map<String, Integer> wordFrequency = getWordFrequency(text);

        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
