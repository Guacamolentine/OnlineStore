package online.store.java.model;

/**
 * alt+Enter or alt+Insert создаем конструктор.
 * Для каждой переменной создаем методы доступа getter/setter;
 */

public class Book {

    private long id; // уникальный номер
    private String title; // название книги
    private String author; // автор кники
    private double price; // цена книги
    private BookGenre genre; // Жанр книги c отдельным классом ENUM (перечисление);

    public Book(long id, String title, String author, double price, BookGenre genre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.genre = genre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BookGenre getGenre() {
        return genre;
    }

    public void setGenre(BookGenre genre) {
        this.genre = genre;
    }
}
