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
public class L2Q5 {

    public static void main(String[] args) {
        Random r = new Random();

        int num = r.nextInt(10001);
        System.out.println("Random Number is: " + num);

        int digitSum = 0;

        while (num > 0) {
            digitSum += num % 10;
            num /= 10;
        }

        System.out.println("Sum of all digits in the number: " + digitSum);
    }
}
