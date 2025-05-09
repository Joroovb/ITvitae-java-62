import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Row: ");
        int row = scanner.nextInt();
        System.out.print("Column: ");
        int column = scanner.nextInt();

        int[][] matrix = {
                {row, column - 1},
                {row - 1, column },
                {row, column + 1},
                {row + 1, column},
        };

        for (int[] ints : matrix) {
            System.out.println("(" + ints[0] + ", " + ints[1] + ")");
        }

        Toolkit
                .getDefaultToolkit().beep();
    }
}
