package Arrayss;

public class building {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6,7,8,9};
        int[] number2 = new int[]{1,2,3,4,5,6,7,8,9};
        int[] number3 = new int[10];
        String[] names = new String[10];

        int[] number4;
//        number4 = {1, 2, 3, 4}; mag niet, reserveert geen ruimte op heap.
        number4 = new int[]{1, 2, 3, 4};



        System.out.println(number3[0]);
        System.out.println(names[0]);
    }
}
