package homeworks.homework17;

public class Task1 {
    // Написать метод, принимающий на вход строку. Метод должен вывести на экран число, соответсвующее количеству символов в строке.
    //Например: Если в метод пришла строка "hello" - метод должен вывести число 5 (так как в строке hello 5 символов)

    public static void main(String[] args) {
        printStringLength("Some word here");
    }

    public static void printStringLength(String input) {
        if (input == null) {
            System.out.println("String is null");
        } else {
            System.out.println("Number of characters: " + input.length());
        }
    }
}
