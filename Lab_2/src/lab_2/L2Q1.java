/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_2;

import java.util.Scanner;

/**
 *
 * @author Wei Han
 */
public class L2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter temperature in Fahrenheit:");
        double input = sc.nextDouble();

        double celcius = (input - 32) / 1.8;

        System.out.printf("%.2f Celcius\n", celcius);
    }

}
