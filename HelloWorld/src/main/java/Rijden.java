public class Rijden {
    public static void main(String[] args) {
        boolean heeftRijbewijs = true;
        int leeftijd = 18;

        if (!heeftRijbewijs) {
            System.out.println("Je mag niet rijden");
        } else if (leeftijd < 18) {
            System.out.println("Je mag rijden onder begeleiding");
        } else {
            System.out.println("Je mag rijden");
        }
    }
}
