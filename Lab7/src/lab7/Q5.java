/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

import java.io.*;

/**
 *
 * @author Wei Han
 */
public class Q5 {

    public static void main(String[] args) {
        try {
            //Declare input stream to read from person.dat
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("person.dat"));
            //Read the total number of record and saves it into variable
            int N = inputStream.readInt();

            //Declare arrays for storing the information
            String[] name = new String[N];
            int[] age = new int[N];
            char[] gender = new char[N];

            //Read all the info from the person.dat
            for (int i = 0; i < N; i++) {
                name[i] = inputStream.readUTF();
                age[i] = inputStream.readInt();
                gender[i] = inputStream.readChar();
            }

            //Use bubble sort to sort the name in ascending order
            for (int pass = 1; pass < N; pass++) {
                for (int i = 0; i < N - 1; i++) {
                    if (name[i].compareTo(name[i + 1]) > 0) {
                        String nameTemp = name[i];
                        name[i] = name[i + 1];
                        name[i + 1] = nameTemp;

                        int ageTemp = age[i];
                        age[i] = age[i + 1];
                        age[i + 1] = ageTemp;

                        char charTemp = gender[i];
                        gender[i] = gender[i + 1];
                        gender[i + 1] = charTemp;
                    }
                }
            }

            //Print out all the information
            for (int i = 0; i < N; i++) {
                System.out.printf("%s %d %c\n", name[i], age[i], gender[i]);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
