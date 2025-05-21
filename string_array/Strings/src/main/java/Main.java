public class Main {
    public static void main(String[] args) {
        String naam = "     Joris      s";

        naam = naam.trim();

        System.out.println(naam);

        System.out.println(naam.charAt(4));
        System.out.println(naam.indexOf("jo"));

        System.out.println(naam.substring(0, 3));

        String namen = "namen,Joris,Melinoe,Salem";
        System.out.println(namen.replace(',', ' '));
        System.out.println(namen.replace(",", "\n - "));

        String[] namenGesplit = namen.split(",");

        System.out.println(namenGesplit[2]);

        namen = namen
                .replace("Joris", "Johan")
                .replace(',', ' ');

        String name = "Joris";
//        name = name.toUpperCase();
        name = "Jojo";
        System.out.println(name);


        System.out.println(namen);

        System.out.println(namen.length());

//        for (int i = 0; i < namen.length(); i++) {
//            System.out.println(namen.charAt(i));
//        }
//
        System.out.println(namen.startsWith("asdfg"));
        System.out.println(namen.endsWith("salem"));

    }
}
