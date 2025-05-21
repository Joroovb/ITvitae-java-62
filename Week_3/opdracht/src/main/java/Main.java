public class Main {
    public static void main(String[] args) {
        Opdracht opdracht = new Opdracht();
        int result = opdracht.exponent(4, 3);
        System.out.println(result);

        OddEvenTest test = new OddEvenTest();
        System.out.println(test.isOdd(21));
        System.out.println(test.isOdd(20));
    }
}

class OddEvenTest {
   boolean isOdd(int num) {
       // num = 21
       // 21 % 2 -> 1
       // 1 != 0 -> true
       // return true;

       // num = 20
       // 20 % 2 -> 0
       // 0 != 0 -> false
       // return false

//       if (num % 2 != 0) {
//           return true;
//       } else {
//           return false;
//       }

       return num % 2 != 0;
   }
}

class Opdracht {
    int exponent(int base, int exp) {
        int result = 1;

        for (int i = 0; i < exp; i++) {
            result *= base;
        }

        return result;
    }
}
