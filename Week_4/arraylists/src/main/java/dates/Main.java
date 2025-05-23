package dates;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        LocalDate birth = LocalDate.of(1993, Month.APRIL, 23);
        LocalDate danielBirth = LocalDate.of(1994, Month.OCTOBER, 29);

        birth = birth.minusMonths(6);

        System.out.println(birth);

        System.out.println(birth.isBefore(danielBirth));
        System.out.println(birth.isAfter(danielBirth));
        System.out.println(birth.isLeapYear());
//        LocalDate rebirth = LocalDate.of(1993, 20, 23);

//        System.out.println(rebirth);

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate date = LocalDate.parse("2020-12-29");
        System.out.println(date);

        Month month = date.getMonth();

    }
}

class Translator {
    private Month month;

    public Translator(Month month) {
        this.month = month;
    }

    public String toFrench() {
       return switch (month) {
           case JANUARY -> "OUI";
           case FEBRUARY -> "Baguette";
           default -> "Mon dieux";
       };
    }
}
