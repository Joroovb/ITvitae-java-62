package Ganzenbord;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Player p1 = new Player("Joris");
        Player p2 = new Player("Melinoe");

        GooseGame game = new GooseGame(p1, p2, random);
        game.play();
    }
}
