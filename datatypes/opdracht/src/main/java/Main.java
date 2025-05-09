import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int even = 0;
        int uneven = 0;

        for (int i = 1; i <= num; i++) {

           if (i % 2 == 0) {
               uneven += i;
           } else {
               even += i;
           }

        }

        System.out.println(even);
        System.out.println(uneven);
        System.out.println(even - uneven);
    }
}
