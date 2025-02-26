package homework21;

public class Book {
    String title;
    String author;
    int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void read() {
        System.out.printf("Читаю книгу '%s' автора %s. Всего страниц: %d.%n", title, author, pages);
    }
}