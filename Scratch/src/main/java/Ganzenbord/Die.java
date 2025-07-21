package Ganzenbord;

import java.util.Random;

public class Die {
    protected Random random;
    protected int lastRoll;

    public Die(Random random) {
       this.random = random;
    }

    public int roll() {
        lastRoll = random.nextInt(6) + 1;
        return lastRoll;
    }

    public int getLastRoll() {
        return lastRoll;
    }
}