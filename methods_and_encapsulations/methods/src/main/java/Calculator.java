public class Calculator {
    // access-modifier returntype identifier(parameters -> datatype identifier) {}
    public int add(int number, int number2) {
        return number + number2;
    }

    public double add(double number, double number2) { // overload
        return number + number2;
    }

   public int add(int number) { // overload de add methode -> verschillende parameters
        return number + 1;
   }
}
