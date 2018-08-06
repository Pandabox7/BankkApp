package com.bank;

public class Account {
    private double balance;
    private long accountNumber;
    private String currency;

    public Account(double balance, long accountNumber, String currency) {
        this.balance = balance=0;
        this.accountNumber = accountNumber=100000 + (long)Math.random()*1000000000L);
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", currency='" + currency + '\'' +
                '}';
    }
}
