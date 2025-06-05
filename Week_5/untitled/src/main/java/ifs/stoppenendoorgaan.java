package ifs;

public class stoppenendoorgaan {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) continue;
            if (i == 28) break;

            System.out.println(i);
        }


        int aantalHs = 0;
        String str = "Kaas";

        for(char karakter : str.toCharArray()) {
            System.out.println(karakter);

            if (karakter != 'H') continue;

            // we slaan dit deel over als het karakter geen H is
            aantalHs = aantalHs + 1;
            System.out.println("H gevonden!");
        }

        System.out.println("Aantal gevonden Hs: " + aantalHs);

    }
}
