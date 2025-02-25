package homeworks.homework16;

import java.util.Scanner;

public class Task4 {
    // Программа запрашивает у пользователя ввод произвольного числа. Вывести сумму цифр этого числа.
    //Пример:
    //567432 -> 5+6+7+4+3+2 -> 27

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Sum of digits: " + sum);
        scanner.close();
    }
}
