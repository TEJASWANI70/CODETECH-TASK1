import java.util.ArrayList;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private String email;
    private double balance;
    private ArrayList<Transaction> transactionHistory;

    public BankAccount(String accountNumber, String accountHolderName, String email) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.email = email;
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
    }

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }
        balance += amount;
        transactionHistory.add(new Transaction("Deposit", amount, balance));
        System.out.println("Deposited $" + amount + " successfully.");
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }
        balance -= amount;
        transactionHistory.add(new Transaction("Withdraw", amount, balance));
        System.out.println("Withdrew $" + amount + " successfully.");
    }
}