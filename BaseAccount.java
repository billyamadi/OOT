public class BaseAccount implements Account {
    protected String accountNumber;
    protected String accountType;
    protected double balance;
    protected double interestRate;
    protected String dateCreated;
    protected String customerID;

    // Implement getters from Account interface
    //@Override
    public String getAccountNumber() {
        return accountNumber;
    }

    //@Override
    public String getAccountType() {
        return accountType;
    }

    //@Override
    public double getBalance() {
        return balance;
    }

    //@Override
    public double getInterestRate() {
        return interestRate;
    }

    //@Override
    public String getDateCreated() {
        return dateCreated;
    }

    // Methods for basic operations
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient balance. Withdrawal of " + amount + " failed. Current balance: " + balance);
        }
    }

    public void transfer(double amount, BaseAccount destinationAccount) {
        if (amount <= balance) {
            balance -= amount;
            destinationAccount.deposit(amount);
            System.out.println("Transferred " + amount + " to account " + destinationAccount.getAccountNumber() + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient balance for transfer. Transfer of " + amount + " failed. Current balance: " + balance);
        }
    }
}
