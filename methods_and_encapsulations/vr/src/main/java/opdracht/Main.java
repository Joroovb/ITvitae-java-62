package opdracht;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(100, EngineType.UNKNOWN);
        Car car = new Car("Toyota", "Yaris", 2001, engine);
        System.out.println(car);
    }
}
