package JavaSE1_1._1basic.src.project.banking.bank7.banking;

public class CheckingAccount extends Account {
    private double overdraftProtection;

    public CheckingAccount(double balance) {
        super(balance);
    }

    public CheckingAccount(double balance, double overdraftProtection) {
        super(balance);
        this.overdraftProtection = overdraftProtection;
    }

    public double getOverdraftProtection() {
        return overdraftProtection;
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
            throw new OverdraftException("资金不足，别花了",(amt-balance));
        }

    }


}
