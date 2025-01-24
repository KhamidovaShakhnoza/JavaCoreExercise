package BookOOP.Ch10.Ex7;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private  double annualInterestRate;
    private Date dateCreated;

    // No-arg constructor
    public Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    // Constructor with id and initial balance
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    // Accessor and mutator for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Accessor and mutator for balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Accessor and mutator for annualInterestRate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // Accessor for dateCreated
    public Date getDateCreated() {
        return dateCreated;
    }

    // Method to get monthly interest rate
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12 / 100;
    }

    // Method to get monthly interest
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
    }
}
