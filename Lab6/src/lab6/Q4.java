/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

/**
 *
 * @author Wei Han
 */
public class Q4 {

    public static void main(String[] args) {
        System.out.println("GCD Iteratively");
        System.out.println(gcd(24, 8));
        System.out.println(gcd(200, 625));

        System.out.println("");

        System.out.println("GCD Recursively");
        System.out.println(gcdWithRecursion(24, 8));
        System.out.println(gcdWithRecursion(200, 625));
    }

    public static int gcd(int i, int j) {
        //While j > 0
        while (j > 0) {
            //Find the remainder of i / j
            // If i < j, i and j will swaps automatically

            // Example:
            // i = 200, j = 625
            // r = i % j = 200
            // i = j = 625
            // j = r = 200
            // New i,j:
            // i = 625, j = 200
            int r = i % j;

            //Saves the dividend, j as the new i
            i = j;
            //Saves the remainder as the new j
            j = r;

            //Repeat while j > 0
        }
        //Finally, return i
        return i;
    }

    public static int gcdWithRecursion(int i, int j) {
        // To find the gcd of i and j, gcd(i,j)
        // We first find i = j*q + r
        // Then we find gcd of j and r, gcd(j,r)
        // So we can reuse the same function with recursion

        // Check when j == 0, we stop and return
        if (j == 0) {
            return i;
        }

        // Find the remainder
        int r = i % j;

        // Do gcd again using the same function
        return gcdWithRecursion(j, r);
    }
}
