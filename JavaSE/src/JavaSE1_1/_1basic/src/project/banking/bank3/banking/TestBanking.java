package JavaSE1_1._1basic.src.project.banking.bank3.banking;

public class TestBanking {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane", "Smith");
        Account account = new Account(500);
        customer.setAccount(account);
        System.out.println("Create account:" + customer.getFirstName() + ";" + customer.getAccount().getBalance());

        System.out.println(customer.getAccount().withdraw(150));
        System.out.println(customer.getAccount().deposit(22.50));
        System.out.println(customer.getAccount().withdraw(47.62));
        System.out.println("Create account:" + customer.getFirstName() + ";" + customer.getAccount().getBalance());
    }
}
