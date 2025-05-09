public class Voorbeeld {
    public static void main(String[] args) {
        final int startOfUpperCaseChars = 65;
        String code = "TESTING";

        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);
            int remainder = ch - 'X';

            if (remainder < 3 && remainder >= 0) {
                ch = (char) (startOfUpperCaseChars + remainder);
            }

            System.out.print((char) (ch + 3));



        }
    }
}
