package Ganzenbord;

public class Player {
    private String name;
    private int position = 0;

    public Player(String name) {
        this.name = name;
    }

    public int rollDice(Die... dice) {
        int result = 0;

        for (Die die : dice) {
            result += die.roll();
        }

        return result;
    }

    public void move(int steps) {
       this.position += steps;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return name;
    }
}
