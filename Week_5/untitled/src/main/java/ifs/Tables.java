package ifs;

public class Tables {
    public static void main(String[] args) {
        int num = 100;

        System.out.println(header(num));

        for (int i = 1; i <= num; i++) {
            System.out.printf("%2d | ", i);

            for (int j = 1; j <= num; j++) {
                System.out.printf("%5d", i * j);
            }
            System.out.println();
        }
    }

    static String header(int num) {
        String start = String.format("%2s | ", "*");
        StringBuilder builder = new StringBuilder(start);

        for (int i = 1; i <= num; i++) {
            builder.append(String.format("%5d", i));
        }

        int length = builder.length();
        builder.append("\n");

        for (int i = 0; i < length; i++) {
            builder.append('-');
        }

        return builder.toString();
    }
}
