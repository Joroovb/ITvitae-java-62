import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Vehicle vehicle2 = new Car();
//        Car car2 = new Vehicle();
        Vehicle vehicle3 = new Bike();

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Bike());
        vehicles.add(new Car());
        vehicles.add(new Ford());

        for (Vehicle v : vehicles) {
            v.drive();
        }
    }
}

interface Vehicle {
     void drive();
}

class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Car driving");
    }
}

class Ford extends Car {
    @Override
    public void drive() {
        System.out.println("Ford driving");
    }
}

class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Bike driving");
    }
}
