import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;
        Predicate<Integer> isPositive = num -> num > 0;
        Predicate<Integer> isDivisibleByTen = num -> num % 10 == 0;
        Sieve s = new Sieve(isDivisibleByTen);


        boolean res = s.isGood(5);
        System.out.println(res);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers
                .stream()
                .filter(isEven)
                .filter(isDivisibleByTen)
                .forEach(System.out::println);

    }
}
