package com.example.flighttrainingacademy_cse213_oop_project;

import java.time.LocalDate;

public class AircraftMechanic extends User {
    public AircraftMechanic(String usertype, String username, String password, String name, String email, String phone, LocalDate dob, LocalDate doj) {
        super(usertype, username, password, name, email, phone, dob, doj);
    }

}
