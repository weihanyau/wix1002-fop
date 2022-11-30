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
public class Q5 {

    public static void main(String[] args) {
        //Store total points of p1 and p2
        int p1 = 0;
        int p2 = 0;
        Random r = new Random();

        boolean won = false;
        //While loop, keep going until one player reach 100
        while (!won) {
            System.out.println("Player 1 Points: " + p1);
            System.out.println("Player 2 Points: " + p2);

            System.out.println("");

            int p1Rolls = 0;
            do {
                //Roll a dice
                p1Rolls = r.nextInt(6) + 1;
                System.out.println("Player 1 rolls " + p1Rolls);
                //Add it to total points
                p1 += p1Rolls;
                System.out.println("Player 1 Points: " + p1);
                //Winner check when reach 100 points
                if (p1 >= 100) {
                    System.out.println("Player 1 is the winner");
                    won = true;
                }
                //If 6 then roll again
            } while (p1Rolls == 6 && !won);

            if (won) {
                break;
            }
            System.out.println("");

            int p2Rolls = 0;
            do {
                p2Rolls = r.nextInt(6) + 1;
                System.out.println("Player 2 rolls " + p2Rolls);
                p2 += p2Rolls;
                System.out.println("Player 2 Points: " + p2);
                if (p2 >= 100) {
                    System.out.println("Player 2 is the winner");
                    won = true;
                }
            } while (p2Rolls == 6 && !won);
            System.out.println("");
        }
    }
}
