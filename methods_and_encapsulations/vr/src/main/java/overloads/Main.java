package overloads;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s);
        Student s2 = new Student(32);
        System.out.println(s2);
        Student s3 = new Student("Joris");
        System.out.println(s3);
        Student s4 = new Student("Daniël", 30);

        System.out.println(s4);
    }
}
