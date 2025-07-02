public class Game {
    private Goose[] geese;
    private Board board;
    private boolean playing = true;

    public Game(Board board, Goose... geese) {
        this.board = board;
        this.geese = geese;
    }

    public void play() {
       while(playing) {
           for (Goose goose : geese) {

           }
       }
    }
}
