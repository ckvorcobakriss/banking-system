// Customer.java
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String email;
    private List<Account> accounts;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void displayCustomerInfo() {
        System.out.println("Customer Name: " + name + ", Email: " + email);
        System.out.println("Accounts:");
        for (Account account : accounts) {
            account.displayAccountInfo();
            System.out.println();
        }
    }
}
