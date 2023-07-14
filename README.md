# Hospital Management System

## Features
- Doctor
    - Login
    - Can view appointments.
    - Can approve or reject appointments.
    - Put Medicines for patient.
- Patient
    - Login & Register.
    - Can book appointments.
    - Can view booked appointments.
    - Can Medicines given by Doctor.

## Design 
    |── Doctor
        |── Show appointments :
            ─ AID
            ─ name
            ─ Issue
            ─ gender (Male / Female / Prefer not to say)
            ─ Age
            ─ Comment
            ─ Appointment Date (DD/MM/YYYY)
        |── Update Appointments :[ get appointment id and chanege status -> status can be (completed/rejected / accepted) ]
        |── Put medicines  : (AID -> if status == completed) 
    |── Patient
        |── Login
        |── Registration: [Get registration details]
            ─ password
            ─ email
        |── Book Appointment: [Get Booking Details and send a status]
            ─ name
            ─ Describe Issue
            ─ gender (Male / Female / Prefer not to say)
            ─ Age
            ─ Comment for Dr.
            ─ Appointment Date (DD/MM/YYYY)
        |── View Appointment : [ show Booking Details ]
            ─ AID
            ─ name
            ─ Describe Issue
            ─ gender (Male / Female / Prefer not to say)
            ─ Age
            ─ Comment for Dr.
            ─ Appointment Date (DD/MM/YYYY)
        |── View medicines : [Shows this options if status == completed]
        |── Logout
## Folder Structure



    ├── hms
    │   ├── appointments
    │   │   ├── Appointment.java
    │   │   ├── AppointmentList.java
    │   ├── db
    │   │   ├── LocalDB.java
    │   ├── doctor
    │   │   ├── Doctor.java
    │   │   ├── DoctorList.java
    │   ├── menus
    │   │   ├── Menuable.java
    │   │   ├── DoctorMenu.java
    │   │   ├── PatientAuthMenu.java
    │   │   ├── PatientMenu.java
    │   ├── patient
    │   │   ├── Patient.java
    │   │   ├── PatientList.java
    │   ├── util
    │   │   ├── Label.java
    │   │   ├── Line.java
    │   │   ├── State.java
    ├── .gitignore
    ├── Main.java
    └── .README.md


## Screenshots

![Starting Panel](https://raw.githubusercontent.com/Abhikr51/Core-Java-HMS/main/hms/screenshots/Starting-Panel.png "Starting Panel")