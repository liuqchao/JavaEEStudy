package JavaSE1_1._1basic.src.project.banking.bank7.banking;

public class Customer {
    private String firstName;
    private String lastname;
    private Account[] accounts;
    private int numberOfAccount;

    public Customer(String firstName, String lastname) {
        this.firstName = firstName;
        this.lastname = lastname;
        accounts = new Account[5];
        numberOfAccount = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public Account getAccount(int index) {
        return accounts[index];
    }


    public void addAccount(Account acct) {
        if (numberOfAccount < 5) {
            accounts[numberOfAccount++] = acct;
        }
    }

    public int getNumberOfAccount() {
        return numberOfAccount;
    }
}
