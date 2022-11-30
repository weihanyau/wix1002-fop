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
public class Q3 {

    public static void main(String[] args) {
        //Enter a score repeatedly until -1
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int minScore = Integer.MAX_VALUE;
        int maxScore = Integer.MIN_VALUE;
        int count = 0;
        int sum = 0;
        int sumOfSquare = 0;

        System.out.print("Enter a score [negative score to quit]: ");
        while ((num = sc.nextInt()) != -1) {
            //Keep track of the number of scoe entered
            count++;

            //Find minimum
            minScore = Math.min(minScore, num);

            //Find maximum
            maxScore = Math.max(maxScore, num);

            //Find the sum
            sum += num;

            //Find the sum of square
            sumOfSquare += num * num;

            System.out.print("Enter a score [negative score to quit]: ");
        }

        //Find average
        double average = (double) sum / count;

        //Find standard deviation
        double s = Math.sqrt((sumOfSquare - (double) sum * sum / count) / (count - 1));
        System.out.println("Minimum Score: " + minScore);
        System.out.println("Maximum Score: " + maxScore);
        System.out.println("Average Score: " + average);
        System.out.printf("Standard Deviation: %.2f", s);
    }
}
