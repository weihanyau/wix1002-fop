/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Wei Han
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Enter employee
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employee: ");
        int N = sc.nextInt();
        Random r = new Random();

        //Create array of employee with column representing days and work hours
        int[][] workHoursForEmployee = new int[N][7];

        //Generate random work hours for seven days of employee
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 7; j++) {
                workHoursForEmployee[i][j] = r.nextInt(8) + 1;
            }
        }

        //Label
        System.out.printf("%5s%5s%5s%5s%5s%5s%5s%7s\n", "Mon", "Tue", "Wed", "Thu",
                "Fri", "Sat", "Sun", "Total");

        //Go through each array to display work hours and calculate the total hours
        for (int i = 0; i < N; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                System.out.printf("%5s", workHoursForEmployee[i][j]);
                total += workHoursForEmployee[i][j];
            }
            System.out.printf("%7s\n", total);
        }
    }

}
