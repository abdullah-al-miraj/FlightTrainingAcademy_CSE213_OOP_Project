package com.example.flighttrainingacademy_cse213_oop_project;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class SignInController {

    SceneLoader sceneLoader = new SceneLoader();
    Alert infoAlert = new Alert(Alert.AlertType.INFORMATION);
    Alert errorAlert = new Alert(Alert.AlertType.ERROR);

    @FXML
    private TextField passwordTextField;

    @FXML
    private TextField userIdTextField;

    @FXML
    void signInOnClick(MouseEvent event) throws IOException {
        if(userIdTextField.getText().equals("") || passwordTextField.getText().equals("")) {
            errorAlert.setTitle("Error");
            errorAlert.setContentText("Please fill all fields");
            errorAlert.showAndWait();
        }
        if(userIdTextField.getText().equals("miraj") && passwordTextField.getText().equals("flightdispatcher")) {
            sceneLoader.switchScene("FlightDispatcherDashboard.fxml", event);
        }
        else if(userIdTextField.getText().equals("miraj") && passwordTextField.getText().equals("aircraftmechanic")) {
            sceneLoader.switchScene("AircraftMechanicDashboard.fxml", event);
        }
        else {
            errorAlert.setTitle("Error");
            errorAlert.setContentText("Username and password don't match. Please try again.");
            errorAlert.showAndWait();
        }


    }

}
