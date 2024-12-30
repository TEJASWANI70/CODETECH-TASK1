import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {
    private String type;
    private double amount;
    private double balanceAfterTransaction;
    private String timestamp;

    public Transaction(String type, double amount, double balanceAfterTransaction) {
        this.type = type;
        this.amount = amount;
        this.balanceAfterTransaction = balanceAfterTransaction;
        this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    @Override
    public String toString() {
        return "[" + timestamp + "] " + type + ": $" + amount + " | Balance: $" + balanceAfterTransaction;
    }
}