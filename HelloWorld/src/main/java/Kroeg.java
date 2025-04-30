public class Kroeg {
    public static void main(String[] args) {
        int leeftijd = 200;

        if (leeftijd < 18) {
            System.out.println("Je mag niet naar binnen!");
        } else if (leeftijd < 65) {
            System.out.println("Je mag naar binnen!");
        } else {
            System.out.println("Dit is geen bejaardentehuis.");
        }
    }
}
