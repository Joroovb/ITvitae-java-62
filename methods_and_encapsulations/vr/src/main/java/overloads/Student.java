package overloads;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        System.out.println("CONSTRUCTOR MET 2 ARGUMENTEN");
        this.name = name;
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
        this.age = -1;
    }

    public Student(int age) {
        this("UNKNOWN", age);
//        this.age = age;
//        this.name = "UNKNOWN";
    }

    public Student() {
        this("ACHTBAAN");
    }

    public void greet() {
        System.out.println("Hello dinges!");
    }

    public void greet(String name) {
        System.out.println("Hello " + name);
    }

    public void greet(String name, String language) {
        if (language != null) {
            System.out.println("Hola " + name);
        } else if (language.equals("nl")) {
            System.out.println("Hallo " + name);
        } else if (language.equals("ru")) {
            System.out.println("cyka " + name);
        } else {
            System.out.println("Hello " + name);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
