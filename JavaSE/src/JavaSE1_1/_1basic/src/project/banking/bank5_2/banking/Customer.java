package JavaSE1_1._1basic.src.project.banking.bank5_2.banking;

public class Customer {
    private String firstName;
    private String lastname;
    protected CheckingAccount checkingAccount=null;
    protected SavingAccount savingAccount=null;

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

    public CheckingAccount getCheckingAccount() {
        return checkingAccount;
    }

    public SavingAccount getSavingAccount() {
        return savingAccount;
    }

    public void setCheckingAccount(CheckingAccount checkingAccount) {
        this.checkingAccount = checkingAccount;
    }

    public void setSavingAccount(SavingAccount savingAccount) {
        this.savingAccount = savingAccount;
    }
}
