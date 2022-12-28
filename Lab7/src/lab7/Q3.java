/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Wei Han
 */
public class Q3 {

    public static void main(String[] args) {
        try {
            //Declare Scanner to read from Q3.txt
            Scanner sc = new Scanner(new FileInputStream("Q3.txt"));
            //Declare print writer to write to reverse.txt
            PrintWriter pw = new PrintWriter(new FileOutputStream("reverse.txt"));

            //While there is still some lines to print (not yet reach the end of file)
            while (sc.hasNextLine()) {
                //Get the next line
                String line = sc.nextLine();

                //Declare a variable for storing the reversed line
                String reverse = "";

                // Go through each character in line and insert it at the start of the reverse variable
                for (int i = 0; i < line.length(); i++) {
                    reverse = line.charAt(i) + reverse;
                }

                //Write the reveresed line into reverse.txt
                pw.println(reverse);
            }

            //Close scanner and print writer to flush out the memory
            sc.close();
            pw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
