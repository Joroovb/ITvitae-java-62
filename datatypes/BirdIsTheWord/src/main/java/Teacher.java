public class Teacher {
    String name;
    String mail;

    public Teacher(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }

    void printDetails() {
        System.out.println("Teacher - name: " + name + " mail: " + mail);
    }
}
