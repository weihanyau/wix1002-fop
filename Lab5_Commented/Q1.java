/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author S2115567
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Randomly generate N student scores
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        //Prompt the user to enter N students and store in the array
        int N = sc.nextInt();
        int[] studentScores = new int[N];
        for (int i = 0; i < studentScores.length; i++) {
            studentScores[i] = r.nextInt(101);
        }

        //Display list of score
        System.out.println(Arrays.toString(studentScores));
        //Highet score
        int maxScores = Integer.MIN_VALUE;
        //Lowest score
        int minScores = Integer.MAX_VALUE;
        //Average score
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += studentScores[i];
            minScores = Math.min(minScores, studentScores[i]);
            maxScores = Math.max(maxScores, studentScores[i]);
        }
        double average = (double) sum / N;

        System.out.println("Min Scores: " + minScores);
        System.out.println("Max Scores: " + maxScores);
        System.out.println("Average: " + average);
    }

}
