/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author S2115567
 */
public class Q2 {

    public static void main(String[] args) {
        //Create an array of number;
        int[] num = new int[21];

        //We store 0-20 inside;
        for (int i = 0; i < num.length; i++) {
            num[i] = i;
        }
        Random r = new Random();
        int lastIndex = num.length - 1;

        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(num));
            int randomIndex = r.nextInt(lastIndex);
            System.out.println("Random index chosen: " + randomIndex);
            System.out.println(num[randomIndex]);
            num[randomIndex] = num[lastIndex];
            System.out.println(Arrays.toString(num));
            lastIndex--;
        }
    }
}
