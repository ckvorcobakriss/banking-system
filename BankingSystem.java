// BankingSystem.java
public class BankingSystem {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John Doe", "john@example.com");
        Customer customer2 = new Customer("Jane Doe", "jane@example.com");

        Account account1 = new Account(1, 1000.0);
        Account account2 = new Account(2, 500.0);

        customer1.addAccount(account1);
        customer2.addAccount(account2);

        Transaction transaction1 = new Transaction(account1, account2, 200.0);
        account1.addTransaction(transaction1);
        account2.addTransaction(transaction1);

        System.out.println("Customer Information:");
        customer1.displayCustomerInfo();
        System.out.println();
        customer2.displayCustomerInfo();
    }
}
