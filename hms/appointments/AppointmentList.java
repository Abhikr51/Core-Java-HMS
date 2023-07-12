package hms.appointments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import hms.db.LocalDB;
import hms.util.Label;

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

    public static Appointment get_AppointmentByPatient() {
        Iterator<Appointment> itr = list.iterator();
        while (itr.hasNext()) {
            Appointment a = itr.next();
            if(LocalDB.getPatientData().getPid() == a.getPid()){
                return a;
            }
        }
        return null;

    }
    public static boolean hasBookingByPatient() {
        Iterator<Appointment> itr = list.iterator();
        while (itr.hasNext()) {
            Appointment a = itr.next();
            if(LocalDB.getPatientData().getPid() == a.getPid()){
                return true;
            }
        }
        return false;

    }
    public static boolean cancel_appointmentByPatient(){
        for(int i = 0 ; i<list.size() ;i++ ){
            if(LocalDB.getPatientData().getPid() == list.get(i).getPid()){
                list.remove(i);
                return true;
            }
        }
        return false;
    }
    public static ArrayList<Appointment> getAppointment() {
        return list;
    }
}
