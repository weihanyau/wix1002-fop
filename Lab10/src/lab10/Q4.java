/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

import java.util.*;
import java.io.*;

/**
 *
 * @author Wei Han
 */
public class Q4 {

    public static void main(String[] args) {
        Appointment appointment = new Appointment(4, 8, 2022, 11, 15);
        appointment.saveAppointment();
    }
}

interface Searchable {

    boolean search(int dateStartTime, int dateEndTime);
}

class Appointment implements Searchable {

    private int day, month, year, startTime, endTime;

    public Appointment(int day, int month, int year, int startTime, int endTime) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public boolean search(int dateStartTime, int dateEndTime) {
        int appointmentStart = year * 365 * 24 + month * 30 * 24 + day * 24 + startTime;
        int appointmentEnd = year * 365 * 24 + month * 30 * 24 + day * 24 + endTime;
        return appointmentStart <= dateStartTime && appointmentEnd > dateStartTime || appointmentStart < dateEndTime && appointmentEnd > dateEndTime || appointmentStart < dateEndTime && appointmentEnd > dateEndTime || appointmentStart >= dateStartTime && appointmentEnd <= dateEndTime;
    }

    public void saveAppointment() {
        try {
            Scanner sc = new Scanner(new File("appointment.txt"));
            while (sc.hasNextLine()) {
                int inputDay = sc.nextInt();
                int inputMonth = sc.nextInt();
                int inputYear = sc.nextInt();
                int inputStartTime = sc.nextInt();
                int inputEndTime = sc.nextInt();
                sc.nextLine();
                int inputStart = inputYear * 365 * 24 + inputMonth * 30 * 24 + inputDay * 24 + inputStartTime;
                int inputEnd = inputYear * 365 * 24 + inputMonth * 30 * 24 + inputDay * 24 + inputEndTime;
                if (search(inputStart, inputEnd)) {
                    System.out.println("Appointment clash with another appointment time");
                    return;
                }
            }
            sc.close();
            PrintWriter writer = new PrintWriter(new FileOutputStream("appointment.txt", true));
            writer.println(day + " " + month + " " + year + " " + startTime + " " + endTime);
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
