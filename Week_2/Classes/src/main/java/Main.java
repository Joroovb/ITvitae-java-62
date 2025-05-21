public class Main {
    public static void main(String[] args) {
        int a; // declaratie
        a = 10; // assignment
        Person person = new Person("Joris", 32, "Haarlem");
//        person.name = "Joris";
//        person.age = 32;
//        System.out.println("Name: " + person.name + ", Age: " + person.age);

        person.printDetails();

        Person person2 = new Person("Wesley", 30, "Breda");
//        person2.name = "Wesley";
//        person2.age = 30;
//        System.out.println("Name: " + person2.name + ", Age: " + person2.age);
        person2.printDetails();



        // datatype  identifier  waarde
        double       number      = 5.5;
        Person       jojo        = new Person("Daniël", 30, "Den Bosch");
        jojo.printDetails();

        Person p3 = new Person("Dwarka", 32, "Haarlem");
        p3.printDetails();

    }
}


