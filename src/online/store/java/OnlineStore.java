package online.store.java;

import online.store.java.model.*;

import java.util.ArrayList;

public class OnlineStore {

    static ArrayList<Book> books = new ArrayList<>();
    static ArrayList<Customer> customer = new ArrayList<>();
    static ArrayList<Employee> employees = new ArrayList<>();
    static ArrayList<Order> orders = new ArrayList<>();

    public static void main(String[] args) {
        initData();

        String bookInfo =
                String.format("Total amount of sold  books: %d and total sum: %f",
                        getCountOfSoldBooks(), getAllPriceOfSoldBooks());
        System.out.println(bookInfo);
    }

    /**
     * Получить общую сумму заказов
     *
     * @return Вывод общей суммы
     */
    public static double getAllPriceOfSoldBooks() {
        double price = 0;
        for (Order order : orders) {
            price += getPriceOfSoldedBooksInOrder(order);
        }
        return price;
    }


    /**
     * Получить общую стоимость одного заказа.
     *
     * @param order Заказ, по которому считается стоимость
     * @return Общая стоимость для всех проданныйх книг в заказе
     */
    public static double getPriceOfSoldedBooksInOrder(Order order) {
        double price = 0;

        for (long bookId : order.getBooks()) { // Находим список книг в этом заказе по ID
            Book book = getBookId(bookId);
            if (book != null) // Если поиск книги прошел успешно - берем его цену
                price += book.getPrice();
        }
        return price;
    }

    /**
     * Метод получения общего кол-ва всех проданных книг.
     * Мы прошлись по всем заказам/(массивам).
     * Пройдя по каждому заказу мы получили общий список/(колчиество) книг.
     *
     * @return
     */
    public static int getCountOfSoldBooks() {
        int count = 0;
        for (Order order : orders) {
            count += order.getBooks().length;
        }
        return count;
    }

    /**
     * Метод поиска книги по её уникальному номеру
     *
     * @param id - уникальный номер книги
     * @return - книжка найдена, возращаем её
     */

    public static Book getBookId(long id) {

        Book current = null; // Заводим пустую переменную

        for (Book book : books) { // Ищем среди всего списка книг
            if (book.getId() == id) { // Если у книги которую мы ищем, совпадает ID - то мы её нашли
                current = book;
                break; // Выходим из цыкла
            }
        }
        return current; // Возвращаем нужную нам книгу
    }

    public static void initData() {
        // продавцы
        employees.add(new Employee(1, "Ivanov Ivan", 24));
        employees.add(new Employee(2, "Petrov Petr", 31));
        employees.add(new Employee(3, "Grigoryev Grigoriy", 27));

        // покупатели
        customer.add(new Customer(1, "Stanilsav Morozov", 43));
        customer.add(new Customer(2, "Petraychuk Alexandr", 32));
        customer.add(new Customer(3, "Tretiakov Misha", 26));
        customer.add(new Customer(4, "Tretiakov Misha", 21));
        customer.add(new Customer(5, "Tretiakov Misha", 18));

        // книги
        books.add(new Book(1, "Metro 2033", "Alexandr Glukhovskiy", 1500, BookGenre.Art));
        books.add(new Book(2, "Harry potter", "Goan Rowling", 2400, BookGenre.Art));
        books.add(new Book(3, "Vedmak", "Angey Sadkovskiy", 3156, BookGenre.Art));
        books.add(new Book(4, "Vedmak", "Angey Sadkovskiy", 3156, BookGenre.Art));

        books.add(new Book(5, "Vvedeniye v Psihoanaliz", "Fraid Zigmund", 999, BookGenre.Psyhology));
        books.add(new Book(6, "Psihologiya Vliyaniya", "Chaldin Robert", 2432, BookGenre.Psyhology));
        books.add(new Book(7, "Kak Perestat Bespokoitsya i Nachat Delat", "Karnegi Deyl", 654, BookGenre.Psyhology));

        books.add(new Book(8, "Gang of Four", "Gamma Erichk", 4850, BookGenre.Programming));
        books.add(new Book(9, "Sovershenniy Code", "Macconel Steve", 2321, BookGenre.Programming));
        books.add(new Book(10, "Refactoring", "Fauler Martin", 1668, BookGenre.Programming));
        books.add(new Book(11, "Alhorytms", "Karmen Thomas X", 1668, BookGenre.Programming));

        orders.add(new Order(1, 1, 1, new long[]{8, 9, 10, 11}));
        orders.add(new Order(2, 1, 2, new long[]{1}));

        orders.add(new Order(3, 2, 3, new long[]{5, 6, 7}));
        orders.add(new Order(4, 3, 4, new long[]{1, 2, 3, 4}));

        orders.add(new Order(5, 3, 5, new long[]{2, 5, 9}));
    }
}
