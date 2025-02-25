package homeworks.homework16;

public class Task1 {
    //Найдите произведение всех чисел от 1 до 15 включительно.
    //Результат выведите на экран

    public static void main(String[] args) {
        long product = 1;

        for (int i = 1; i <= 15; i++) {
            product *= i;
        }

        System.out.println("Произведение чисел от 1 до 15: " + product);
    }
}
