package online.store.java.model;

/**
 * Это абстрактный класс "Персона" с помощью которого мы обьявляем продавца, покупателя.
 * Их возраст, уникальный номер и имя.
 * Потом вторым шагом, мы создаём конструктор (комбинация клавиш alt+Enter) по id, name, age.
 * Нам конструктор нужен для того что бы удбно заполнять эти данные.
 * Например номер присваивать, имя, возраст.
 * Потом с помощью клавишт alt+Enter создаём методы доступа - getter/setter.
 * Собственно это методы создаются для того что бы они были доступны. (id, name, age);
 */

public class Person {

    private long id; // уникальный идентификатор клиента
    private String name; // имя клиента
    private int age; // возраст клиента


    public Person(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
