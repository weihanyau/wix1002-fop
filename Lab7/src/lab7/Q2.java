/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 *
 * @author Wei Han
 */
public class Q2 {

    public static void main(String[] args) {
        try {
            //Declare a url
            URL u = new URL("https://fsktm.um.edu.my");

            //Connect to the specified url
            URLConnection cnn = u.openConnection();

            //Get input stream from the url connection
            InputStream stream = cnn.getInputStream();

            //Declare a scanner class to read through the input stream
            Scanner sc = new Scanner(stream);

            //Declare a print writer to write to file
            PrintWriter pw = new PrintWriter(new FileOutputStream("index.htm"));

            //When there are still lines left to print from the input stream, write it to the index.htm file
            while (sc.hasNextLine()) {
                pw.println(sc.nextLine());
            }

            //Close both the scanner and printwriter to flush out all the memory
            sc.close();
            pw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
