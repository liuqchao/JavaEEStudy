package JavaSE1_1._1basic.src.project.banking.bank5_2.banking;

public class CheckingAccount extends Account {
    protected SavingAccount protectedBy = null;

    public CheckingAccount(double balance) {
        super(balance);
    }

    public CheckingAccount(double balance, CheckingAccount checkingAccount) {
        super(balance);
    }

    public CheckingAccount(double balance, SavingAccount protect) {
        super(balance);
        this.protectedBy = protect;
    }


    public boolean withdraw(double amt) {
        if (balance >= amt) {
            balance -= amt;
            return true;
        } else {
            if (protectedBy != null && ((amt - balance )<= protectedBy.getBalance())) {
                protectedBy.withdraw(amt - balance);
                balance = 0;


            } else {
                return false;
            }
            return true;
        }
    }

}



