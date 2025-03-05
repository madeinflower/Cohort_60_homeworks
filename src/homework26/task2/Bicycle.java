package homework26.task2;

public class Bicycle extends Vehicle {
    boolean hasBell;

    public Bicycle(String brand, int year, boolean hasBell) {
        super(brand, year);
        this.hasBell = hasBell;
    }

    @Override
    public String toString() {
        return super.toString() + ", Has Bell: " + (hasBell ? "Yes" : "No");
    }
}
