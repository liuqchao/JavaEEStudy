package JavaSE1_1.project.banking.bank8.banking;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Customer> customers = new ArrayList<>();


    private static Bank bank = new Bank();

    public static Bank getBanking() {
        return bank;
    }

    private Bank() {
    }

    public Customer getCustomers(int index) {
        return customers.get(index);
    }

    public void addCustomer(String firstName, String lastName) {
        customers.add(new Customer(firstName, lastName));


    }

    public int getNumberOfCustomer() {
        return customers.size();
    }

}
