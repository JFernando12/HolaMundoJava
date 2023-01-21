package Models;

public class Patient extends User{
    private int age;

    Patient(String name, String email) {
        super(name, email);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
