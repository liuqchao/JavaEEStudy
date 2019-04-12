package JavaSE1_1._1basic.src.project.banking.bank7.banking;

public class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amt) {
        balance += amt;
        return true;
    }

    public boolean withdraw(double amt) {
        if (balance >= amt) {
            balance -= amt;
            return true;
        } else {
            throw new OverdraftException("资金不足", amt - balance);
        }
    }

}

