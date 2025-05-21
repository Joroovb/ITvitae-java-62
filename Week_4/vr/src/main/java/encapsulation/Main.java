package encapsulation;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("joris.vanbreugel@code-cage.nl", "1234", 32);
//        person.age = -22;
        person.setAge();
        System.out.println(person.getAge());
        person.setAge();
        System.out.println(person.getAge());
        System.out.println(person.checkPassword("4321"));
    }
}
