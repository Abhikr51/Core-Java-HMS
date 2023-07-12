package hms.doctor;

import java.util.ArrayList;

public class DoctorList {
    static ArrayList<Doctor> list = new ArrayList<>();

    public static void initialize() {
        Doctor d1 = new Doctor();

        d1.setName("Sneha Agarwal");
        d1.setAge(23);
        d1.setGender("Female");
        d1.setEmail("sneha@gmail.com");
        d1.setPassword("Sneha@123");
        d1.setQualification("MCA");
        d1.setSpecialization("cardiothoracic surgeon ");
        d1.setTreatment("heart surgeory", "lungs surgeory", "esophagus surgeory");
        list.add(d1);

        Doctor d2 = new Doctor();
        d2.setName("Abhijit Kumar");
        d2.setAge(30);
        d2.setGender("Male");
        d2.setEmail("abhi@gmail.com");
        d2.setPassword("Abhi@123");
        d2.setQualification("Mtech");
        d2.setSpecialization("Neurologist");
        d2.setTreatment("coordination problems", "muscle weakness", "a change in sensation", "confusion", "dizziness");
        list.add(d2);

        Doctor d3 = new Doctor();
        d3.setName("Isha Agarwal");
        d3.setAge(24);
        d3.setGender("Female");
        d3.setEmail("isha@gmail.com");
        d3.setPassword("Isha@123");
        d3.setQualification("BCA");
        d3.setSpecialization("General");
        d3.setTreatment("Caugh", "fever", "Cold", "viral", "Dization Problem", "Food Poisoning");
        list.add(d3);
    }

    public static ArrayList<Doctor> getDoctorList() {
        return list;
    }
}
