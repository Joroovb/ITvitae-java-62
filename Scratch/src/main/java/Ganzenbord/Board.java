package Ganzenbord;

import Ganzenbord.tiles.Tile;

public class Board {
    private Tile[] tiles = new Tile[64];

    public Board() {
        for (int i = 0; i < tiles.length; i++) {
            tiles[i] = new Tile();
        }
    }

    public Tile getTile(int index) {
        return tiles[index];
    }
}
