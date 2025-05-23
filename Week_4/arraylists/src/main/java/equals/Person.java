package equals;

import java.util.Objects;

public class Person {
    private String name;
    private String email;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Gebruik de generator om standaard methodes te genereren in classes
    // Command + n op MAC
    // Anders ALT + INSERT
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return email.equals(person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
