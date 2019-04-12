package JavaSE1_1.project.banking.bank5_2.banking;

public class SavingAccount extends Account {
    private double interstRate;

    public SavingAccount(double balance, double interstRate) {
        super(balance);
        this.interstRate = interstRate;
    }

    public double getInterstRate() {
        return interstRate;
    }
}
