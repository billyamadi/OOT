import java.util.Date;

public class MoneyTransfer extends BaseTransaction {
    private Account sourceAccount;
    private Account destinationAccount;

    public MoneyTransfer(String transactionID, String transactionType, double amount, String transactionStatus, Date transactionDate, Account sourceAccount, Account destinationAccount) {
        this.transactionID = transactionID;
        this.transactionType = transactionType;
        this.amount = amount;
        this.transactionStatus = transactionStatus;
        this.transactionDate = transactionDate;
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
    }

    // Getters
    public Account getSourceAccount() {
        return sourceAccount;
    }

    public Account getDestinationAccount() {
        return destinationAccount;
    }
}
