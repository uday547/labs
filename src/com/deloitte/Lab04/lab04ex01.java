package com.deloitte.Lab04;

import java.util.Random;

public class lab04ex01 {
    
    class Person {
        public String name;
        public Float age;
        
        public Person(String name, Float age) {
            this.name = name;
            this.age = age;
        }
        
        public String getName() {
            return name;
        }
        
        public void setName(String name) {
            this.name = name;
        }
        
        public float getAge() {
            return age;
        }
        
        public void setAge(Float age) {
            this.age = age;
        }
    }
    
    class Account {
        public Long accountNumber;
        public double balance;
        public String accountHolder;
        
        public Account(String accountHolder, double initialBalance) {
            Random rand = new Random();
            this.accountNumber = rand.nextLong();
            this.balance = initialBalance >= 500 ? initialBalance : 500;
            this.accountHolder = accountHolder;
        }
        
        public long getAccountNumber() {
            return accountNumber;
        }
        
        public String getAccountHolder() {
            return accountHolder;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
        
        public void deposit(double amount) {
            balance += amount;
        }
        
        public void withdraw(double amount) {
            if (balance - amount >= 500) {
                balance -= amount;
            } else {
                System.out.println("Minimum balance of 500 required, withdrawal not allowed");
            }
        }
    }
    
    class Savingsaccount extends Account {
        public final double minimumBalance = 500;

        public Savingsaccount(String accountHolder, double initialBalance) {
            super(accountHolder, initialBalance);
        }
        
        @Override
        public void withdraw(double amount) {
            if (getBalance() - amount >= minimumBalance) {
                setBalance(getBalance() - amount);
            } else {
                System.out.println("Minimum balance of 500 required, withdrawal not allowed");
            }
        }
    }
    
    class CurrentAccount extends Account {
        private double overdraftLimit;

        public CurrentAccount(String accountHolder, double initialBalance, double overdraftLimit) {
            super(accountHolder, initialBalance);
            this.overdraftLimit = overdraftLimit;
        }

        @Override
        public void withdraw(double amount) {
            if (getBalance() - amount >= -overdraftLimit) {
                setBalance(getBalance() - amount);
            } else {
                System.out.println("Withdrawal denied! Overdraft limit reached.");
            }
        } 
    }

    public static void main(String[] args) {
        lab04ex01 bank = new lab04ex01();
        
        Account smithAccount = bank.new Account("smith", 2000);
        Account kathyAccount = bank.new Account("kathy", 3000);
        
        smithAccount.deposit(2000);
        System.out.println("UPDATED BALANCE: " + smithAccount.getBalance());
        
        kathyAccount.deposit(2000);
        System.out.println("UPDATED BALANCE: " + kathyAccount.getBalance());
        
        Savingsaccount savingsAccount = bank.new Savingsaccount("smith", 2000);
        savingsAccount.withdraw(1500);
        System.out.println("Smith's balance in Savings Account after withdrawal: " + savingsAccount.getBalance());
        
        CurrentAccount currentAccount = bank.new CurrentAccount("kathy", 3000, 2000);
        currentAccount.withdraw(4000);
        System.out.println("Kathy's balance in Current Account after withdrawal: " + currentAccount.getBalance());
    }
}
