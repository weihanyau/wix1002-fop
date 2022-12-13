/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Wei Han
 */
public class Q3 {

    public static void main(String[] args) {
        int[] numArray = new int[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            //Generate 10 random number from 100-999 and saves them into array
            numArray[i] = random.nextInt(900) + 100;
        }

        // Array before reverse
        System.out.println(Arrays.toString(numArray));

        //Reverse Array
        reverse(numArray);

        // Array after reverse
        System.out.println(Arrays.toString(numArray));
    }

    public static void reverse(int[] numArray) {
        //Go through each number in the array
        for (int i = 0; i < numArray.length; i++) {
            //Declare a variable to store the reversed number
            int reverse = 0;

            //When the number is > 0
            for (int num = numArray[i]; num > 0; num /= 10) {
                //We get the first digit value of the number
                int r = num % 10;

                //Multiply the 'reverse' variable by 10 (increment the place value of the number)
                //Add r into it (r become the new ones place digit of the number)
                reverse = 10 * reverse + r;

                //Decrease the place value of the number by num /= 10
            }
            //Saves it back into the array
            numArray[i] = reverse;
        }
    }
}
