import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = a--;

        // int b = a--
        // a = 10
        // b = a -> 10
        // a = a - 1

        // int b = --a
        // a = 10
        // a = a - 1
        // b = a -> 9

        System.out.println(b);
        System.out.println(a);

        boolean waar = true;
        System.out.println(!waar);

        boolean isBird = true;
        boolean isPlane = true;

        if (isBird && isPlane) {
            System.out.println("GAAF");
        }

        if (isBird || isPlane) {
            System.out.println("ORRRRRR");
        }

        int aa = 10;
        if (++aa > 10) {
            System.out.println("AAAAAAAAAA");
        }


        System.out.println(Integer.parseInt("5"));

        List<Integer> nums = new ArrayList();
        nums.add(1);

        Integer num = 5; // autoboxing
        int num2 = num; // unboxing
    }
}
