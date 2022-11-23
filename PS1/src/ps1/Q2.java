/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ps1;

import java.util.Scanner;

/**
 *
 * @author Wei Han
 */
public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = "";
        double total = 0;

        System.out.print("Enter the type of durian [Quit] to terminate: ");
        while (!(input = sc.nextLine()).equals("Quit")) {
            System.out.print("Enter the sales in kg: ");
            double sales = sc.nextDouble();
            if (input.equals("MK")) {
                total += 25 * sales;
            } else if (input.equals("HL")) {
                total += 22 * sales;
            } else if (input.equals("D24")) {
                total += 20 * sales;
            } else if (input.equals("UM")) {
                total += 18 * sales;
            }

            sc.nextLine();
            System.out.print("Enter the type of durian [Quit] to terminate: ");
        }
        System.out.printf("Total Sales : %.2f\n", total);
    }
}
