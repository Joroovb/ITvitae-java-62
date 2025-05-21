public class Chess {
    public static void main(String[] args) {
        int nums = 8;

        for (int i = nums; i > 0; i--) {
            for (int j = 1; j <= nums; j++) {
                System.out.printf("(%d, %d)", i, j);
                // https://www.w3schools.com/java/ref_output_printf.asp
            }
            System.out.println();
        }
    }
}
