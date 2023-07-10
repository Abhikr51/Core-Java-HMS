import java.util.Scanner;

import hms.menus.DoctorMenu;
import hms.util.Line;


public class Main{
    public static void main(String[] args) {
        //starting point
        Scanner sc = new Scanner(System.in); 
        try {
            final int endChoice = 0;
            int choice = endChoice;
            do{
    
                Line.horizontalLine();
                System.out.println("1 -> Doctor Panel");
                System.out.println("2 -> Patient Panel");
                System.out.println("0 -> Exit");
                Line.horizontalLine();
                System.out.print("Please choose any one : ");
                choice = sc.nextInt();
                switch(choice){
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
                       
                    default :
                        System.out.println("Invalid Choice Try again");
                }
            }while(choice != endChoice);
    
        } catch (Exception e) {
            System.err.println("Somthing went wrong : " + e.getMessage());
        }finally{
            sc.close();
        }
    }
}