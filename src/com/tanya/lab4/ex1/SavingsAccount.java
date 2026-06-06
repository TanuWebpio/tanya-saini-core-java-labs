package com.tanya.lab4.ex1;

class SavingAccount extends Account {

    private final double minimumBalance = 500;

    public SavingAccount(Person accHolder, double balance) {
        super(accHolder, balance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= minimumBalance) {
            balance -= amount;
            return true;
        }
        System.out.println("Withdrawal denied! Minimum balance must be maintained.");
        return false;
    }
}

