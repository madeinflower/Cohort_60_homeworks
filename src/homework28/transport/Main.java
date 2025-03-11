package homework28.transport;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = { new Car(), new Bicycle(), new Motorcycle() };

        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
        }
    }
}