package JavaSE1_1._1basic.src.project.banking.bank1.banking;

public class TestBanking {
    public static void main(String[] args) {

        Account account=new Account(500);
        account.withdraw(150);
        account.deposit(22.5);
        account.withdraw(47.62);
        System.out.println(account.getBalance());

    }
}
