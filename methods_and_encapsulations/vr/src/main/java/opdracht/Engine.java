package opdracht;

public class Engine {
    private int horsePower;
    private EngineType type;

    public Engine() {
        this.horsePower = -1;
        this.type = EngineType.UNKNOWN;
    }

    public Engine(int horsePower, EngineType type) {
        this.horsePower = horsePower;
        this.type = type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setHorsePower(String horsePower) {
        this.horsePower = Integer.parseInt(horsePower);
    }

    public EngineType getType() {
        return type;
    }

    public void setType(EngineType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                ", type=" + type +
                '}';
    }
}
