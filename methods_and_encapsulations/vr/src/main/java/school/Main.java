package school;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Joshua", "1");
        Teacher teacher = new Teacher("John", "2");
        Course course = new Course(teacher, student);

        Student student2 = new Student("John", "2");
        Student student3 = new Student("Jane", "3");
        Student student4 = new Student("Jack", "4");

        course.addStudents(student2, student3, student4);

        List<Student> students = course.getStudents();
        for (Student s : students) {
            s.printDetails();
        }

//        students.clear(); // gooit lijst leeg

        course.printDetails();
//        var students = course.getStudents();
    }
}
