package BookOOP.Ch9;

public class AccountTest {
    public static void main(String[] args) {
      Account account = new Account(1122,20000,4.5);
      account.withdraw(2500);
      account.deposit(3000);
        System.out.println(account.printInfo());
    }
}
