package wisniowa.tc.FirstGroup.Proxy;

public class CashImpl implements Cash{
    public CashImpl() {
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying: " + amount);
    }
}
