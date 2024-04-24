package ATMinterface;

import java.util.Scanner;
public class ATM {
    private BankAccount bankAccount;

    // Step 5: Connect ATM with a bank account
    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    // Step 3: Implement method for withdrawing money
    public void withdraw(double amount) {
        if (bankAccount.withdraw(amount)) {
            System.out.println("Withdrawal successful. Remaining balance: " + bankAccount.checkBalance());
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }

    // Step 3: Implement method for depositing money
    public void deposit(double amount) {
        bankAccount.deposit(amount);
        System.out.println("Deposit successful. Updated balance: " + bankAccount.checkBalance());
    }

    // Step 3: Implement method for checking account balance
    public void checkBalance() {
        System.out.println("Your current balance: " + bankAccount.checkBalance());
    }
}
