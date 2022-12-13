/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

/**
 *
 * @author Wei Han
 */
public class Q2 {

    public static void main(String[] args) {
        //Declare number of row (size of triangle and diamond)
        int row = 6;

        //Triangle
        //Create a loop based on the row
        for (int i = 0; i <= row; i++) {
            //Print out whitespace for the row based on row - i
            multiPrint(row - i, ' ');
            multiPrint(i * 2 + 1, '*');
            System.out.println("");
        }

        System.out.println("");

        //Diamond
        //Print out triangle first
        for (int i = 0; i <= row; i++) {
            multiPrint(row - i, ' ');
            multiPrint(i * 2 + 1, '*');
            System.out.println("");
        }

        //Print a reversed triangle but row - 1 (so only 1 row is longest)
        for (int i = row - 1; i >= 0; i--) {
            multiPrint(row - i, ' ');
            multiPrint(i * 2 + 1, '*');
            System.out.println("");
        }
    }

    //Multi Print
    public static void multiPrint(int n, char c) {
        //Basic loops for print the number of char
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }
}
