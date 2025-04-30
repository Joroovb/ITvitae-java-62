public class Loop {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("sum = " + sum + ", i = " + i + "\n");
            sum += i;
        }

        for (int i = 0; i < 100; i++) {
            System.out.print(i);
        }

        System.out.println();

        for (int i = 100; i >= 0; i = i - 2) {
            System.out.print(i + " ");
        }

        for (;;) {
            System.out.println("ENDLESS");
        }
    }
}
