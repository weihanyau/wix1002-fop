/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author S2115567
 */
public class Q4 {

    public static void main(String[] args) {
        //Enter the year and the first day of the year
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int firstDayOfYear = sc.nextInt();

        //Determine how many days until May and August
        int dayUntilMay = 31 + 28 + 31 + 30;
        int dayUntilAugust = dayUntilMay + 31 + 30 + 31;

        //Determine leap year
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            dayUntilMay++;
            dayUntilAugust++;
        }

        //Determine the first day of May and August
        int firstDayOfMay = (firstDayOfYear + dayUntilMay) % 7;
        int firstDayOfAugust = (firstDayOfYear + dayUntilAugust) % 7;

        //Print the Calendar
        //Print the Label
        System.out.printf("%5s%5s%5s%5s%5s%5s%5s\n", "Sun", "Mon", "Tue", "Wed",
                "Thu", "Fri", "Sat");
        //Determine how many days we need to skip based on the firstDayOfMonth
        for (int i = 0; i < firstDayOfMay; i++) {
            System.out.printf("%5s", "");
        }

        //Print the number of days in the month
        for (int i = 1; i <= 31; i++) {
            System.out.printf("%5s", i);
            //Check whether to break to a new line
            if ((i + firstDayOfMay) % 7 == 0) {
                System.out.println("");
            }
        }

        System.out.println("\n");

        //Print the Calendar
        //Print the Label
        System.out.printf("%5s%5s%5s%5s%5s%5s%5s\n", "Sun", "Mon", "Tue", "Wed",
                "Thu", "Fri", "Sat");
        //Determine many days we need to skip based on the firstDayOfMonth
        for (int i = 0; i < firstDayOfAugust; i++) {
            System.out.printf("%5s", "");
        }

        //Print the number of days in the month
        for (int i = 1; i <= 31; i++) {
            System.out.printf("%5s", i);
            //Check whether to break to a new line
            if ((i + firstDayOfAugust) % 7 == 0) {
                System.out.println("");
            }
        }
        System.out.println("");
    }
}
