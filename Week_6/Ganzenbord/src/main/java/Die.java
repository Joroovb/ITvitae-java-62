import java.util.Random;

public class Die {
    private final Random random = new Random();
    private int roll;

    public int roll() {
        return roll = random.nextInt(6) + 1;
    }

    public int getLastRoll() {
        return roll;
    }
}
