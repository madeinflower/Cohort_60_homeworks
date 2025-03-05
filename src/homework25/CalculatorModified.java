package homework25;

// Класс "Калькулятор"
// Создайте класс Calculator, который будет предоставлять
// базовые арифметические операции: сложение, вычитание, умножение и деление
// а также методы для вычисления длины окружности и площади круга по радиусу.

public class CalculatorModified {

    // Константа для числа Пи
    public static final double PI = 3.141592653589793;

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

    // Метод для вычисления длины окружности по радиусу
    public static double calculateCircumference(double radius) {
        return 2 * PI * radius;
    }

    // Метод для вычисления площади круга по радиусу
    public static double calculateArea(double radius) {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        System.out.println("Addition: " + add(10, 5));
        System.out.println("Subtraction: " + subtract(10, 5));
        System.out.println("Multiplication: " + multiply(10, 5));
        System.out.println("Division: " + divide(10, 5));

        double radius = 7;
        System.out.println("Circumference of the circle: " + calculateCircumference(radius));
        System.out.println("Area of the circle: " + calculateArea(radius));
    }
}
