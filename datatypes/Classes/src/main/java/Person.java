public class Person {
    String name;
    int age;
    String woonplaats;

    // Constructor
    Person(String name, int age, String woonplaats) {
        this.name = name;
        this.age = age;
        this.woonplaats = woonplaats;
    }
   // return-type identified () {}
    void printDetails() {
        System.out.println("Name: " + this.name + ", Age: " + this.age + ", Woonplaats: " + this.woonplaats);
    }

}
