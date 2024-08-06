import java.util.Date;

public class Withdraw extends BaseTransaction {
    private String accountNumber;

    public Withdraw(String transactionID, String transactionType, double amount, String transactionStatus, Date transactionDate, String accountNumber) {
        this.transactionID = transactionID;
        this.transactionType = transactionType;
        this.amount = amount;
        this.transactionStatus = transactionStatus;
        this.transactionDate = transactionDate;
        this.accountNumber = accountNumber;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }
}
