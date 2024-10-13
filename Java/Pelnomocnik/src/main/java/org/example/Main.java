package org.example;

public class Main {
    public static void main(String[] args) {
        Cash cash = new CreditCard();
        cash.pay(1_000_000);
    }
}