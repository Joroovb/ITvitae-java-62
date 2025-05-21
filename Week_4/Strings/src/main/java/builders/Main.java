package builders;

public class Main {
    public static void main(String[] args) {
       String name = "Joris";
       String output = "";
       StringBuilder outputBuilder = new StringBuilder();

       for (int i = 0; i < name.length(); i++) {
           output += name.charAt(i);
           System.out.println(output.hashCode());
       }

       for (int i = 0; i < output.length(); i++) {
           outputBuilder.append(output.charAt(i));
           System.out.println(outputBuilder.hashCode());
       }

       String out = outputBuilder.toString();
       System.out.println(outputBuilder);

    }
}
