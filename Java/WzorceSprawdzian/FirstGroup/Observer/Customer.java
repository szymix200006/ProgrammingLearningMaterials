package wisniowa.tc.FirstGroup.Observer;

public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " received message: " + message);
    }
}
