import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        rand.setSeed(0);
        System.out.println(rand.nextInt());
    }
}
