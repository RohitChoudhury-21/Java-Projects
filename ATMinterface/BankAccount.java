package ATMinterface;

import java.util.Scanner;

// Step 4: Create a class to represent the user's bank account
public class BankAccount {
    private double balance;

    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw money from the account
    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false; // Insufficient balance
        }
    }

    // Method to check the balance
    public double checkBalance() {
        return balance;
    }
}
