package woorden_tellen;

class ContString {
    public static void main(String... args) {
        String zomer = "zomer";
        String zomer2 = "zomer";                 // 2
//        System.out.println("zomer");             // 3
//        System.out.println("herfst");            // 4
//        System.out.println("herfst" == "zomer"); // 5
        String herfst = new String("zomer");     // 6

        System.out.println(zomer == zomer2);
        System.out.println(zomer == herfst);
    }
}
