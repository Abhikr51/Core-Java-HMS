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

## Badges

Add badges from somewhere like: [shields.io](https://shields.io/)

[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://choosealicense.com/licenses/mit/)
[![GPLv3 License](https://img.shields.io/badge/License-GPL%20v3-yellow.svg)](https://opensource.org/licenses/)
[![AGPL License](https://img.shields.io/badge/license-AGPL-blue.svg)](http://www.gnu.org/licenses/agpl-3.0)


## 🚀 About Me
I'm a full stack developer working in MERN Stack.




## 🔗 Links
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://abhikr51.github.io/portfolio/)

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/abhijit-kumar-708b53192/)
