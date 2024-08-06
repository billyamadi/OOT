public class LoanAccount extends BaseAccount {
    private double loanPeriod;
    private String approvedBy;

    public LoanAccount(String accountNumber, String accountType, double balance, double interestRate, String dateCreated, String customerID, double loanPeriod, String approvedBy) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.interestRate = interestRate;
        this.dateCreated = dateCreated;
        this.customerID = customerID;
        this.loanPeriod = loanPeriod;
        this.approvedBy = approvedBy;
    }

    // Getters
    public double getLoanPeriod() {
        return loanPeriod;
    }

    public String getApprover() {
        return approvedBy;
    }

    @Override
    public double getInterestRate() {
        return interestRate; // Overriding if needed
    }

    public void payLoan(double amount) {
    }

    // Additional methods specific to LoanAccount can be added here
}
