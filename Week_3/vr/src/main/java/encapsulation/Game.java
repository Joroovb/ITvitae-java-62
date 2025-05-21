package encapsulation;

public class Game {
    private String name;
    private int highScore;
    private String cheats;
    private int hp;

    public Game(String name, int highScore, String cheats, int hp) {
        this.name = name;
        this.highScore = highScore;
        this.cheats = cheats;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 100) {
            return;
        }

        this.name = name;
    }

    public int getHighScore() {
        if (this.getHp() < 0) {
            return -1;
        }

        return highScore;
    }

    public void setHighScore(int highScore) {
        if (highScore <= this.highScore) {
            return;
        }

        this.highScore = highScore;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            System.out.println("GAME OVER, GIT GUD");
            return;
        }

        this.hp = hp;
    }
}
