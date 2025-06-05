package ifs;

public class omzetten {
    public static void main(String[] args) {
        int[] list = new int[5];

        for (int i = 0; i < list.length; i++) {
            list[i] = i + 2;
        }

        int i = 0;
        while (i < list.length) {
            list[i] = i + 2;
            i++;
        }
    }
}
