package homework27.computers;

public class Computer {
    private Processor processor;
    private Memory memory;
    private Storage storage;

    public Computer(Processor processor, Memory memory, Storage storage) {
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;
    }

    public void displayConfiguration() {
        System.out.println("Computer Configuration:");
        System.out.println("Processor: " + processor);
        System.out.println("Memory: " + memory);
        System.out.println("Storage: " + storage);
    }
}
