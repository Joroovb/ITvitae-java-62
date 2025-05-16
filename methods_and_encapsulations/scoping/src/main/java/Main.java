public class Main {
    public static void main(String[] args) {
        System.out.println(Dog.amountOfDogs);
        Dog pipi = new Dog("Jack Russel");
        System.out.println(pipi.breed);
        System.out.println(pipi.amountOfDogs);

        Dog sammie = new Dog("Vuilnisbak");
        System.out.println(Dog.amountOfDogs);

        // niet de bedoeling
        sammie.amountOfDogs = 100;
        System.out.println(pipi.amountOfDogs);

        // dit is beter
        Dog.amountOfDogs = 101;
        System.out.println(Dog.amountOfDogs);


    }
}
