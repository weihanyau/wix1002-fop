package lab_4;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Wei Han
 */
public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = sc.nextInt();
        System.out.print("Enter First Day of Year: ");
        int firstDayofYear = sc.nextInt();

        int dayUntilMay = 31 + 28 + 31 + 30;
        int dayUntilAugust = dayUntilMay + 31 + 30 + 31;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            firstDayofYear = firstDayofYear + 1;
        }

        int firstDayofMay = (firstDayofYear + dayUntilMay) % 7;
        int firstDayofAugust = (firstDayofYear + dayUntilAugust) % 7;

        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
        for (int i = 0; i < firstDayofMay; i++) {
            System.out.printf("%4s", "");
        }
        for (int i = 1; i <= 31; i++) {
            System.out.printf("%4s", i);
            if ((i + firstDayofMay) % 7 == 0) {
                System.out.println("");
            }
        }

        System.out.println("\n");

        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
        for (int i = 0; i < firstDayofAugust; i++) {
            System.out.printf("%4s", "");
        }
        for (int i = 1; i <= 31; i++) {
            System.out.printf("%4s", i);
            if ((i + firstDayofAugust) % 7 == 0) {
                System.out.println("");
            }
        }
        System.out.println("");
    }
}
