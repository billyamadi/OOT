import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create customers
        Customer customer1 = new Customer("C001", "Alice Smith", "123 Maple Street", "555-1234", "alice@example.com", "1980-05-01", "A123456");
        Customer customer2 = new Customer("C002", "Bob Johnson", "456 Oak Avenue", "555-5678", "bob@example.com", "1975-10-12", "B789012");

        // Create accounts for customers
        CurrentAccount currentAccount1 = new CurrentAccount("A001", "Current", 1000.00, 0.0, "2024-01-01", "C001");
        LoanAccount loanAccount1 = new LoanAccount("A002", "Loan", 5000.00, 5.0, "2024-01-02", "C001", 5.0, "Staff001");

        CurrentAccount currentAccount2 = new CurrentAccount("A003", "Current", 2000.00, 0.0, "2024-01-03", "C002");
        LoanAccount loanAccount2 = new LoanAccount("A004", "Loan", 3000.00, 5.0, "2024-01-04", "C002", 5.0, "Staff002");

        // Add accounts to customer1
        List<Account> customer1Accounts = new ArrayList<>();
        customer1Accounts.add(currentAccount1);
        customer1Accounts.add(loanAccount1);
        customer1.setAccounts(customer1Accounts);

        // Add accounts to customer2
        List<Account> customer2Accounts = new ArrayList<>();
        customer2Accounts.add(currentAccount2);
        customer2Accounts.add(loanAccount2);
        customer2.setAccounts(customer2Accounts);

        // Perform some transactions for customer1
        Deposit deposit1 = new Deposit("T001", "Deposit", 500.00, "Completed", new Date(), "A001");
        Withdraw withdraw1 = new Withdraw("T002", "Withdraw", 7000.00, "Completed", new Date(), "A001");
        MoneyTransfer transfer1 = new MoneyTransfer("T003", "Transfer", 300.00, "Completed", new Date(), currentAccount1, currentAccount2);

        // Perform a loan payment for customer2
        PayLoan payLoan1 = new PayLoan("T004", "PayLoan", 400.00, "Completed", new Date(), "A004");

        // Perform a money transfer from customer1 to customer2
        MoneyTransfer transfer2 = new MoneyTransfer("T005", "Transfer", 500.00, "Completed", new Date(), currentAccount1, currentAccount2);

        // Process transactions for customer1
        currentAccount1.deposit(deposit1.getAmount());
        currentAccount1.withdraw(withdraw1.getAmount());
        currentAccount1.transfer(transfer1.getAmount(), loanAccount1);

        // Process loan payment for customer2
        loanAccount2.payLoan(payLoan1.getAmount());

        // Process money transfer from customer1 to customer2
        currentAccount1.transfer(transfer2.getAmount(), currentAccount2);

        // Print out updated account balances for customer1
        System.out.println("Updated Balance of Current Account (A001): " + currentAccount1.getBalance());
        System.out.println("Updated Balance of Loan Account (A002): " + loanAccount1.getBalance());

        // Print out updated account balances for customer2
        System.out.println("Updated Balance of Current Account (A003): " + currentAccount2.getBalance());
        System.out.println("Updated Balance of Loan Account (A004): " + loanAccount2.getBalance());
    }
}
