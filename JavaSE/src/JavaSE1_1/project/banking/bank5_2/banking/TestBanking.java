package JavaSE1_1.project.banking.bank5_2.banking;

public class TestBanking {
    public static void main(String[] args) {

        Bank bank = new Bank();
        Customer customer;
        Account account;

        bank.addCustomer("Jane", "Simms");
        customer = bank.getCustomers(0);
        customer.setSavingAccount(new SavingAccount(500.00, 0.5));
        customer.setCheckingAccount(new CheckingAccount(200.0, customer.getCheckingAccount()));

        System.out.println( customer.getSavingAccount().withdraw(150));
        System.out.println(customer.getSavingAccount().deposit(22.50));
        System.out.println(customer.getSavingAccount().withdraw(147.62));
        System.out.println(customer.getSavingAccount().getBalance());

     /*   bank.addCustomer("Owen", "Bryant");
        customer = bank.getCustomers(1);
        customer.setCheckingAccount(new CheckingAccount(200.00));

        System.out.println( customer.getSavingAccount().withdraw(100));
        System.out.println(customer.getSavingAccount().deposit(22.50));
        System.out.println(customer.getSavingAccount().withdraw(175));
        System.out.println(customer.getSavingAccount().getBalance());*/


    }
}
