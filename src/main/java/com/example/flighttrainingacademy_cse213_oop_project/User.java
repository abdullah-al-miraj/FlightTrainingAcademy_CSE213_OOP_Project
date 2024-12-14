package com.example.flighttrainingacademy_cse213_oop_project;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class User implements Serializable {
    private String usertype;
    private String username;
    private String password;
    private String name;
    private String email;
    private String phone;
    private LocalDate dob;
    private LocalDate doj;

    public User(String usertype, String username, String password, String name, String email, String phone, LocalDate dob, LocalDate doj) {
        this.usertype = usertype;
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.dob = dob;
        this.doj = doj;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

}
