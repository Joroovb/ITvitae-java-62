public class Feedback {
    private final int correctColorAndPosition; // Black pegs
    private final int correctColorOnly;        // White pegs

    public Feedback(int correctColorAndPosition, int correctColorOnly) {
        this.correctColorAndPosition = correctColorAndPosition;
        this.correctColorOnly = correctColorOnly;
    }

    public int getCorrectColorAndPosition() {
        return correctColorAndPosition;
    }

    public int getCorrectColorOnly() {
        return correctColorOnly;
    }

    @Override
    public String toString() {
        return String.format("Black pegs: %d, White pegs: %d", correctColorAndPosition, correctColorOnly);
    }
}
