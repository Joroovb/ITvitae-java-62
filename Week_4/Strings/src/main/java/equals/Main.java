package equals;

public class Main {
    public static void main(String[] args) {
        String name = "salem";
        String name2 = new String("salem");
        String name3 = "salem";

        System.out.println(name == name2);
        System.out.println(name == name3);
        System.out.println(name.equals(name2));


    }
}
