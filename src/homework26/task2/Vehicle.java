package homework26.task2;

public class Vehicle {
    String brand;
    int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String toString() {
        return "Brand: " + brand + ", Year: " + year;
    }
}

