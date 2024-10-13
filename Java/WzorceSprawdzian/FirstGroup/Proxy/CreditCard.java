package wisniowa.tc.FirstGroup.Proxy;

public class CreditCard implements Cash{
    Cash cash;

    public CreditCard() {
    }

    public void sendMoneyToAccount() {
        System.out.println("Sending money to account.");
    }

    @Override
    public void pay(int amount) {
        if(cash == null) cash = new CashImpl();
        cash.pay(amount);
        sendMoneyToAccount();
    }
}
