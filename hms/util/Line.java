package hms.util;

public class Line {
    public static void horizontalLine() {
        System.out.println("**********************************");
    }
    public static void horizontalLine(String type) {
        if(type.equals("upper")) System.out.println("\n\n");
        System.out.println("**********************************");
        if(type.equals("lower")) System.out.println("\n\n");
    }

}
