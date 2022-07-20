package online.store.java.model;

/**
 * Обьявляем класс продавец и говорим с помощью "extends" что продавец это персона класс "Person";
 * Создаём ему конструктор. Всё;
 * Employee это человек - но унего роль продавца;
 */

public class Employee extends Person{

    public Employee(long id, String name, int age) {
        super(id, name, age); // Эта конструкция связывается с Person, просто сохраняются данные;
    }
}
