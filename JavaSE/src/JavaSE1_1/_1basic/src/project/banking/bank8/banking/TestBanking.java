package JavaSE1_1._1basic.src.project.banking.bank8.banking;

public class TestBanking {
    public static void main(String[] args) {
        Bank bank = Bank.getBanking();
        Customer customer;
        Account  account;

        // Create two customers and their accounts
        bank.addCustomer("Jane", "Simms");
        customer = bank.getCustomers(0);
        customer.addAccount(new SavingAccount(500.00, 0.05));
        customer.addAccount(new CheckingAccount(200.00, 500.00));
        bank.addCustomer("Owen", "Bryant");
        customer = bank.getCustomers(1);
        customer.addAccount(new CheckingAccount(200.00));

        // Test the checking account of Jane Simms (with overdraft protection)
        customer = bank.getCustomers(0);
        account = customer.getAccount(1);
        System.out.println("Customer [" + customer.getLastname()
                + ", " + customer.getFirstName() + "]"
                + " has a checking balance of "
                + account.getBalance()
                + " with a 500.00 overdraft protection.");
        try {
            System.out.println("Checking Acct [Jane Simms] : withdraw 150.00");
            account.withdraw(150.00);
            System.out.println("Checking Acct [Jane Simms] : deposit 22.50");
            account.deposit(22.50);
            System.out.println("Checking Acct [Jane Simms] : withdraw 147.62");
            account.withdraw(147.62);
            System.out.println("Checking Acct [Jane Simms] : withdraw 470.00");
            account.withdraw(470.00);
        } catch (OverdraftException e1) {
            System.out.println("Exception: " + e1.getMessage()
                    + "   Deficit: " + e1.getDeficit());
        } finally {
            System.out.println("Customer [" + customer.getLastname()
                    + ", " + customer.getFirstName() + "]"
                    + " has a checking balance of "
                    + account.getBalance());
        }
        System.out.println();

        // Test the checking account of Owen Bryant (without overdraft protection)
        customer = bank.getCustomers(1);
        account = customer.getAccount(0);
        System.out.println("Customer [" + customer.getLastname()
                + ", " + customer.getFirstName() + "]"
                + " has a checking balance of "
                + account.getBalance());
        try {
            System.out.println("Checking Acct [Owen Bryant] : withdraw 100.00");
            account.withdraw(100.00);
            System.out.println("Checking Acct [Owen Bryant] : deposit 25.00");
            account.deposit(25.00);
            System.out.println("Checking Acct [Owen Bryant] : withdraw 175.00");
            account.withdraw(175.00);
        } catch (OverdraftException e1) {
            System.out.println("Exception: " + e1.getMessage()
                    + "   Deficit: " + e1.getDeficit());
        } finally {
            System.out.println("Customer [" + customer.getLastname()
                    + ", " + customer.getFirstName() + "]"
                    + " has a checking balance of "
                    + account.getBalance());
        }
    }
}
