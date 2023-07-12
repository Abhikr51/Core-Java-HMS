package hms.menus;

import java.util.Scanner;

import hms.db.LocalDB;
import hms.patient.PatientList;
import hms.util.Label;
import hms.util.Line;

public class PatientAuthMenu implements Menuable {
    public void show() {

        Scanner sc = new Scanner(System.in);
        final int endChoice = 0;
        int choice = endChoice;
        do {
            Line.horizontalLine("upper");
            System.out.println("1 -> Login");
            System.out.println("2 -> Registration");
            System.out.println("0 -> Return to main menu");
            Line.horizontalLine();
            System.out.print("Please enter any one :");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (LocalDB.setAuth("patient")) {
                        new PatientMenu().show();
                    } else {
                        Label.h_label("Invalid Email and Password !!");
                    }
                    break;

                case 2:PatientList.registerPatient(); break;

                case endChoice:
                    break;

                default:
                    System.out.println("Invalid choice try again");
            }
        } while (choice != endChoice);

    }
}
