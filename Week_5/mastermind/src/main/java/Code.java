import java.util.*;

public class Code {
    private final List<Color> pegs;


    Code(List<Color> pegs) {
        this.pegs = new ArrayList<>(pegs);
    }

    public List<Color> getPegs() {
        return Collections.unmodifiableList(pegs);
    }

    public static Code generate(int length, List<Color> availableColors) {
        Random rand = new Random();
            List<Color> randomPegs = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(availableColors.size());
            randomPegs.add(availableColors.get(index));
        }

        return new Code(randomPegs);
    }

    public Feedback getFeedback(Code guess) {
        List<Color> secretCopy = new ArrayList<>(pegs);
        List<Color> guessCopy = new ArrayList<>(guess.pegs);

        int blackPegs = 0;
        int whitePegs = 0;

        // First pass: check for correct color and position (black pegs)
        for (int i = 0; i < secretCopy.size(); i++) {
            if (secretCopy.get(i) == guessCopy.get(i)) {
                blackPegs++;
                secretCopy.set(i, null); // Mark matched
                guessCopy.set(i, null);
            }
        }

        // Second pass: check for correct color only (white pegs)
        for (int i = 0; i < guessCopy.size(); i++) {
            Color guessColor = guessCopy.get(i);
            if (guessColor != null && secretCopy.contains(guessColor)) {
                whitePegs++;
                secretCopy.set(secretCopy.indexOf(guessColor), null); // Mark as used
            }
        }

        return new Feedback(blackPegs, whitePegs);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Code)) return false;
        Code code = (Code) o;
        return this.pegs.equals(code.getPegs());
    }
}
