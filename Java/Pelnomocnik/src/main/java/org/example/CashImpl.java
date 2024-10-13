package org.example;

public class CashImpl implements Cash{
    public CashImpl() {};

    public void pay(int amount) {
        System.out.println("Paying: " + amount + "$");
    }
}
