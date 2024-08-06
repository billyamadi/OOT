import java.util.Date;

public abstract class BaseTransaction implements Transaction {
    protected String transactionID;
    protected String transactionType;
    protected double amount;
    protected String transactionStatus;
    protected Date transactionDate;

    @Override
    public String getTransactionID() {
        return transactionID;
    }

    @Override
    public String getTransactionType() {
        return transactionType;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public String getTransactionStatus() {
        return transactionStatus;
    }

    @Override
    public Date getTransactionDate() {
        return transactionDate;
    }
}
