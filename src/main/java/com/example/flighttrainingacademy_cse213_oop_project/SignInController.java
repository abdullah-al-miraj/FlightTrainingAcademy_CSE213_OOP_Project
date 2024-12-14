package com.example.flighttrainingacademy_cse213_oop_project;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SignInController implements Initializable {

    SceneLoader sceneLoader = new SceneLoader();
    Alert errorAlert = new Alert(Alert.AlertType.ERROR);

    @FXML
    private TextField passwordTextField;

    @FXML
    private TextField userIdTextField;

    @FXML
    private ComboBox<String> usertypeComboBox;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        usertypeComboBox.getItems().addAll("Aircraft Mechanic", "Flight Dispatcher");
    }

    @FXML
    void signInOnClick(MouseEvent event) throws IOException {

        if(usertypeComboBox.getValue() == null || userIdTextField.getText().isEmpty() || passwordTextField.getText().isEmpty()) {
            errorAlert.setTitle("Error");
            errorAlert.setContentText("Please fill all fields");
            errorAlert.showAndWait();
        }
        if (Database.verifyUserPassword(usertypeComboBox.getValue(), userIdTextField.getText(), passwordTextField.getText())) {
            if (usertypeComboBox.getValue().equals("Aircraft Mechanic")) {
                sceneLoader.switchScene("AircraftMechanicDashboard.fxml", event);
            }
            else if (usertypeComboBox.getValue().equals("Flight Dispatcher")) {
                sceneLoader.switchScene("FlightDispatcherDashboard.fxml", event);
            }
        }
        else {
            errorAlert.setTitle("Error");
            errorAlert.setContentText("Username or password is incorrect. Try again");
            errorAlert.showAndWait();
        }

    }

    @FXML
    void signUpOnClick(MouseEvent event) throws IOException {
        sceneLoader.switchScene("SignUpScene.fxml", event);
    }

}
