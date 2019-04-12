package JavaSE1_1._1basic.src.project.banking.bank5_1.banking;

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
