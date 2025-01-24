package BookOOP.Ch11.Ex2;

import java.util.Date;

public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String email, String office, int salary, Date hireDate, String officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, hireDate);
        this.officeHours = officeHours;
        this.rank = rank;
    }



    @Override
    public String toString() {
        return "Faculty[name=" + getName() + "']";
    }
}
