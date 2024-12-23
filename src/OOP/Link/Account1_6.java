package OOP.Link;

public class Account1_6 {
    private String id;
    private String name;
    private int balance=0;

    public Account1_6(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account1_6(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public int credit(int amount) {
        return balance + amount;
    }
    public int debit(int amount) {
        if(amount<=balance)return balance - amount;
        else{
            System.out.println( "Amount exceeded balance");
            return balance;
        }
    }
    public int transferTo(Account1_6 destination, int amount) {
        if(amount<=balance)return amount;
        else if(amount>balance){
            System.out.println( "Amount exceeded balance");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account1_6{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
