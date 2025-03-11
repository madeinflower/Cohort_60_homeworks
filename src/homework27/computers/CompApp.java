package homework27.computers;

public class CompApp {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel", "Core i7");
        Memory memory = new Memory("Kingston", "16GB DDR4");
        Storage storage = new Storage("Samsung", "1TB SSD");

        Computer computer = new Computer(processor, memory, storage);
        computer.displayConfiguration();
    }
}
