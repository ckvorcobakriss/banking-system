// Account.java
import java.util.ArrayList;
import java.util.List;

public class Account {
    private int accountNumber;
    private double balance;
    private List<Transaction> transactions;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient funds.");
            return false;
        }
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber + ", Balance: $" + balance);
        System.out.println("Transactions:");
        for (Transaction transaction : transactions) {
            transaction.displayTransactionInfo();
            System.out.println();
        }
    }
}
