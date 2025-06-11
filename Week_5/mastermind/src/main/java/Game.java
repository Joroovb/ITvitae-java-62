import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Game {
    private final int codeLength;
    private final int maxAttempts;
    private final List<Color> availableColors;
    private final List<Guess> guessHistory;
    private final Code secretCode;

    private int currentAttempt;
    private boolean isGameOver;

    public Game(int codeLength, int maxAttempts, List<Color> availableColors) {
        this.codeLength = codeLength;
        this.maxAttempts = maxAttempts;
        this.availableColors = availableColors;
        this.guessHistory = new ArrayList<>();
        this.secretCode = Code.generate(codeLength, availableColors);
        this.currentAttempt = 0;
        this.isGameOver = false;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Mastermind!");
        System.out.println("Available colors: " + availableColors);
        System.out.println("Try to guess the secret code!");

        while (!isGameOver) {
            System.out.printf("Attempt %d of %d: Enter your guess (e.g. RED BLUE GREEN YELLOW)%n",
                    currentAttempt + 1, maxAttempts);
            List<Color> guessColors = readGuess(scanner);

            if (guessColors == null) {
                System.out.println("Invalid guess. Try again.");
                continue;
            }

            Code guessCode = new Code(guessColors);
            Feedback feedback = secretCode.getFeedback(guessCode);
            Guess guess = new Guess(guessCode, feedback);
            guessHistory.add(guess);
            currentAttempt++;

            System.out.println(guess);

            if (feedback.getCorrectColorAndPosition() == codeLength) {
                System.out.println("You guessed the code! You win!");
                isGameOver = true;
            } else if (currentAttempt >= maxAttempts) {
                System.out.println("Out of attempts! The secret code was: " + secretCode);
                isGameOver = true;
            }
        }

        scanner.close();
    }

    private List<Color> readGuess(Scanner scanner) {
        String input = scanner.nextLine().trim().toUpperCase();
        String[] tokens = input.split("\\s+");
        if (tokens.length != codeLength) return null;

        List<Color> guess = new ArrayList<>();
        try {
            for (String token : tokens) {
                guess.add(Color.valueOf(token));
            }
        } catch (IllegalArgumentException e) {
            return null;
        }
        return guess;
    }
}
