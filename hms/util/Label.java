package hms.util;

public class Label {
    public static void h_label(String x) {
        Line.horizontalLine("upper");
        System.out.println(x);
        Line.horizontalLine("lower");
    }
}
