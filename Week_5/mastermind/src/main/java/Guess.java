public class Guess {
    private final Code guessCode;
    private final Feedback feedback;

    public Guess(Code guessCode, Feedback feedback) {
        this.guessCode = guessCode;
        this.feedback = feedback;
    }

    public Code getGuessCode() {
        return guessCode;
    }

    public Feedback getFeedback() {
        return feedback;
    }
}
