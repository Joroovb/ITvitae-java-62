package galgje;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Iemand verzint een woord, case insenstive
        // Scanner & printen
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer een woord in: ");
        String wordToGuess = scanner.nextLine().toLowerCase();
        ArrayList<Character> allGuessedLetters = new ArrayList<>();

        // Console leegmaken
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // _ geradenLetters verzameling
        // Arraylist aanmaken
        // voor elke letter in te raden woord
            // voegen we een underscore aan de arraylist
        ArrayList<Character> guessedLetters = new ArrayList<>();
        for (int i = 0; i < wordToGuess.length(); i++) {
            guessedLetters.add('_');
        }

        // levens -> getal
        int lives = 6;

        // Herhalend
        // Als levens op zijn, stoppen met herhalen
        while(lives > 0) {
            // Galgje laten zien
            System.out.println(Gallow.forStage(lives));
            // geraden letters tonen
            System.out.println(guessedLetters);

            System.out.print("Raad een letter: ");
            // Speler 2 gaat raden, ook lowercase
            char guess = scanner.next().toLowerCase().charAt(0);

            // niet meerdere keren dezelfde letter raden
            if (allGuessedLetters.contains(guess)) {
                System.out.println("Deze letter heb je al geraden");
                continue;
            }

            allGuessedLetters.add(guess);

            // Als poging niet in woord zit
            if (!wordToGuess.contains(String.valueOf(guess))) {
                // levens aftrekken
               lives--;
                // door naar volgende iteratie
               continue;
            }

            // Kijken waar letter in het woord zit
            for (int i = 0; i < wordToGuess.length(); i++) {
                // Ja? opslaan in geradenLetters
                if (guess == wordToGuess.charAt(i)) {
                    guessedLetters.set(i, guess);
                }
            }

            // Als woord geraden is, stoppen met herhalen
            if (!guessedLetters.contains('_')) {
                // Feedback aan gebruiker
                System.out.println("Je hebt gewonnen, je bent een koning.");
                // Stop met loopen
                break;
            }

        }

        // Feedback speler gewonnen of verloren
        // Galgje laten zien
        System.out.println(Gallow.forStage(lives));
    }
}

// Niet meerdere keren dezelfde letter raden
