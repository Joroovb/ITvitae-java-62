package school;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private Teacher teacher;
    private List<Student> students = new ArrayList<>();

    public Course(Teacher teacher, Student... students) {
        this.teacher = teacher;
        this.students.addAll(List.of(students));
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return List.copyOf(students); // defensive copy
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void addStudents(Student... students) {
        for (Student student : students) {
            this.addStudent(student);
        }
    }

    void printDetails() {
        this.teacher.printDetails();
        for (Student student : students) {
            student.printDetails();
        }
    }
}
