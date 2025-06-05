package ifs;

public class Fib {
    public static void main(String[] args) {
        System.out.println(fib(6));
        int limit = 20;

        for (int i = 0; i < limit; i++) {
            System.out.println(fib(i));
        }
    }

//    fib(4) + fib(3) + fib(4) + fib(5) + fib(6);

    static int fib(int input) {
        if (input <= 1) {
            return input;
        } else {
            return fib(input - 1) + fib(input - 2);
        }
    }
}
