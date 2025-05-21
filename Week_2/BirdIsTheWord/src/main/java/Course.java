import java.util.List;

public class Course {
    Teacher teacher;
    List<Student> students;

    public Course(Teacher teacher, Student... students) {
        this.teacher = teacher;
        this.students = List.of(students);
    }

    void printDetails() {
        this.teacher.printDetails();
//        for (int i = 0; i < students.size(); i++) {}
        for (Student student : students) {
            student.printDetails();
        }
    }
}
