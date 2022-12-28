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
        numArray[0] = 10400;
        // Array before reverse
        System.out.println(Arrays.toString(numArray));

        // Array after reversed with leading zero with char and modulus
        System.out.println(Arrays.toString(reverseKeepZeroWithChar(numArray)));
        System.out.println(Arrays.toString(reverseKeepZeroWithModulus(numArray)));

        //Reverse original Array
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
    
    public static String[] reverseKeepZeroWithModulus(int[] numArray) {
        String[] reversedArray = new String[numArray.length];
        for (int i = 0; i < numArray.length; i++) {
            //Declare a variable to store the reversed number
            int reverse = 0;

            //Keep track of leadingZero, will be true initially until it come across a number that is non-zero
            boolean hasLeadingZero = true;
            int leadingZero = 0;

            //When the number is > 0
            for (int num = numArray[i]; num > 0; num /= 10) {
                //We get the first digit value of the number
                int r = num % 10;

                if (hasLeadingZero && r != 0) {
                    hasLeadingZero = false;
                }

                //If has leading zero then we increment the number of leading Zero by 1
                if (hasLeadingZero) {
                    leadingZero++;
                }

                //Multiply the 'reverse' variable by 10 (increment the place value of the number)
                //Add r into it (r become the new ones place digit of the number)
                reverse = 10 * reverse + r;

                //Decrease the place value of the number by num /= 10
            }
            reversedArray[i] = "0".repeat(leadingZero) + reverse;
        }
        return reversedArray;
    }

    public static String[] reverseKeepZeroWithChar(int[] numArray) {
        String[] reversedArray = new String[numArray.length];

        for (int i = 0; i < numArray.length; i++) {
            char[] numChars = Integer.toString(numArray[i]).toCharArray();
            String reversedNumber = "";
            for (int j = numChars.length - 1; j >= 0; j--) {
                reversedNumber += numChars[j];
            }
            reversedArray[i] = reversedNumber;
        }

        return reversedArray;
    }
}
