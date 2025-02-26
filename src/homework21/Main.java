package homework21;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Алексей", 30, "инженер");
        Book book = new Book("Преступление и наказание", "Ф.М. Достоевский", 500);
        Computer computer = new Computer("Dell", "Intel i7", 16);

        person.introduce();
        book.read();
        computer.start();
    }
}
