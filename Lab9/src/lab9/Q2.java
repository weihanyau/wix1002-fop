/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9;

import java.io.*;
import java.util.*;

/**
 *
 * @author Wei Han
 */
public class Q2 {

    public static void main(String[] args) {
        StudentProfile student = new StudentProfile("Alvin", "Male", "21/10/2002", "course");
        student.display();
    }
}

class StudentProfile extends PersonProfile {

    private String[] courseName;
    private String[] courseCode;
    private int[] semester;
    private int[] session;
    private int[] mark;

    public StudentProfile(String name, String gender, String dateOfBirth, String fileName) {
        super(name, gender, dateOfBirth);

        try {
            Scanner sc = new Scanner(new File(fileName + ".txt"));
            int lines = 0;

            while (sc.hasNextLine()) {
                sc.nextLine();
                lines++;
            }

            sc.close();

            int entries = lines / 5;
            courseName = new String[entries];
            courseCode = new String[entries];
            semester = new int[entries];
            session = new int[entries];
            mark = new int[entries];

            sc = new Scanner(new File(fileName + ".txt"));

            for (int i = 0; i < entries; i++) {
                courseCode[i] = sc.nextLine();
                courseName[i] = sc.nextLine();
                semester[i] = sc.nextInt();
                session[i] = sc.nextInt();
                mark[i] = sc.nextInt();
                if (sc.hasNextLine()) {
                    sc.nextLine();
                }
            }

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }

    public String getGrade(int mark) {
        if (mark >= 85) {
            return "A";
        }
        if (mark >= 75) {
            return "A-";
        }
        if (mark >= 70) {
            return "B+";
        }
        if (mark >= 65) {
            return "B";
        }
        if (mark >= 60) {
            return "B-";
        }
        if (mark >= 55) {
            return "C+";
        }
        if (mark >= 50) {
            return "C";
        }
        if (mark >= 45) {
            return "D";
        }
        if (mark >= 35) {
            return "E";
        }
        return "F";
    }

    @Override
    public void display() {
        super.display();
        System.out.println("");
        System.out.println("Course Details");
        for (int i = 0; i < courseName.length; i++) {
            System.out.printf("Course Name: %s\n"
                    + "Course Code: %s\n"
                    + "Semester: %d\n"
                    + "Session: %d\n"
                    + "Mark: %d\n"
                    + "Grade %s\n", courseName[i], courseCode[i], semester[i], session[i], mark[i], getGrade(mark[i]));
            System.out.println("");
        }
    }
}
