package Arrayss;

import java.util.Arrays;
import java.util.Scanner;

public class Oefening {
    public static void main(String[] args) {
        char specialChar = '*';
        // gebruiker vragen om aantal items & opslaan in var
        Scanner in = new Scanner(System.in);
        System.out.print("Voer het aantal items in: ");
        int NUM_ITEMS = in.nextInt();
        in.nextLine();

        // input valideren
        if (NUM_ITEMS < 0) {
            System.out.println("MAG NIET");
            return;
        }

        // Gebruiker vragen om waardes gescheiden door spaties
        System.out.print("Voer de waarde van alle items in (gescheiden door spatie): ");
        String input = in.nextLine();

        // input van String -> String[]
            // door String splitten op spaties
        String[] rawNums = input.split(" ");

        if (rawNums.length != NUM_ITEMS) {
            System.out.println("Incorrecte hoeveelheid nummers ingevuld");
            return;
        }

        // String[] -> int[]
            // for loop -> loopen door alle getallen
            // Integer.parseInt() -> van iedere String een int maken
        int[] nums = new int[NUM_ITEMS];
        for (int i = 0; i < NUM_ITEMS; i++) {
           nums[i] = Integer.parseInt(rawNums[i]);
        }

        // uitkomst afdrukken
        System.out.println(Arrays.toString(nums));

        // Bonus opdracht
        StringBuilder sb = new StringBuilder();

        for (int num : nums) {
            for (int i = 0; i < num; i++) {
                sb.append(specialChar);
            }
            sb.append("(" + num + ")\n");
        }

        System.out.println(sb.toString());
    }
}
