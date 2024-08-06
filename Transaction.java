import java.util.Date;

public interface Transaction {
    String getTransactionID();
    String getTransactionType();
    double getAmount();
    String getTransactionStatus();
    Date getTransactionDate();
}
