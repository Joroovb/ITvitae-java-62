package Arrayss;

public class Sum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//        }
//
        System.out.println(sum);
    }
}
