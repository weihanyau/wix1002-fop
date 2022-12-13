/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Wei Han
 */
public class Q5 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        //Score variable for total score
        int score = 0;

        while (true) {
            System.out.println("Enter negative number to quit.");
            //Random number from 0-12
            int num1 = random.nextInt(13);
            int num2 = random.nextInt(13);

            //Print out the question
            System.out.printf("%d x %d = ", num1, num2);

            //Get input
            int input = scanner.nextInt();

            //Break out of while loop if input is negative
            if (input < 0) {
                break;
            }

            //if input is the product of num1 and num2
            if (isProductOf(num1, num2, input)) {
                score++;
            }
        }
        System.out.println("Your Score is " + score);
    }

    //Check if num3 is the product of num1 and num2
    public static boolean isProductOf(int num1, int num2, int num3) {
        return num1 * num2 == num3;
    }
}
