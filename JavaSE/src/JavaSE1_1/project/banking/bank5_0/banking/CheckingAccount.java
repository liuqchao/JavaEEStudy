package JavaSE1_1.project.banking.bank5_0.banking;

public class CheckingAccount extends Account {
    private double overdraftProtection;

    public CheckingAccount(double balance) {
        super(balance);
    }

    public CheckingAccount(double balance, double overdraftProtection) {
        super(balance);
        this.overdraftProtection = overdraftProtection;
    }

    public boolean withdraw(double amt) {
        if (balance >= amt) {
            balance -= amt;
            return true;
        } else if (amt - balance <= overdraftProtection) {
            balance = 0;
            overdraftProtection -= amt - balance;
            return true;
        }else
        {
            return false;
        }

    }


}
