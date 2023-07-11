package hms.menus;

import java.util.Scanner;

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
                System.out.println("4 -> Logout");
                System.out.println("0 -> Exit");
                Line.horizontalLine();
                System.out.print("Please enter any one :");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:

                        break;

                    case 2:

                        break;

                    case endChoice:
                        break;

                    default:
                        System.out.println("Invalid choice try again");
                }
            } while (choice != endChoice);
        } else {
            Label.h_label("Invalid Email and Password !!");
        }
    }

}
