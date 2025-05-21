package reverse;

public class Main {
    public static void main(String[] args) {
        String input = "lepela";
        String output = "";
        int length = input.length() ;

        boolean palindrome = true;

        for (int i = 0; i < length; i++) {
           output += input.charAt(length - i - 1);
           System.out.println(input.charAt(length - i - 1));

           if (input.charAt(i) != input.charAt(length - i - 1)) {
               palindrome = false;
           }

        }

        if (palindrome) {
            System.out.println("PALINGDROME");
        } else {
            System.out.println("GEEN PALINGDROME");
        }


        if (output.equals(input)) {
            System.out.println("PALINGDROME");
        } else {
            System.out.println("GEEN PALINGDROME");
        }

//        StringBuilder builder = new StringBuilder(input);
//        builder.reverse();
//        String result = builder.toString();

//        System.out.println(result);

        System.out.println(output);

    }
}
