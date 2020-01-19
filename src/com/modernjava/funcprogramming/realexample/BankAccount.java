package com.modernjava.funcprogramming.realexample;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiFunction;

public class BankAccount {
    private int id;
    private double balance;
    private String accountName;
    final Lock lock = new ReentrantLock();
    BiFunction<Double, Double, Double> subtractFunction = (a,b) -> a-b;
    BiFunction<Double, Double, Double> addFunction = (a,b) -> a + b;

    public BankAccount (int id, double balance, String accountName){
        this.id = id;
        this.balance=balance;
        this.accountName = accountName;
    }

    public boolean withdraw (double amount) throws InterruptedException {
        if(this.lock.tryLock()){
            Thread.sleep(100);
            balance = subtractFunction.apply(balance, amount);
            this.lock.unlock();
            return true;
        }
        return false;
    }

    public boolean deposit (double amount) throws InterruptedException {
        if(this.lock.tryLock()){
            Thread.sleep(100);
            balance= addFunction.apply(balance,amount);
            this.lock.unlock();
            return true;
        }
        return false;
    }


    public boolean transfer (BankAccount to, double amount) throws InterruptedException {
        if(withdraw(amount)){
            System.out.println("Withdrawing amount: " + amount + " from: " + getAccountName());
            if(to.deposit(amount)){
                System.out.println("Depositing amount:" + amount + " to: " + to.getAccountName());
                return true;
            }else{
                System.out.println("Failed to acquire both locks: refunding " + amount + " to: " + accountName);
                while (!deposit(amount))
                    continue;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", balance=" + balance +
                ", accountName='" + accountName + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
