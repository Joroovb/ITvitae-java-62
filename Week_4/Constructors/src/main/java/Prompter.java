import java.util.Scanner;

public class Prompter {
    private final Scanner scanner = new Scanner(System.in);

    int askForNumber(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    int askForNumberInRange(String prompt, int min, int max)

}
