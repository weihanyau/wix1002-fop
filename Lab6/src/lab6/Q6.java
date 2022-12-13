/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

/**
 *
 * @author Wei Han
 */
public class Q6 {

    public static void main(String[] args) {
        System.out.println("First 20 palindromic prime:");
        for (int i = 0, count = 0; count < 20; i++) {
            if (isPalindromicPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("");

        System.out.println("First 20 emirp:");
        for (int i = 0, count = 0; count < 20; i++) {
            if (isEmirp(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("");
    }

    //Prime number checker from L4Q8
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        boolean isPrime = true;
        for (int i = 3; i < num; i += 2) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    //Reverse method from L5Q3
    public static int reverse(int num) {
        int reverse = 0;
        while (num > 0) {
            int r = num % 10;
            reverse = 10 * reverse + r;
            num /= 10;
        }
        return reverse;
    }

    //Check for palindrome by comparing num with its reverse num
    public static boolean isPalindrome(int num) {
        return num == reverse(num);
    }

    //Check whether the number is prime and palindrome
    public static boolean isPalindromicPrime(int num) {
        return isPrime(num) && isPalindrome(num);
    }

    //Check whether the number is prime and it's reverse is prime but not a palindrome
    public static boolean isEmirp(int num) {
        return !isPalindrome(num) && isPrime(num) && isPrime(reverse(num));
    }
}
