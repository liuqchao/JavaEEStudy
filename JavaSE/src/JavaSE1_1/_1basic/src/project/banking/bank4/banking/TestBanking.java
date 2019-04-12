package JavaSE1_1._1basic.src.project.banking.bank4.banking;

public class TestBanking {
    public static void main(String[] args) {
        Customer[] customers=new Customer[5];

        customers[0]=new Customer("Jane", "Smith");
        customers[1]=new Customer("Bryant", "Owen");
        customers[2]=new Customer("Soley", "Tim");
        customers[3]=new Customer("Soley", "Maria");
        System.out.println(customers[0].getFirstName()+";"+customers[0].getLastname());
        System.out.println(customers[1].getFirstName()+";"+customers[1].getLastname());
        System.out.println(customers[2].getFirstName()+";"+customers[2].getLastname());
        System.out.println(customers[3].getFirstName()+";"+customers[3].getLastname());

    }
}
