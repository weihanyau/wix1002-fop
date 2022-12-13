/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6;

/**
 *
 * @author Wei Han
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Method 1
        for (int i = 1; i <= 20; i++) {
            System.out.print(triangularNumberArithemtic(i) + " ");
        }
        System.out.println("");

        //Method 2
        for (int i = 1; i <= 20; i++) {
            System.out.print(triangularNumberBruteForce(i) + " ");
        }
    }

    // Method for triangular number.
    //Method 1: Sum of Arithmetic Progression Formula (faster)
    public static int triangularNumberArithemtic(int n) {
        return n * (1 + n) / 2;

        //Note: Beware when int divide by int
        //Example:
        //return n / 2 * (1 + n);
        // Since n /2
        // if 1 / 2, it might become 0
    }

    //Method 2: Brute Force (slower)
    //Description: Sum from 1 to n manually using for loop;
    public static int triangularNumberBruteForce(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
