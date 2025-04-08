package homework46.task2;

import java.util.Optional;

/*
Task 2
Поиск книги в библиотеке
Создайте класс Library, в котором хранится список книг. У каждой книги есть название (title) и автор (author).

Реализуйте метод:
Optional<Book> findBookByTitle(String title)

Он должен возвращать Optional — книгу, если она найдена, или Optional.empty(), если такой книги нет.

Что нужно сделать:
Создайте класс Book с полями title и author, и сделайте для них геттеры.
Создайте класс Library, в котором будет список книг.
Реализуйте метод findBookByTitle, который ищет книгу по названию.
В main() методе попробуйте:
Найти книгу, которая точно есть.
Найти книгу, которой нет.
Вывести информацию о книге, если она найдена.
Вывести "Книга не найдена", если её нет.
 */

public class LibraryDemo {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("Brave New World", "Aldous Huxley"));
        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien"));

        // Поиск книги, которая точно есть
        Optional<Book> foundBook = library.findBookByTitle("1984");
        foundBook.ifPresentOrElse(
                book -> System.out.println("Найдена книга: " + book.getTitle() + " от " + book.getAuthor()),
                () -> System.out.println("Книга не найдена")
        );

        // Поиск книги, которой нет
        Optional<Book> missingBook = library.findBookByTitle("Unknown Book");
        missingBook.ifPresentOrElse(
                book -> System.out.println("Найдена книга: " + book.getTitle() + " от " + book.getAuthor()),
                () -> System.out.println("Книга не найдена")
        );
    }
}
