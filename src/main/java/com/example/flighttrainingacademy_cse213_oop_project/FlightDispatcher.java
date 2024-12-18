package com.example.flighttrainingacademy_cse213_oop_project;

import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class FlightDispatcher extends User {

    public FlightDispatcher(String usertype, String username, String password, String name, String email, String phone, LocalDate dob, LocalDate doj) {
        super(usertype, username, password, name, email, phone, dob, doj);
    }

};