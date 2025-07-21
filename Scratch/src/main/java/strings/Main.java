package strings;

public class Main {
     String name = "Joris";
    public static void main(String[] args) {

        Main main = new Main();
        String person = "Joris";

        System.out.println(main.name.hashCode());
        System.out.println(person.hashCode());

//        person + "a";
//        "Joris" + "a" -> "Jorisa"

        System.out.println(main.name.hashCode());
        System.out.println(person.hashCode());


        String out = "";
        for (int i = 0; i < 10; i++) {
           out += "Hallo dit is een stukje tekst";
        }

        System.out.println(out);

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            builder.append("Hallo dit is een stukje tekst");
        }

        String s = builder.toString();
        System.out.println(s);

    }
}
