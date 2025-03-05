package homework26;

import java.util.Scanner;

public class AbbreviationGenerator {

    public static String generateAbbreviation(String phrase) {
        String[] words = phrase.split(" ");
        StringBuilder abbreviation = new StringBuilder();

        for (String word : words) {
            abbreviation.append(word.toUpperCase().charAt(0));
        }

        return abbreviation.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String phrase = scanner.nextLine();

        String abbreviation = generateAbbreviation(phrase);
        System.out.println("Abbreviation: " + abbreviation);
    }
}
