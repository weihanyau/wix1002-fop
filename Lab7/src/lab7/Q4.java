/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Wei Han
 */
public class Q4 {

    public static void main(String[] args) {

        int chars = 0, words = 0, lines = 0;

        try {
            //Declare scanner to read from a Q3.txt
            Scanner sc = new Scanner(new FileInputStream("Q3.txt"));

            //When the scanner still has next line (before end of the file)
            while (sc.hasNextLine()) {
                //Read the nextLine
                String line = sc.nextLine();

                //Get the length of the line as chars
                chars += line.length();
                //Split the line into array based on space then get the length
                words += line.split(" ").length;
                //Increment lines by 1 for each line
                lines++;
            }

            //Close the scanner to flush out the memory
            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        //Print out the result
        System.out.println("Number of characters: " + chars);
        System.out.println("Number of words: " + words);
        System.out.println("Number of lines: " + lines);
    }
}
