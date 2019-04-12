package JavaSE1_1.project.banking.bank5_0.banking;

public class Bank {
    private Customer[] customers;
    private int numberOfCustomer;

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    public Customer getCustomers(int index) {
        if (index >= 0 && index < numberOfCustomer)
            return customers[index];
        else
            return null;
    }

    public void addCustomer(String firstName, String lastName) {
        Customer customer = new Customer(firstName, lastName);
        customers[numberOfCustomer++] = customer;

    }
}
