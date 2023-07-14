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


## How to Run Project

- **Step 1 :** Clone Project
- **Step 2 :** Make sure you have installed jdk properly .
- **Step 3 :** navigate to folder directory.
- **Step 4 :** Run these commands to start .

    ```bash
    javac Main.java
    java Main
    ```


## Program Flow 
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

## Demo video

[Documentation](https://drive.google.com/file/d/1El-CV6G66DBznUGBlQVTFQBzruAPoQqu/view?google_abuse=GOOGLE_ABUSE_EXEMPTION%3DID%3Dd41034a73aef6fff:TM%3D1689324433:C%3Dr:IP%3D2405:201:9000:3873:f57e:1536:a221:3385-:S%3DLjoV8uLQTq3hUkXOOKAbkvk%3B+path%3D/%3B+domain%3Dgoogle.com%3B+expires%3DFri,+14-Jul-2023+11:47:13+GMT)



## Screenshots

#### Starting Panel
![Starting Panel](https://raw.githubusercontent.com/Abhikr51/Core-Java-HMS/main/hms/screenshots/Starting-Panel.png)
---
#### Patient Auth Panel
![Patient Auth Panel](https://raw.githubusercontent.com/Abhikr51/Core-Java-HMS/main/hms/screenshots/Patient-authentication.png)
---
#### Patient Menu
![Patient Menu](https://raw.githubusercontent.com/Abhikr51/Core-Java-HMS/main/hms/screenshots/Patient-Menu.png)
---
#### Appointment Booking
![Appointment Booking](https://raw.githubusercontent.com/Abhikr51/Core-Java-HMS/main/hms/screenshots/book-appointment.png)
---
#### View Medicines
![View Medicines](https://raw.githubusercontent.com/Abhikr51/Core-Java-HMS/main/hms/screenshots/view-medicines-from-patient.png)
---
#### Doctor Panel
![Doctor Panel](https://raw.githubusercontent.com/Abhikr51/Core-Java-HMS/main/hms/screenshots/doctor-panel.png)
---
#### Showing All appointments for doctor.
![Showing All appointments for doctor.](https://raw.githubusercontent.com/Abhikr51/Core-Java-HMS/main/hms/screenshots/doctor-view-all-bookings.png)
---
#### Putting Medicines to patient
![Putting Medicines to patient](https://raw.githubusercontent.com/Abhikr51/Core-Java-HMS/main/hms/screenshots/put-medicines.png)
---



## 🚀 About Me
I'm a full stack developer working in MERN Stack.




## 🔗 Links
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://abhikr51.github.io/portfolio/)

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/abhijit-kumar-708b53192/)
