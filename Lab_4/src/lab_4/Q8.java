/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_4;

import java.util.Random;

/**
 *
 * @author Wei Han
 */
public class Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(101);
        System.out.println("n is " + n);

        for (int i = 2; i <= n; i++) {
            if (i == 2) {
                System.out.println(i);
            }
            if (i % 2 == 0) {
                continue;
            }
            boolean isPrime = true;
            for (int j = 3; j < i; j += 2) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }

}
