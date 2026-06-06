package com.tanya.lab4.ex1;

public class Account {
	private static long nextAccNum = 1001;

    protected long accNum;
    protected double balance;
    protected Person accHolder;

    public Account(Person accHolder, double balance) {
        this.accNum = nextAccNum++;
        this.accHolder = accHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance - amount >= 500) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public long getAccNum() {
        return accNum;
    }

    public void display() {
        System.out.println("Account Number : " + accNum);
        System.out.println("Account Holder : " + accHolder.getName());
        System.out.println("Balance        : INR " + balance);
        System.out.println();
    }
}
