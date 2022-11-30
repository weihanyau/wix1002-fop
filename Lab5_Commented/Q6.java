/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Wei Han
 */
public class Q6 {

    public static void main(String[] args) {
        //Accept input to determine pascal triangle size
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        //Initialize a square matrix
        int[][] pascalTriangle = new int[N][N];

        //Set the first value as 1
        //This will act as the base case
        pascalTriangle[0][0] = 1;

        //Start from i = 1 (second row) since base case is already 1;
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < N; j++) {
                //Set every first J values as 1
                if (j == 0) {
                    pascalTriangle[i][j] = 1;
                } else {
                    //Else set it based on previos row's 'j-1' + 'j'
                    pascalTriangle[i][j] = pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j];
                }
            }
        }

        //Print out the triangle
        for (int i = 0; i < N; i++) {
            System.out.println(Arrays.toString(pascalTriangle[i]));
        }
    }
}
