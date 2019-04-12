package JavaSE1_1.project.banking.bank8.banking;

import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastname;
    private ArrayList<Account> accounts=new ArrayList<>(5);
    private int numberOfAccount;

    public Customer(String firstName, String lastname) {
        this.firstName = firstName;
        this.lastname = lastname;

        numberOfAccount = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public Account getAccount(int index) {
        return accounts.get(index);
    }


    public void addAccount(Account acct) {
        if (numberOfAccount < 5) {
            accounts.add(acct);
        }
    }

    public int getNumberOfAccount() {
        return numberOfAccount;
    }
}
