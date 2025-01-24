package BookOOP.Ch9;

public class Account {
    private int id;
    private double balance;
    private  double annualInterestRate;
    Account(){}

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    public double getMonthlyInterestRate(){
        return this.annualInterestRate/12;
    }
    public double getMonthlyInterest(){
        return this.balance*getMonthlyInterestRate();
    }
    public double withdraw(double amount){
        return this.balance-amount;
    }
    public void deposit(double amount){
        this.balance+=amount;

    }


    public String printInfo() {
        return "Account{" + ", balance=" + balance +
                ", monthly interest=" + getMonthlyInterest() +
                '}';
    }
}
