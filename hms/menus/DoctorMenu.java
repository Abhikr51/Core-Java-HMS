package hms.menus;

import java.util.Scanner;

import hms.db.LocalDB;
import hms.util.Line;

public class DoctorMenu {
    public void start() {
        if (LocalDB.setAuth("doctor")) {
            System.out.println(LocalDB.getDoctorData());
        } else {
            System.out.println("Invalid Email and Password !!");
        }
    }

}
