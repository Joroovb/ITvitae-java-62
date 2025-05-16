public class Main {
    public static void main(String[] args) {
        int prim = 10;
        Number ref = new Number(prim);
        Integer wrap = 10;

        Calculator calculator = new Calculator();
        calculator.add(prim);
        calculator.add(ref);
        calculator.add(wrap);

        System.out.println(prim);
        System.out.println(ref.number);
        System.out.println(wrap);
    }
}

class Calculator {
    void add(int number) { // Copy by value
        number = number + 1;
    }

    void add(Number number) { // Pass by reference
        number.number = number.number + 1;
    }

    void add(Integer number) {
        number = number + 1;
    }
}

class Number {
   int number;

    public Number(int number) {
        this.number = number;
    }
}

