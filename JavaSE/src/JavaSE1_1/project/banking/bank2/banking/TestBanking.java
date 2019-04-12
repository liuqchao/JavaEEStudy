package JavaSE1_1.project.banking.bank2.banking;

public class TestBanking {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane", "Smith");
        Account account = new Account(500);
        customer.setAccount(account);
        System.out.println("Create account:" + customer.getFirstName() + ";" + customer.getAccount().getBalance());
        customer.getAccount().withdraw(150);
        customer.getAccount().deposit(22.50);
        customer.getAccount().withdraw(47.62);
        System.out.println("Create account:" + customer.getFirstName() + ";" + customer.getAccount().getBalance());
    }
}
