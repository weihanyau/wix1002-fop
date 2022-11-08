/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_2;

import java.util.Scanner;

/**
 *
 * @author Wei Han
 */
public class L2Q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount of water in gram: ");
        double weight = sc.nextDouble() / 1000;
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double initialTemp = (sc.nextDouble() - 32) / 1.8;
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double finalTemp = (sc.nextDouble() - 32) / 1.8;

        double energy = weight * (finalTemp - initialTemp) * 4184;

        System.out.printf("The energy needed is %e\n", energy);

    }
}
