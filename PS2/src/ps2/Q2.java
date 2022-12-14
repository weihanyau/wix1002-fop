/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ps2;

import java.util.Scanner;

/**
 *
 * @author Wei Han
 */
public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Keep track of total score and current score
        int totalScore = 0;
        int currentScore = 0;
        while (true) {
            System.out.print("Enter a number (-1 to quit) : ");
            int num = sc.nextInt();
            //If the entered number is -1, break out of the loop
            if (num == -1) {
                break;
            }

            //Increment the total score by 1 since num is not -1
            totalScore++;
            System.out.print("Enter a factor : ");
            int factor = sc.nextInt();

            System.out.printf("%d is a factor of %d? (true/false): ", factor, num);
            boolean answer = sc.nextBoolean();

            //Check whether the input factor is a factor of the number
            //Store it into variable
            boolean isFactor = num % factor == 0;

            //Check whether the factor is equal to the answer
            if (isFactor == answer) {
                System.out.println("Your answer is correct");
                //If correct, increment score by 1
                currentScore++;
            } else {
                System.out.println("Your answer is incorrect");
            }
        }
        System.out.printf("The final score is %d/%d\n", currentScore, totalScore);
    }
}
