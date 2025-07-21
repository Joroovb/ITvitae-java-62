package Ganzenbord.tiles;

import Ganzenbord.Player;

public class Well extends Tile {
    private int roundsInWell = 0;
    private final int sentenceTime = 3;


    @Override
    public boolean check(Player player) {
        if (player != this.player) {
            this.player = player;
            this.roundsInWell = 0;
            return true;
        }

        roundsInWell++;

        if (roundsInWell >= sentenceTime) {
            this.player = null;
            return true;
        }

        return false;
    }
}
