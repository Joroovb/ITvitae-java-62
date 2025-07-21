package Ganzenbord.tiles;

import Ganzenbord.Player;

public class Tile {
    protected Player player;

    public boolean check(Player player) {
        if (this.player != null) {
            return false;
        }

        this.player = player;
        return true;
    }
}
