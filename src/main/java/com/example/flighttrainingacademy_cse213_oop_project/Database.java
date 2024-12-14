package com.example.flighttrainingacademy_cse213_oop_project;

import javafx.scene.control.Alert;

import java.io.*;
import java.time.LocalDate;

public class Database {

    static Alert anAlert = new Alert(Alert.AlertType.ERROR);
    static Alert anInfoAlert = new Alert(Alert.AlertType.INFORMATION);


    // Method for signing up a new user


    public static void saveUsers(String usertype, String username, String password, String name, String email, String phone, LocalDate dob, LocalDate doj) {
        File f1 = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        if (usertype.equals("Aircraft Mechanic")) {
            try {
                AircraftMechanic newUser = new AircraftMechanic(usertype, username, password, name, email, phone, dob, doj);
                f1 = new File("AircraftMechanicUser.bin");
                if (f1.exists()) {
                    fos = new FileOutputStream(f1, true);
                    oos = new AppendObjectOutputStream(fos);
                }
                else {
                    fos = new FileOutputStream(f1);
                    oos = new ObjectOutputStream(fos);
                }
                oos.writeObject(newUser);
                oos.close();
                anInfoAlert.setContentText("User has been saved");
                anInfoAlert.showAndWait();
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                try {
                    if(oos != null) oos.close();
                }
                catch (IOException e) {

                }
            }
        }

        else if (usertype.equals("Flight Dispatcher")) {
            try {
                FlightDispatcher newUser = new FlightDispatcher(usertype, username, password, name, email, phone, dob, doj);
                f1 = new File("FlightDispatcherUser.bin");
                if (f1.exists()) {
                    fos = new FileOutputStream(f1, true);
                    oos = new AppendObjectOutputStream(fos);
                }
                else {
                    fos = new FileOutputStream(f1);
                    oos = new ObjectOutputStream(fos);
                }
                oos.writeObject(newUser);
                oos.close();
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                try {
                    if(oos != null) oos.close();
                }
                catch (IOException e) {

                }
            }
        }
    }


    // Method for Verifying a user


    public static boolean verifyUserPassword(String userType, String username, String password) {

        FileInputStream fis;
        ObjectInputStream ois = null;

        if (userType.equals("Aircraft Mechanic")) {
            AircraftMechanic tempInst;
            File userFile = new File("AircraftMechanicUser.bin");
            try {
                fis = new FileInputStream(userFile);
                ois = new ObjectInputStream(fis);
                while (true) {
                    tempInst = (AircraftMechanic) ois.readObject();
                    if (tempInst.getUsername().equals(username)) {
                        return tempInst.getPassword().equals(password);
                    }
                }
            } catch (FileNotFoundException e) {
                anAlert.setContentText("User file not found!");
                anAlert.show();
                return false;
            } catch (ClassNotFoundException e) {
                anAlert.setContentText("Class not found in user file!");
                anAlert.show();
                return false;
            } catch (IOException e) {
                return false;
            } finally {
                try {
                    if (ois != null) ois.close();
                } catch (IOException e) {
                }
            }
        }
        else if (userType.equals("Flight Dispatcher")) {
            FlightDispatcher tempInst;
            File userFile = new File("FlightDispatcherUser.bin");
            try {
                fis = new FileInputStream(userFile);
                ois = new ObjectInputStream(fis);
                while (true) {
                    tempInst = (FlightDispatcher) ois.readObject();
                    if (tempInst.getUsername().equals(username)) {
                        return tempInst.getPassword().equals(password);
                    }
                }
            } catch (FileNotFoundException e) {
                anAlert.setContentText("User file not found!");
                anAlert.show();
                return false;
            } catch (ClassNotFoundException e) {
                anAlert.setContentText("Class not found in user file!");
                anAlert.show();
                return false;
            } catch (IOException e) {
                return false;
            } finally {
                try {
                    if (ois != null) ois.close();
                } catch (IOException e) {
                }
            }
        }
        return false;
    }
}
