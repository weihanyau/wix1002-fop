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

        int totalScore = 0;
        int currentScore = 0;
        while (true) {
            System.out.print("Enter a number (-1 to quit) : ");
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            totalScore++;
            System.out.print("Enter a factor : ");
            int factor = sc.nextInt();

            System.out.printf("%d is a factor of %d? (true/false): ", factor, num);
            boolean answer = sc.nextBoolean();

            boolean isFactor = num % factor == 0;

            if (isFactor == answer) {
                System.out.println("Your answer is correct");
                currentScore++;
            } else {
                System.out.println("Your answer is incorrect");
            }
        }
        System.out.printf("The final score is %d/%d\n", currentScore, totalScore);
    }
}
