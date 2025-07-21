package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       int[] getallen = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//       int[] getallen2;
//       getallen2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] getallen3 = new int[10]; // {0,0,0,0,0,0,0,0}

        int getal = getallen[3];
        System.out.println(getal);
        getallen[0] = 10;
        System.out.println(Arrays.toString(getallen));
        System.out.println(getallen);

        List<Integer> getallen4 = new ArrayList<>();
        getallen4.add(1);

        for (int i = 0; i < 130; i++) {
            getallen4.add(i);
        }
    }
}
