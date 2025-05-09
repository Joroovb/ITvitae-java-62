public class Main {
    public static void main(String[] args) {
        // datatype identifier = instantie aanmaken
        // int a = 1;
        Student s1 = new Student("Mike", "1");
        Student s2 = new Student("Thomas", "2");
//        s1.name = "Mike";
//        s1.id = "1";
//        System.out.println(s1.id);
//        System.out.println(s1.name);
        s1.printDetails();

        Calculator calculator = new Calculator();
        int jojo = calculator.add(10, 5);
        // int result = 15;
        System.out.println(jojo);

       Teacher t1 = new Teacher("Joris", "joris.vanbreugel@code-cafe.nl");
       Student s3 = new Student("Sofia", "3");
       Course course = new Course(t1, s1, s2, s3);
        course.printDetails();
    }
}

