package hms.patient;

import java.util.ArrayList;
import java.util.Scanner;

import hms.util.Line;

public class PatientList {
    private static ArrayList<Patient> list = new ArrayList<>();

    public static boolean registerPatient(){
        try {
            Scanner sc  = new Scanner(System.in);
            Line.horizontalLine("upper");
            System.out.println("Pateint Registration");
            Line.horizontalLine();
            System.out.print("Enter your Email : ");
            String email = sc.nextLine();
            System.out.print("Enter your password : ");
            String password = sc.nextLine();
            sc.close();
            Patient p = new Patient();
            p.setEmail(email);
            p.setPassword(password);
            list.add(p);
            return true;
        } catch (Exception e) {
            System.err.println("Error in adding patient : " + e.getMessage());
            return false;
        }
    };

    public static ArrayList<Patient> getPatientList() {
        return list;
    }
}
