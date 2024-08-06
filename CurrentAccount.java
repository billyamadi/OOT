public class CurrentAccount extends BaseAccount {
    public CurrentAccount(String accountNumber, String accountType, double balance, double interestRate, String dateCreated, String customerID) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.interestRate = interestRate;
        this.dateCreated = dateCreated;
        this.customerID = customerID;
    }

    // Additional methods specific to CurrentAccount can be added here
}
