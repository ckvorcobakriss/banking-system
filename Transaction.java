// Transaction.java
import java.time.LocalDateTime;

public class Transaction {
    private LocalDateTime timestamp;
    private Account sourceAccount;
    private Account destinationAccount;
    private double amount;

    public Transaction(Account sourceAccount, Account destinationAccount, double amount) {
        this.timestamp = LocalDateTime.now();
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.amount = amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public Account getSourceAccount() {
        return sourceAccount;
    }

    public Account getDestinationAccount() {
        return destinationAccount;
    }

    public double getAmount() {
        return amount;
    }

    public void displayTransactionInfo() {
        System.out.println("Timestamp: " + timestamp + ", Source Account: " +
                sourceAccount.getAccountNumber() + ", Destination Account: " +
                destinationAccount.getAccountNumber() + ", Amount: $" + amount);
    }
}
