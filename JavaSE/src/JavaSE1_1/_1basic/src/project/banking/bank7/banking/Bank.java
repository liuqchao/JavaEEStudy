package JavaSE1_1._1basic.src.project.banking.bank7.banking;

public class Bank {
    private Customer[] customer;
    private int numberOfCustomer;

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }


    private static Bank bank=new Bank();

    public static Bank getBanking(){
        return  bank;
    }
    private Bank() {
        customer = new Customer[5];
    }

    public Customer getCustomers(int index) {
        if (index >= 0 && index < numberOfCustomer)
            return customer[index];
        else
            return null;
    }

    public void addCustomer(String firstName, String lastName) {
        Customer cst = new Customer(firstName, lastName);
        customer[numberOfCustomer++] = cst;

    }


}
