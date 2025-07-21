package vakjes;

public class Main {
    private Vakje[] board;

    public static void main(String[] args) {
        Main main = new Main();
        Speler speler = new Speler();

        for (Vakje vakje : main.board) {
            vakje.execute(speler);
        }

    }
}

class Board {
    private Vakje[] vakjes = new Vakje[63];

    public Board() {
        for (int i = 0; i < vakjes.length; i++) {
            vakjes[i] = new Vakje();
        }

        vakjes[10] = new Well();
        vakjes[22] = new Death();
    }

    public Vakje getVakjeAt(int index) {
        return vakjes[index];
    }
}

class Speler {}


class Vakje {
    protected Speler speler;

    public void execute(Speler speler) {

    }
}

class Death extends Vakje {
    @Override
    public void execute(Speler speler) {
    }
}

class Well extends Vakje {
    private int count = 3;

    @Override
    public void execute(Speler speler) {
        if (this.speler != null) {
            this.speler = speler;
            this.count = 3;
        }


    }
}
