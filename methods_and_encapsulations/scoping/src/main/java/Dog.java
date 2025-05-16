public class Dog {
   String breed; // Instantie variabele
    static int amountOfDogs = 0; // class variable

    Dog(String breed) {
        this.breed = breed;
        amountOfDogs++;
    }

    void bark(boolean isScared) { // method parameter -> local variabele
        int a;
        if (isScared) {
            a = 10;
            System.out.println("BARK");
        } else {
            a = 12;
            System.out.println("Bark");
        }

        System.out.println(a);
    }

    void eat() {
//        System.out.println(isScared); isScared is buiten scope
//        System.out.println(amount); amount is nog niet gedefiniert
        int amount = 0; // local variabele
        for (int i = 0; i < 10; i++) {
            int age = 10; // local variabele -> block scope variabele
//            int amount = 10; // amount bestaat al, mag niet nog een keer gemaakt worden
            System.out.println(age);
            System.out.println(amount);
            amount++;
        }
//        int amount = 11;
//        System.out.println(i);
//        System.out.println(age);
    }


}
