package hms.db;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import hms.doctor.Doctor;
import hms.doctor.DoctorList;
import hms.util.Line;

public class LocalDB {
    private static Doctor doctorData;
    private static String auth = null;

    public static String getAuth() {
        return auth;
    }

    public static boolean setAuth(String type) {
        Scanner sc = new Scanner(System.in);
        switch (type) {
            case "doctor":
                Line.horizontalLine();
                System.out.println("Doctor Authentication");
                Line.horizontalLine();
                System.out.print("Enter your Email : ");
                String email = sc.nextLine();
                System.out.print("Enter your password : ");
                String password = sc.nextLine();
                ArrayList<Doctor> d_list = DoctorList.getDoctorList();
                Iterator<Doctor> itr = d_list.iterator();
                while (itr.hasNext()) {
                    Doctor doc = itr.next();
                    if (doc.getEmail().equals(email) && doc.getPassword().equals(password)) {
                        auth = "doctor";
                        doctorData = doc;
                        return true;
                    }

                }
                return false;

            case "patient":

                break;

            default:
                System.out.println("Invalid");

        }
        return false;
    }

    public static Doctor getDoctorData() {
        return doctorData;
    }

    public static void setDoctorData(Doctor doctorData) {
        LocalDB.doctorData = doctorData;
    }

}