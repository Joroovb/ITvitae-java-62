package Arrayss;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        numbers[2] = 5;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        String[] names = {"Joris", "Melinoe", "Salem"};
        Person[] persons = {new Person()};
    }
}

class Person {}
