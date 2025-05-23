package equals;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Joris", 32);
        Person person2 = new Person("Joris", 32);
        Person person3 = person;

        System.out.println(person == person2);
        System.out.println(person.equals(person2));
    }
}