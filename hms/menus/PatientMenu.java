package hms.menus;

import java.util.Scanner;

import hms.appointments.Appointment;
import hms.appointments.AppointmentList;
import hms.db.LocalDB;
import hms.util.Label;
import hms.util.Line;

public class PatientMenu implements Menuable {
    public void show() {
        Scanner sc = new Scanner(System.in);
        final int endChoice = 0;
        int choice = endChoice;
        do {
            Line.horizontalLine("upper");
            System.out.println("1 -> Book Appointment");
            System.out.println("2 -> View Appointment");
            System.out.println("3 -> Cancel Appointment");
            // System.out.println("4 -> View Medicines");
            System.out.println("0 -> Logout");
            Line.horizontalLine();
            System.out.print("Please enter any one :");
            choice = sc.nextInt();
            switch (choice) {
                case 1:

                    if (!AppointmentList.hasBookingByPatient()) {
                        if (AppointmentList.book_appointment()) {
                            Label.h_label("Appointment booked Successfully");
                        } else {
                            Label.h_label("failed to book an appointment");
                        }
                    } else {
                        Label.h_label("Sorry you already booked an appointment");
                    }

                    break;

                case 2:
                    Appointment ap = AppointmentList.get_AppointmentByPatient();
                    if (ap != null) {
                        Label.h_label("Appointment Details");
                        System.out.println("Patient Id : " + ap.getPid());
                        System.out.println("Appointment Id : " + ap.getAid());
                        System.out.println("Patient Name : " + ap.getName());
                        System.out.println("Patient Gender : " + ap.getGender());
                        System.out.println("Patient Age: " + ap.getAge());
                        System.out.println("Appointment Date : " + ap.getA_date());
                        System.out.println("Patient Issue : " + ap.getIssue());
                        System.out.println("Comment: " + ap.getComment());
                    } else {
                        Label.h_label("Sorry No appointmemnts booked.");
                    }

                    break;
                case 3:
                    if (AppointmentList.cancel_appointmentByPatient()) {
                        Label.h_label("Appointment cancelled Successfully");
                    } else {
                        Label.h_label("No Appointmenrts to cancel");
                    }
                    break;
                case endChoice:
                    LocalDB.logoutPatient(); 
                    System.out.println("Logout Successfully");
                    break;

                default:
                    Line.horizontalLine("upper");
                    System.out.println("Invalid choice try again");
            }
        } while (choice != endChoice);
    }

}
