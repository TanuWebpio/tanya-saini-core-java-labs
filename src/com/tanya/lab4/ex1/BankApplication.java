package com.tanya.lab4.ex1;

public class BankApplication {

    public static void main(String[] args) {

        // (a) Create persons
        Person smith = new Person("Smith", 30);
        Person kathy = new Person("Kathy", 28);

        // Create accounts
        SavingAccount smithAcc = new SavingAccount(smith, 2000);
        SavingAccount kathyAcc = new SavingAccount(kathy, 3000);

        // (b) Deposit INR 2000 to Smith's account
        smithAcc.deposit(2000);

        // (c) Withdraw INR 2000 from Kathy's account
        kathyAcc.withdraw(2000);

        // (d) Display updated balances
        System.out.println("Updated Account Details:");
        smithAcc.display();
        kathyAcc.display();

        // (e) Demonstrate CurrentAccount
        CurrentAccount currentAcc =
                new CurrentAccount(new Person("John", 35), 1000, 5000);

        currentAcc.withdraw(4000);

        System.out.println("Current Account Details:");
        currentAcc.display();
    }
}