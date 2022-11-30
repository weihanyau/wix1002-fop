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
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Enter an Integer
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int num = sc.nextInt();

        //Find the factor and dispaly
        System.out.print("The factors are: ");
        for (int i = 1; i <= num; i++) {
            if (num % i != 0) {
                continue;
            }

            System.out.print(i);
            if (i != num) {
                System.out.print(", ");
            }
        }
    }

}
