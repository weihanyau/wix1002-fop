/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

import java.util.Random;

/**
 *
 * @author Wei Han
 */
public class Q7 {

    public static void main(String[] args) {

        Random random = new Random();
        double money1 = random.nextDouble() * 100;
        //Round off the money to two decimal place due to floating point precision
        money1 = Math.round(money1 * 100) / 100.0;
        System.out.println("Money 1: " + money1
        );

        Money first = new Money(money1);

        double money2 = random.nextDouble() * 100;
        money2 = Math.round(money2 * 100) / 100.0;
        System.out.println("Money 2: " + money2);
        System.out.println("");

        Money second = new Money(money2);

        System.out.println(first);
        System.out.println(second);
        second.subtract(first);
        System.out.println(second);
        //Add first money with second money
        first.add(second);
        System.out.println(first);
    }
}

class Money {

    //Declare variable for amount and the corresponding amount of note and cent
    private double amount;
    private int num100Note, num50Note, num10Note, num5Note, num1Note;
    private int num50Cent, num20Cent, num10Cent, num5Cent;

    //Constructor for initializing the amount of money
    public Money(double amount) {
        assignMoney(amount);
    }

    //Add money
    public void add(Money money) {
        assignMoney(this.amount + money.amount);
    }

    //Subtract money
    public void subtract(Money money) {
        if (this.amount - money.amount < 0) {
            return;
        }
        assignMoney(this.amount - money.amount);
    }

    //Round money and assign money to their respective notes and cents
    private void assignMoney(double amount) {
        this.amount = round(amount);
        int notes = (int) amount;
        int cents = (int) (amount * 100 % 100);

        num100Note = notes / 100;
        notes %= 100;
        num50Note = notes / 50;
        notes %= 50;
        num10Note = notes / 10;
        notes %= 10;
        num5Note = notes / 5;
        notes %= 5;
        num1Note = notes;

        num50Cent = cents / 50;
        cents %= 50;
        num20Cent = cents / 20;
        cents %= 20;
        num10Cent = cents / 10;
        cents %= 10;
        num5Cent = cents / 5;
    }

    private double round(double amount) {
        //Convert double to 2 decimal places for easier rounding
        //Example: 1021
        // 10 will represent the integer value, 21 will represent the decimal value
        int total = (int) (amount * 100);

        //Get second decimal value
        int secondDecimal = total % 10;

        //Condition of the rounding
        switch (secondDecimal) {
            case 0:
            case 1:
            case 2:
                //If the second decimal value is 0,1,2
                //Round down the first place values to 0 by deducting the secondDecimal from total
                return (total - secondDecimal) / 100.0;
            case 8:
            case 9:
                //If the second decimal value is 8,9
                //Add 1 to the first decimal value by adding 10 to total and subtracting second decimal
                //from total
                return (total + 10 - secondDecimal) / 100.0;
            default:
                //If the second decimal value is 3,4,5,6,7
                //Subtract secondDecimal value from the total and add 5 to the total
                //to round it up to 5
                return (total - secondDecimal + 5) / 100.0;
        }
    }

    //Override the toString method for printing out the class variables
    @Override
    public String toString() {
        return "Amount = " + amount + "\n"
                + "100 Note = " + num100Note + "\n"
                + "50 Note = " + num50Note + "\n"
                + "10 Note = " + num10Note + "\n"
                + "5 Note = " + num5Note + "\n"
                + "1 Note = " + num1Note + "\n"
                + "50 Cent = " + num50Cent + "\n"
                + "20 Cent = " + num20Cent + "\n"
                + "10 Cent = " + num10Cent + "\n"
                + "5 Cent = " + num5Cent + "\n";
    }
}
