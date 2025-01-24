package BookOOP.Ch11.Ex2;

public class Student extends Person{
    private String classStatus;

    public Student(String name, String address, String phoneNumber, String email, String classStatus) {
        super(name, address, phoneNumber, email);
        this.classStatus = classStatus;
    }

    @Override
    public String toString() {
        return "Student[name=' " +getName()+"']";
    }
}
