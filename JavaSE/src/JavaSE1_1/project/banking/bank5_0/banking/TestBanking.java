package JavaSE1_1.project.banking.bank5_0.banking;

public class TestBanking {
    public static void main(String[] args) {
        Customer[] customers=new Customer[5];
SavingAccount savingAccount=new SavingAccount(500,0.03);

        customers[0]=new Customer("Jane", "Smith");
        customers[0].setAccount(savingAccount);

        CheckingAccount checkingAccount=new CheckingAccount(500,0);
        customers[1]=new Customer("Bryant", "Owen");
        customers[1].setAccount(checkingAccount);

        checkingAccount=new CheckingAccount(500,500);
        customers[2]=new Customer("Soley", "Tim");
        customers[2].setAccount(checkingAccount);

        customers[3]=new Customer("Soley", "Maria");
        customers[3].setAccount(customers[2].getAccount());

        System.out.println(customers[0].getFirstName()+";"+customers[0].getLastname()+customers[0].getAccount().balance);
        System.out.println(customers[1].getFirstName()+";"+customers[1].getLastname()+customers[1].getAccount().balance);
        System.out.println(customers[2].getFirstName()+";"+customers[2].getLastname()+customers[2].getAccount().balance);
        System.out.println(customers[3].getFirstName()+";"+customers[3].getLastname()+customers[3].getAccount().balance);

    }
}
