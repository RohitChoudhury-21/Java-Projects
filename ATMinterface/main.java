package ATMinterface;

import java.util.Scanner;

// Step 7: Main class to run the ATM program
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 4: Create a bank account with initial balance
        BankAccount bankAccount = new BankAccount(0);

        // Step 5: Connect ATM with the bank account
        ATM atm = new ATM(bankAccount);

        // Step 2: User interface for the ATM
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");

        boolean exit = false;
        while (!exit) {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Withdraw
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 2: // Deposit
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3: // Check Balance
                    atm.checkBalance();
                    break;
                case 4: // Exit
                    exit = true;
                    System.out.println("Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
