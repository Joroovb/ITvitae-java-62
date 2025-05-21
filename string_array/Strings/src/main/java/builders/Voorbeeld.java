package builders;

public class Voorbeeld {
    public static void main(String[] args) {
        StringBuilder outputBuilder = new StringBuilder("Joris");

        outputBuilder.append(", Melinoe, en Salem");
        System.out.println(outputBuilder.toString());

        int index = outputBuilder.indexOf("en");
        outputBuilder.insert(16, "Dwarka, Lola, ");

        System.out.println(outputBuilder.toString());

        outputBuilder.trimToSize();
//        outputBuilder.setLength();


        StringBuilder sb1 = new StringBuilder("0123456");
        sb1.delete(2, 4); // delete vanaf index 2 tot 4 (exclusief)
        System.out.println(sb1); // ?

        StringBuilder sb2 = new StringBuilder("0123456");
        sb2.deleteCharAt(2);
        System.out.println(sb2); // ?
    }
}
