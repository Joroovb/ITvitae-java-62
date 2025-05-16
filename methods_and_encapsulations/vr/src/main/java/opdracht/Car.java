package opdracht;

public class Car {
    private String make;
    private String model;
    private int year;
    private Engine engine;

    // default values
    // referentie types -> null
    // primitieve ->
        // int -> 0
        // float -> 0.0
        // double -> 0.0
        // boolean -> false

    public Car() {
        this.make = "";
        this.model = "";
        this.year = -1;
        this.engine = new Engine();
    }

    public Car(String make, String model, int year, Engine engine) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.engine = engine;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        if (engine.getHorsePower() > 50) {
            System.out.println("Watch out, this is a fast car!");
        }
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car:" +
                "\n\tmake='" + make + '\'' +
                ",\n\tmodel ='" + model + '\'' +
                ",\n\tyear=" + year +
                ",\n\tengine=" + engine;
    }
}
