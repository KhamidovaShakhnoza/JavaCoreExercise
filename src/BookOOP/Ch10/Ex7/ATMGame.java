package BookOOP.Ch10.Ex7;

import java.util.Scanner;

public class ATMGame {
    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100);
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Prompt user to enter an ID
            System.out.print("Enter an account ID (0-9): ");
            int id = scanner.nextInt();

            // Validate the ID
            while (id < 0 || id >= accounts.length) {
                System.out.print("Invalid ID. Please enter a valid account ID (0-9): ");
                id = scanner.nextInt();
            }

            Account currentAccount = accounts[id];

            while (true) {
                // Display main menu
                System.out.println("\nMain Menu:");
                System.out.println("1: View Current Balance");
                System.out.println("2: Withdraw Money");
                System.out.println("3: Deposit Money");
                System.out.println("4: Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        // View current balance
                        System.out.printf("Current balance: $%.2f%n", currentAccount.getBalance());
                        break;

                    case 2:
                        // Withdraw money
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        if (withdrawAmount <= currentAccount.getBalance()) {
                            currentAccount.withdraw(withdrawAmount);
                            System.out.printf("Successfully withdrew $%.2f. New balance: $%.2f%n", withdrawAmount, currentAccount.getBalance());
                        } else {
                            System.out.println("Insufficient funds.");
                        }
                        break;

                    case 3:
                        // Deposit money
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        currentAccount.deposit(depositAmount);
                        System.out.printf("Successfully deposited $%.2f. New balance: $%.2f%n", depositAmount, currentAccount.getBalance());
                        break;

                    case 4:
                        // Exit to ID prompt
                        System.out.println("Exiting to account selection...");
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }

                // Break out of menu loop if user chooses to exit
                if (choice == 4) {
                    break;
                }
            }
        }
    }
}
