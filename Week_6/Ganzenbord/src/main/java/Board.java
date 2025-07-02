public class Board {
    private Tile[] tiles;

    private Board(Tile[] tile) {
       this.tiles = tile;
    }

    public static Board setup(int size) {
        Tile[] tiles = new Tile[size];

        for (int i = 0; i < tiles.length; i++) {
            tiles[i] = new BasicTile();
        }

        return new Board(tiles);
    }
}
