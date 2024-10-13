package org.example;

public class CreditCard implements Cash{
    Cash cash;
    public CreditCard() {

    };
    private void sendMoneyToAccount(int money) {
        System.out.println("Sent money to account: " + money + "$");
    }
    public void pay(int amount){
        if(cash == null) cash = new CashImpl();
        cash.pay(amount);
        sendMoneyToAccount(amount);
    }
}
