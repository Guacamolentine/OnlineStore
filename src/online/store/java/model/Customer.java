package online.store.java.model;

/**
 * Обьявляем класс покупатель и говорим с помощью "extends" что покупатель это персона класс "Person";
 * Создаём ему конструктор. Всё;
 * Customer это человек - но унего роль Покупателя;
 */

public class Customer extends Person{

    public Customer(long id, String name, int age) {
        super(id, name, age); // Эта конструкция связывается с Person, просто сохраняются данные;
    }
}
