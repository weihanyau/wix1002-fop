/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author S2115567
 */
public class Q3 {

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int[][] newMatrix = new int[3][3];
        int count = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = count++;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }

        //Set first row as third column
        //Set second row as second column...
        for (int i = 0, x = matrix.length - 1; i < matrix.length; i++, x--) {
            for (int j = 0; j < matrix[0].length; j++) {
                newMatrix[j][x] = matrix[i][j];
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
