package hms.menus;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import hms.appointments.Appointment;
import hms.appointments.AppointmentList;
import hms.db.LocalDB;
import hms.util.Label;
import hms.util.Line;

public class DoctorMenu implements Menuable {
    public void show() {
        if (LocalDB.setAuth("doctor")) {
            Scanner sc = new Scanner(System.in);
            final int endChoice = 0;
            int choice = endChoice;
            do {
                Line.horizontalLine("upper");
                System.out.println("1 -> Show Appointments");
                System.out.println("2 -> Update Appointment");
                System.out.println("3 -> Put Mediceines");
                System.out.println("0 -> Logout");
                Line.horizontalLine();
                System.out.print("Please enter any one :");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        ArrayList<Appointment> ap = AppointmentList.getAppointments();
                        Label.h_label("All Booked Appointments are : ");
                        Iterator<Appointment> itr = ap.iterator();
                        while (itr.hasNext()) {
                            Appointment a = itr.next();
                            Line.horizontalLine();
                            System.out.println("Appointment ID: " + a.getAid());
                            System.out.print("Name : " + a.getName());
                            System.out.print(" Age : " + a.getAge());
                            System.out.print(" Gender : " + a.getGender());
                            System.out.println(" Appointment Date : " + a.getA_date());
                            System.out.println("Issue: " + a.getIssue());
                            System.out.println("Comment : " + a.getComment());
                            System.out.println("Status: " + a.getStatus());
                        }

                        break;

                    case 2:
                        AppointmentList.updateStatus();
                        break;

                    case 3:
                        if (!AppointmentList.putMedicine()) {
                            Label.h_label("No Appointment Found");
                        }

                        break;

                    case endChoice:LocalDB.logoutDoctor(); break;

                    default:
                        System.out.println("Invalid choice try again");
                }
            } while (choice != endChoice);
        } else {
            Label.h_label("Invalid Email and Password !!");
        }
    }

}
