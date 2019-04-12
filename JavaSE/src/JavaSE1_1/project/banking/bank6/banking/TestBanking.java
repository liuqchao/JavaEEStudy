package JavaSE1_1.project.banking.bank6.banking;

public class TestBanking {
    public static void main(String[] args) {
        Bank bank=Bank.getBanking();

        Customer customer;
        String acountType;
        // Create several customers and their accounts
        bank.addCustomer("Jane", "Simms");
        customer = bank.getCustomers(0);
        customer.addAccount(new SavingAccount(500.00, 0.05));
        customer.addAccount(new CheckingAccount(200.00, 400.00));

        bank.addCustomer("Owen", "Bryant");
        customer = bank.getCustomers(1);
        customer.addAccount(new CheckingAccount(200.00));

        bank.addCustomer("Tim", "Soley");
        customer = bank.getCustomers(2);
        customer.addAccount(new SavingAccount(1500.00, 0.05));
        customer.addAccount(new CheckingAccount(200.00));

        bank.addCustomer("Maria", "Soley");
        customer = bank.getCustomers(3);
        // Maria and Tim have a shared checking account
        customer.addAccount(bank.getCustomers(2).getAccount(1));
        customer.addAccount(new SavingAccount(150.00, 0.05));

        System.out.println("\t\t\tCUSTOMERS REPORT");
        System.out.println("\t\t\t================");

        for (int cust_idx = 0; cust_idx < bank.getNumberOfCustomer(); cust_idx++) {
            customer = bank.getCustomers(cust_idx);
            System.out.println("Customer:" + customer.getFirstName() + customer.getLastname());

            for (int acct_idx = 0; acct_idx < customer.getNumberOfAccount(); acct_idx++) {

                Account account = customer.getAccount(acct_idx);
                if (account instanceof SavingAccount) {

                    System.out.println("Saving Account" + ((SavingAccount) account).getInterstRate());
                } else if (account instanceof CheckingAccount) {
                    acountType = "Checking Account";
                    System.out.println(acountType + ((CheckingAccount) account).getOverdraftProtection());
                }


            }

        }


    }
}
