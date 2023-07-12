package hms.patient;

import java.util.ArrayList;
import java.util.Scanner;

import hms.doctor.Doctor;
import hms.util.Line;

public class PatientList {
    private static ArrayList<Patient> list = new ArrayList<>();

    public static boolean registerPatient() {
        try {
            Scanner sc = new Scanner(System.in);
            Line.horizontalLine("upper");
            System.out.println("Pateint Registration");
            Line.horizontalLine();
            System.out.print("Enter your Email : ");
            String email = sc.nextLine();
            System.out.print("Enter your password : ");
            String password = sc.nextLine();
            Patient p = new Patient();
            p.setEmail(email);
            p.setPassword(password);
            p.setPid(list.size() + 1);
            list.add(p);
            return true;
        } catch (Exception e) {
            System.err.println("Error in adding patient : " + e.getMessage());
            return false;
        }
    };

    public static void initialize() {
        Patient p1 = new Patient();
        p1.setEmail("pa1@gmail.com");
        p1.setPassword("pa1@123");
        p1.setPid(1);
        list.add(p1);
        Patient p2 = new Patient();
        p2.setEmail("pa2@gmail.com");
        p2.setPassword("pa2@123");
        p2.setPid(2);
        list.add(p2);

    }

    public static ArrayList<Patient> getPatientList() {
        return list;
    }
}
