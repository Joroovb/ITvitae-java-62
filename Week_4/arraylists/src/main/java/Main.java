import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList();
        ArrayList<Integer> numbers = new ArrayList();

        List<List<List<List<Integer>>>> list  = new ArrayList();



        int[] numbers2 = new int[10];

        numbers2[0] = 10;
//        numbers[0] = 10;
        numbers.add(10);
        numbers.add(9);
        numbers.add(30);
        numbers.add(11);
        numbers.add(24);
        numbers.add(3);

        System.out.println(numbers2[0]);
        System.out.println(numbers.get(0));

        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        for (int num : numbers2) {
            System.out.println(num);
        }

        for (int num : numbers) {
            System.out.println(num);
        }

        System.out.println(numbers.indexOf(5));
//        numbers.clear();

        System.out.println(numbers.indexOf(10));

//        numbers.remove(10);
        numbers.remove(Integer.valueOf(10));

        for (int num : numbers) {
            System.out.println(num);
        }

        System.out.println(numbers.get(0));

        boolean contains = numbers.contains(Integer.valueOf(10));
//        numbers.addAll(Arrays.asList(numbers2));
    }
}
