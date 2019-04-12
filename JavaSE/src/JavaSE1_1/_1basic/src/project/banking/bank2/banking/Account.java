package JavaSE1_1._1basic.src.project.banking.bank2.banking;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        balance += amt;

    }

    public void withdraw(double amt) {
        if (balance >= amt) {
            balance -= amt;
        }
    }

}

