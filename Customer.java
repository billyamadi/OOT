import java.util.List;

public class Customer {
    private String customerID;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    private String dateOfBirth;
    private String nationalID;
    private List<Account> accounts;

    public Customer(String customerID, String name, String address, String phoneNumber, String email, String dateOfBirth, String nationalID) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.nationalID = nationalID;
    }

    // Getters and Setters
    public String getCustomerID() {
        return customerID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getNationalID() {
        return nationalID;
    }
}
