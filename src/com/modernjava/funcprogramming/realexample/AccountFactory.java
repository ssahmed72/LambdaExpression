package com.modernjava.funcprogramming.realexample;

public interface AccountFactory {
    public abstract BankAccount getBankAccount(int id, double balance, String accountName);
}
