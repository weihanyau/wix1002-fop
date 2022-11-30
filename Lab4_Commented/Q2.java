/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author S2115567
 */
public class Q2 {

    public static void main(String[] args) {
        //Enter a number
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //Prev Sum
        int prevSum = 0;
        //Total Sum
        int totalSum = 0;

        for (int i = 1; i <= num; i++) {
            prevSum += i;
            totalSum += prevSum;
        }

        System.out.println(totalSum);
    }
}
