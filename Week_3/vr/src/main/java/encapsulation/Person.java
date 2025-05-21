package encapsulation;

public class Person {
    private String email;
    private String password;
    private int age;

    public Person(String email, String password, int age) {
        this.email = email;
        this.password = password;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age++;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        // is dit een geldige email
        // zo ja
            // dan waarde aanpassen
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }
}
