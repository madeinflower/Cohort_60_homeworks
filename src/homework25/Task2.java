package homework25;

// Неизменяемая переменная
//•	Объявите переменную final int MAX_USERS = 100;.
//•	Попробуйте изменить значение MAX_USERS в коде после её инициализации.
//•	Объясните, что произошло при попытке изменения значения.

public class Task2 {
    public static void main(String[] args) {
        final int MAX_USERS = 100;

        // Попытка изменения значения MAX_USERS
        // MAX_USERS = 200; // Это приведет к ошибке компиляции

        System.out.println("Max quantity of users: " + MAX_USERS);
    }
}
