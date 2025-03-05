package homework26.task2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Subaru", 2020, 4);
        Bicycle bicycle = new Bicycle("Cube", 2024, true);

        System.out.println(car.toString());
        System.out.println(bicycle.toString());
    }
}
