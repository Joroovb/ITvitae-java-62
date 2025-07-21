package Ganzenbord;

import Ganzenbord.tiles.Tile;

import java.util.Random;

public class GooseGame {
    private final Board board;
    private final Die[] dice = new Die[2];
    private final Player[] players = new Player[2];

    public GooseGame(Player p1, Player p2, Random random) {
        board = new Board();

        this.dice[0] = new Die(random);
        this.dice[1] = new Die(random);

        this.players[0] = p1;
        this.players[1] = p2;
    }

    public void play() {
        // game loop
        while (true) {
            for (Player player : players) {
                System.out.println(player + " is up next!");
                int roll = player.rollDice(dice);
                System.out.println(player + " rolled " + roll);

                // logica voor verplaatsen
                int futurePosition = roll + player.getPosition();
                Tile tile = board.getTile(futurePosition);

                boolean success = tile.check(player);

                if (success) {
                    player.move(roll);
                }

                System.out.println(player + " position is " + player.getPosition());


                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
            }
        }
    }


}
