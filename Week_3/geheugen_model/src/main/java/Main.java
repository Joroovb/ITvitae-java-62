public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Person person = new Person("Joris");
        // new Person(..) reserveert geheugen op de Heap voor een Person
        // Person person houdt een referentie, of leash, naar het geheugen
        // heap waar die Person opgeslagen is.
        Person person2 = person;
        System.out.println(person);
        System.out.println(person2);
        person = null;
        person2 = null;

        Person p = new Person(null);



    }
}

class Person { // Referentie type
    String name;

    Person(String name) {
        this.name = name;
    }
}
