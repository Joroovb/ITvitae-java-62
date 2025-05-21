public class Main {
    public static void main(String[] args) {
        Point p = new Point(8);
        System.out.println(p);

        Point pp = new Point(10, 10);
        System.out.println(pp);


        Point ppp = new Point(10, 10, 2);
        System.out.println(ppp);

        Point pppp = new Point();
        System.out.println(pppp);

        Person p = new Person("Joris", 32);
        p.printDetails(); // output -> "Joris", 32
        Person pp = new Person(32);
        pp.printDetails(); // output -> "Unknown", 32
        Person ppp = new Person("Joris");
        ppp.printDetails(); // output -> "Joris", -1

        Arrow a = new Arrow();
        a.getShaft();

    }
}
