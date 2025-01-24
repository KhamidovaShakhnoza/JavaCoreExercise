package BookOOP.Ch11.Ex2;

import java.util.Date;

public class Staff extends Employee{
    private String title;

    public Staff(String name, String address, String phoneNumber, String email, String office, int salary, Date hireDate, String title) {
        super(name, address, phoneNumber, email, office, salary, hireDate);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff[name=' "+getName()+"']";
    }
}
