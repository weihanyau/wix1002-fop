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
public class Q8 {

    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(101);
        System.out.println("Generated Number: " + num);

        //Checking every number whether it's prime from 1 to the number
        int count = 0;
        for (int i = 2; count < num; i++) {
            //Check whether it '2' (exception)
            if (i == 2) {
                System.out.println(i);
                count++;
                continue;
            }

            //Check even first
            if (i % 2 == 0) {
                continue;
            }
            //Check whether its divisible by all odd number upto the
            //number 'i'

            boolean isPrime = true;

            for (int j = 3; j < i; j += 2) {
                //If its not, set isPrime to false;
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
                System.out.println(i);
            }
        }

        //Sieve of Eratosthenes
    }
}
