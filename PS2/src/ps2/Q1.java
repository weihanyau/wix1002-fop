
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Wei Han
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Enter the number of staff [N] : ");
        //Get input for number of staff
        int n = sc.nextInt();

        //Variable for storing number of staffs work during weekend
        int weekendDuties = 0;

        //For the number of staff
        for (int i = 0; i < n; i++) {
            //Generate random Id from 10000 - 99999
            int staffId = r.nextInt(90000) + 10000;

            //Get the second digit from left
            int secondDigit = staffId / 1000 % 10;
            //Get the fourth digit from left
            int fourthDigit = staffId / 10 % 10;
            System.out.println("Staff ID : " + staffId);

            //If secondDigit is odd and fourthDigit is even
            if (secondDigit % 2 == 1 && fourthDigit % 2 == 0) {
                System.out.println("Weekend Duty");
                //Add 1 to weekendDuties if the staff work weekend
                weekendDuties++;
            } else {
                System.out.println("Weekend Off");
            }
        }
        System.out.println("The number of staffs work during weekend is " + weekendDuties);
    }

}
