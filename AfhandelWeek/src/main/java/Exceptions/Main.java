package Exceptions;

public class Main {
   public static void main(String[] args) {
        Main m = new Main();
        m.testje();
//        m.testje2(); // -> compileert niet

        try {
            m.testje2();
        } catch (Exception e) {
            // Error handlen
        }

        try {
            m.testje3();

        } catch (AndereException e) {

        } catch (EigenException e) {


        } catch (Exception e) {

        }
   }

   public void testje() {
       try {
           throw new EigenException();
       } catch (EigenException e) {
            // af te handelen
       }
   }

   public void testje2() throws EigenException {
       throw new EigenException();
   }

   public void testje3() throws EigenException {

   }
}

class EigenException extends Exception {

}

class AndereException extends EigenException {}