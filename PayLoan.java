import java.util.Date;

public class PayLoan extends BaseTransaction {
    private String accountNumber;

    public PayLoan(String t004, String payLoan, double v, String completed, Date date, String a004) {
        super();
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }
}
