package school;

public class Teacher {
    private String name;
    private String mail;

    public Teacher(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }

    void printDetails() {
        System.out.println("Teacher - name: " + name + " mail: " + mail);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
