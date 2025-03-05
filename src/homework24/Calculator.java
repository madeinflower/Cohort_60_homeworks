package homework24;

// Класс "Калькулятор"
//Создайте класс Calculator, который будет предоставлять
//базовые арифметические операции: сложение, вычитание, умножение и деление
//Класс должен содержать:
//Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции.

public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("Addition: " + add(10, 5));
        System.out.println("Subtraction: " + subtract(10, 5));
        System.out.println("Multiplication: " + multiply(10, 5));
        System.out.println("Division: " + divide(10, 5));
    }
}