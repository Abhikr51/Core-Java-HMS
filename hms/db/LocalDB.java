package hms.db;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import hms.doctor.Doctor;
import hms.doctor.DoctorList;
import hms.patient.Patient;
import hms.patient.PatientList;
import hms.util.Label;
import hms.util.Line;

public class LocalDB {
    private static Doctor doctorData;
    private static String auth = null;
    private static Patient patientData;

    public static String getAuth() {
        return auth;
    }

    public static boolean setAuth(String type) {

        switch (type) {
            case "doctor":  return doctorLogin();
            case "patient": return patientLogin();

            default:
                System.out.println("Invalid type passed");

        }

        return false;
    }

    public static Doctor getDoctorData() {
        return doctorData;
    }
    public static Patient getPatientData() {
        return patientData;
    }

    // public static void setDoctorData(Doctor doctorData) {
    //     LocalDB.doctorData = doctorData;
    // }

    public static boolean patientLogin() {
        Scanner sc = new Scanner(System.in);
        Label.h_label("Pateint Authentication");
        System.out.print("Enter your Email : ");
        String email = sc.nextLine();
        System.out.print("Enter your password : ");
        String password = sc.nextLine();
        ArrayList<Patient> list = PatientList.getPatientList();
        Iterator<Patient> itr = list.iterator();
        while (itr.hasNext()) {
            Patient patient = itr.next();
            if (patient.getEmail().equals(email) && patient.getPassword().equals(password)) {
                auth = "doctor";
                patientData = patient;
                return true;
            }

        }
        return false;
    }

    public static boolean doctorLogin() {
        Scanner sc = new Scanner(System.in);
        Label.h_label("Doctor Authentication");
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
    }
}