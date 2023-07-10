package hms.menus;

import java.util.Scanner;

import hms.db.LocalDB;
import hms.util.Line;

public class DoctorMenu implements Menuable {
    public void start() {
        if (LocalDB.setAuth(null, null)) {

            Scanner sc = new Scanner(System.in);
            final int endChoice = 0;
            int choice = endChoice;
            do {
                Line.horizontalLine();
                System.out.println("1 -> Show Appointment");
                System.out.println("2 -> Update Appointment");
                System.out.println("0 -> Logout");
                Line.horizontalLine();
                System.out.print("Please choose any one : ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        DoctorMenu dm = new DoctorMenu();
                        dm.start();
                        break;
                    case 2:
                        DoctorMenu pm = new DoctorMenu();
                        pm.start();
                        break;
                    case endChoice:
                        System.out.println("Thank you for using our System");
                        break;

                    default:
                        System.out.println("Invalid Choice Try again");
                }
            } while (choice != endChoice);
            sc.close();

        }else{
            System.out.println("Wrong Email and Password !!");
        }
    };
}
