package ifs;

enum Days {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

   public String toString() {
       return switch (this) {
           case MONDAY -> "MONDAY";
           case TUESDAY -> "TUESDAY";
           case WEDNESDAY -> "WEDNESDAY";
           case THURSDAY -> "THURSDAY";
           case FRIDAY -> "FRIDAY";
           default -> "WEEKEND";
       };
    };

}

public class switching {
    public static void main(String[] args) {
        Days day = Days.MONDAY;
        switch (day) {
            case MONDAY:
                System.out.println("Monday");
                break;
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Tuesday");
        }

        String name = "Aoris";
        char ch = name.charAt(0);

        switch (ch) {
            case 'A':
            case 'B':
            case 'C':
                System.out.println("ABC");
                break;
            case 'D':
            case 'E':
            case 'F':
                System.out.println("DEF");
                break;
            case 'G', 'H', 'I':
                System.out.println("GHI");
                break;
        }
    }
}
