package homework21;

public class Computer {
    String brand;
    String processor;
    int ram;

    public Computer(String brand, String processor, int ram) {
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
    }

    public void start() {
        System.out.printf("Компьютер %s с процессором %s и %dGB RAM включается.%n", brand, processor, ram);
    }
}