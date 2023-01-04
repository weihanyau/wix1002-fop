/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

/**
 *
 * @author Wei Han
 */
public class Q4 {

    public static void main(String[] args) {
        Fraction f1 = new Fraction(300, 125);
        System.out.println(f1.getNumerator());
        System.out.println(f1.getDenominator());
        f1.displayLowestTerms();

        Fraction f2 = new Fraction();
        f2.setNumerator(60);
        f2.setDenominator(800);
        f2.displayLowestTerms();
    }
}

class Fraction {

    private int numerator;
    private int denominator;

    //Constructor to initialize numerator and denominator without parameter
    public Fraction() {
        numerator = 0;
        denominator = 0;
    }

    //Constructor to initialize numerator and denominator with numerator and denominator provided
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //Setters
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    //Getter
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    //Method to display lowest terms
    public void displayLowestTerms() {

        int r = gcd(numerator, denominator);

        System.out.println("Fraction reduced to lowest terms: "
                + (numerator / r) + "/" + (denominator / r));
    }

    //Method to find gcd
    private int gcd(int a, int b) {
        while (b > 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
