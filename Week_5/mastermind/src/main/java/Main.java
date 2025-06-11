import java.util.List;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(4, 12, List.of(Color.values()));
        game.start();
    }
}
