package homework28.transport;

public class Bicycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Bicycle has no engine to start!");
    }
}
