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
public class L2Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of seconds: ");
        int input = sc.nextInt();

        int hours = input / 60 / 60;
        int minutes = input / 60 % 60;
        int seconds = input % 60 % 60;

        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds\n", input, hours, minutes, seconds);
    }
}
