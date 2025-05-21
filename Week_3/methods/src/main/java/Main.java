public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        var result = calculator.add(1, 2);
        System.out.println(result);

        calculator.add(1.0, 2.0);
    }
}
