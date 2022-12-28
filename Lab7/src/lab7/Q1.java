
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
        //Declare list of course code
        String[][] course = {{"WXES1116", "Programming I"},
        {"WXES1115", "Data Structure"},
        {"WXES1110", "Operating System"},
        {"WXES1112", "Computing Mathematics I"}};

        //Write to binary file
        try {
            //Declare output stream
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("coursename.dat"));

            //Go through the course code array and write it to the binary file
            for (int i = 0; i < course.length; i++) {
                for (int j = 0; j < course[0].length; j++) {
                    outputStream.writeUTF(course[i][j]);
                }
            }

            //Close the output stream to make sure all of the output are flushed to the file
            outputStream.close();

            //Catch input output error when reading the file
        } catch (IOException e) {
            System.out.println(e);
        }

        //Accept user input for coursecode
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a course code: ");
        String input = sc.next();

        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("coursename.dat"));
            while (true) {
                //Read the course code and course name
                String code = inputStream.readUTF();
                String name = inputStream.readUTF();

                //If the course code is equal to the user input, print out the course name
                if (code.equals(input)) {
                    System.out.println("Course name: " + name);
                    break;
                }
            }

            //Catch end of file error when the input stream reaches end of the file
        } catch (EOFException e) {
            System.out.println("Course code was not found.");

            //Catch file not found error when the specified found are not found
        } catch (FileNotFoundException e) {
            System.out.println("File was not found.");
            //Catch input output error related to reading the file
        } catch (IOException e) {
            System.out.println("Error in reading file.");
        }
    }

}
