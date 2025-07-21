public class Main {
    public static void main(String[] args) {
        Loopbaar l = new Mens();
        l.lopen();
    }
}

interface Loopbaar {
    void lopen();
}

class Mens implements Loopbaar {

   @Override
    public void lopen() {

    }
}