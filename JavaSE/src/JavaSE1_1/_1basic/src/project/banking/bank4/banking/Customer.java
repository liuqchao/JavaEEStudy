package JavaSE1_1._1basic.src.project.banking.bank4.banking;

public class Customer {
    private String firstName;
    private String lastname;
    private Account account;

    public Customer(String firstName, String lastname) {
        this.firstName = firstName;
        this.lastname = lastname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account acct) {
        this.account = acct;
    }

}
