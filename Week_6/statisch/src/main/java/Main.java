import animals.Dog;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Joris";

        System.out.println(d.name);

        Dog.name = "Melinoe";

        System.out.println(d.name);
    }
}
