package BookOOP.Ch11.Ex2;

import java.util.Date;

public class Employee extends Person {
    private String office;
    private int salary;
    private Date hireDate;

    public Employee(String name, String address, String phoneNumber, String email, String office, int salary, Date hireDate) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getOffice() {
        return office;
    }

    public int getSalary() {
        return salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    @Override
    public String toString() {
        return "Employee[name=' "+getName()+"']";
    }
}
