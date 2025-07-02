package Inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Meeuw m = new Meeuw();
        m.soort = "Meeuw";
        m.poepen();

        Vogel m2 = new Meeuw();
//        Meeuw m3 = new Vogel();
         m2.poepen();

         DierenAmbulance ambulance = new DierenAmbulance(10);
         ambulance.addDier(new Kat(5));
         ambulance.addDier(new Hond(2));
         ambulance.addDier(new Hond(10));
        ambulance.addDier(new Hond(10));

         ambulance.dieren
                 .stream()
                 .forEach(System.out::println);
    }
}

class DierenAmbulance {
    int maxGewicht;
    List<Dier> dieren;

    public DierenAmbulance(int maxGewicht) {
        this.maxGewicht = maxGewicht;
        dieren = new ArrayList<Dier>();
    }

    public void addDier(Dier dier) {
        // we mogen niet teveel gewicht meenemen
        if (this.weegDieren() > maxGewicht) {
            return;
        }

        dieren.add(dier);
    }

    public int weegDieren() {
        int result = 0;

        for (Dier dier : dieren) {
            result += dier.gewicht;
        }

       return result;
    }
}


abstract class Dier {
    int gewicht;

    public Dier(int gewicht) {
        this.gewicht = gewicht;
    }
}

class Kat extends Dier {
    public Kat(int gewicht) {
        super(gewicht);
    }
}

class Hond extends Dier {
    public Hond(int gewicht) {
        super(gewicht);
    }
}



class Vogel {
    String soort;

    public void poepen() {
        System.out.println("poepen in de Vogel");
    }

}

class Meeuw extends Vogel {
//    @Override
//     public void poepen() {
//        System.out.println("poepen in de Meeuw");
//    }
}
