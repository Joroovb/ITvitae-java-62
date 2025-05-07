import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int minutenInUur = 60;
        final int secondenInMinuut = 60;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Invoerafstand in meters: ");
        int meters = scanner.nextInt();

        System.out.print("Invoeruur: ");
        int uren = scanner.nextInt();

        System.out.print("Invoerminuten: ");
        int minuten = scanner.nextInt();

        System.out.print("Invoerseconden: ");
        int seconden = scanner.nextInt();

        minuten += uren * minutenInUur;
        // minuten = minuten + uren * 60;
        seconden += minuten * secondenInMinuut;
       // seconden = seconden + minuten * 60;

        double u = (double) seconden / 3600;

        System.out.println("m/h: " + (double) meters / seconden );
        System.out.println("km/h: " + ((double) meters / 1000) / u);
        System.out.println("m/h: " + ((double) meters / 1609) / u);

    }
}
