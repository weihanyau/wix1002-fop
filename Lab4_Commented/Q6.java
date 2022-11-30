/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Random;

/**
 *
 * @author S2115567
 */
public class Q6 {

    public static void main(String[] args) {
        Random r = new Random();

        int num = r.nextInt();
        System.out.println(num);

        String numString = Integer.toString(num);

        System.out.println(numString.length());
    }
}
