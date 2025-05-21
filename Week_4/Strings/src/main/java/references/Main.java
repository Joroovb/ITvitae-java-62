package references;

public class Main {
    public static void main(String[] args) {
        String name = "Joris";
        String name2 = name;

        System.out.println(name == name2);
        System.out.println(name.hashCode());
        System.out.println(name2.hashCode());

        name = name.toLowerCase();

        System.out.println(name == name2);
        System.out.println(name.hashCode());
        System.out.println(name2.hashCode());
    }

    static String toLowerCase(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result += (char) (c - 'a' + 'A');
            }
        }
        return result;

    }
}
