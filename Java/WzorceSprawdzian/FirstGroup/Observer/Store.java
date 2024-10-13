package wisniowa.tc.FirstGroup.Observer;

import java.util.List;
import java.util.ArrayList;

public class Store {
    private List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    public void notifyCustomers() {
        for (Customer customer : customers) {
            customer.update("Message!");
        }
    }
}
