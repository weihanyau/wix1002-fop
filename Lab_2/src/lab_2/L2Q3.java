/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_2;

import java.util.Random;

/**
 *
 * @author Wei Han
 */
public class L2Q3 {

    public static void main(String[] args) {
        Random r = new Random();

        int number1 = r.nextInt(41) + 10;
        int number2 = r.nextInt(41) + 10;
        int number3 = r.nextInt(41) + 10;
        System.out.println("Num 1: " + number1);
        System.out.println("Num 2: " + number2);
        System.out.println("Num 3: " + number3);

        System.out.println("Sum: " + (number1 + number2 + number3));
        System.out.printf("Average %.2f\n", (number1 + number2 + number3) / 3.0);
    }

}
