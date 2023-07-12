package hms.appointments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import hms.db.LocalDB;
import hms.util.Label;
import hms.util.Line;
import hms.util.State;

public class AppointmentList {
    private static ArrayList<Appointment> list = new ArrayList<>();

    public static boolean book_appointment() {
        try {

            Scanner sc = new Scanner(System.in);
            Label.h_label("Fill details to book an appointment");
            int aid = list.size() + 101;
            System.out.print("Enter name : ");
            String name = sc.nextLine();
            System.out.print("Enter your age : ");
            int age = sc.nextInt();
            System.out.print("Enter your gender (Male / Female) : ");
            sc.nextLine();
            String gender = sc.nextLine();
            System.out.print("Type your Isuue : ");
            String issue = sc.nextLine();
            String comment = "No comment";
            System.out.print("Any Comment for doctor ? (optional) : ");
            comment = sc.nextLine();
            System.out.print("Enter appointment date (DD/MM/YYYY) : ");
            String a_date = sc.nextLine();
            int pid = LocalDB.getPatientData().getPid();
            Appointment a = new Appointment(pid, aid, name, issue, gender, age, comment, a_date);
            list.add(a);

            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }

    }

    public static void initialize() {

        Appointment a1 = new Appointment(1, 101, "Kuku", "Loose motion", "Male", 18,
                "Book my appointment as soon as possible", "01/08/2023");

        Appointment a2 = new Appointment(2, 102, "muku", "Food Poisoning", "Female", 21,
                "Thanku For your time!", "09/07/2023");
        list.add(a1);
        list.add(a2);
    }

    public static Appointment get_AppointmentByPatient() {
        Iterator<Appointment> itr = list.iterator();
        while (itr.hasNext()) {
            Appointment a = itr.next();
            if (LocalDB.getPatientData().getPid() == a.getPid()) {
                return a;
            }
        }
        return null;

    }

    public static boolean hasBookingByPatient() {
        Iterator<Appointment> itr = list.iterator();
        while (itr.hasNext()) {
            Appointment a = itr.next();
            if (LocalDB.getPatientData().getPid() == a.getPid()) {
                return true;
            }
        }
        return false;

    }

    public static boolean cancel_appointmentByPatient() {
        for (int i = 0; i < list.size(); i++) {
            if (LocalDB.getPatientData().getPid() == list.get(i).getPid()) {
                list.remove(i);
                return true;
            }
        }
        return false;
    }

    public static void updateStatus() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Appointment ID : ");
        int aid = sc.nextInt();
        System.out.println("1 ->Accepted");
        System.out.println("2 ->Rejected");
        System.out.println("3 ->Completed");
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();
        Iterator<Appointment> itr = list.iterator();
        while (itr.hasNext()) {
            Appointment ap = itr.next();
            if (ap.getAid() == aid) {
                switch (choice) {
                    case 1:
                        ap.setStatus(State.ACCEPTED);
                        break;
                    case 2:
                        ap.setStatus(State.REJECTED);
                        break;
                    case 3:
                        ap.setStatus(State.COMPLETED);
                        break;
                }
            }
        }

    }

    public static boolean putMedicine() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Appointment ID : ");
        int aid = sc.nextInt();

        Iterator<Appointment> itr = list.iterator();
        while (itr.hasNext()) {
            Appointment ap = itr.next();
            if (ap.getAid() == aid) {
                if (ap.getStatus() == State.COMPLETED) {
                    for (int i = 1; true; i++) {
                        System.out.println("Medicine no." + i);
                        System.out.print("Medicine Name : ");
                        sc.nextLine();
                        String mdcnName = sc.nextLine();
                        System.out.print("Medicine Timetable : ");
                        String mdcnTime = sc.nextLine();
                        ap.setMedicine(mdcnName, mdcnTime);
                        System.out.print("Add More Medicines ?(0-> YES | 1->No): ");
                        int choice = sc.nextInt();
                        if (choice == 1) {
                            return true;
                        }
                    }
                } else {
                    System.out.println("Status has not completed");
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean getMedicinesForPatient() {

        Appointment ap = get_AppointmentByPatient();
        if (ap != null) {
            if (ap.getMedicine().size() != 0) {
                Label.h_label("Medicines : ");
                Iterator<Map.Entry<String, String>> itr = ap.getMedicine().entrySet().iterator();
                int i = 1;
                while (itr.hasNext()) {
                    Map.Entry<String, String> temp = itr.next();
                    Line.horizontalLine();
                    System.out.println("Medicine No : " + i);
                    System.out.println("Medicine Name=" + temp.getKey() + "\nMedicine taking Time =" + temp.getValue());
                    Line.horizontalLine();
                    i++;
                }
                return true;
            } else {
                return false;
            }
        }
        return false;

    }

    public static ArrayList<Appointment> getAppointments() {
        return list;
    }
}
