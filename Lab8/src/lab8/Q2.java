/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

/**
 *
 * @author Wei Han
 */
public class Q2 {

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Wei Han", "020202020202", 5000);
        myAccount.displayBalance();
        myAccount.deposit(250);
        myAccount.displayBalance();
        myAccount.withdraw(1000);
        myAccount.displayBalance();
    }
}

class BankAccount {

    //Initialize variable for name, IC and balance
    private String name;
    private String IC;
    private double balance;

    //Constructor for name, IC and deposit
    public BankAccount(String name, String IC, double deposit) {
        this.name = name;
        this.IC = IC;
        balance = deposit;
    }

    //Method for depositing the entered amount into balance
    public void deposit(double amount) {
        balance += amount;
    }

    //Method for withdrawing specified amount from the account, if amount >= balance, then balance
    //will be set to 0
    public void withdraw(double amount) {
        if (amount >= balance) {
            balance = 0;
        } else {
            balance -= amount;
        }
    }

    //Method for printing out balance
    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}
