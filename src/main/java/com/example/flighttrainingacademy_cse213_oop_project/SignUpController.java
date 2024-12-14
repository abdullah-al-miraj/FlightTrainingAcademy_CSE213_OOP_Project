package com.example.flighttrainingacademy_cse213_oop_project;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class SignUpController implements Initializable {

    @FXML
    private DatePicker dobDatePicker;

    @FXML
    private DatePicker dojDatePicker;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField passwordTextField;

    @FXML
    private TextField phoneTextField;

    @FXML
    private TextField userIdTextField;

    @FXML
    private ComboBox<String> usertypeComboBox;

    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
    SceneLoader sceneLoader = new SceneLoader();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        usertypeComboBox.getItems().addAll("Aircraft Mechanic", "Flight Dispatcher");
    }

    @FXML
    void signUpBtnOnClick(MouseEvent event) throws IOException {

        String usertype = usertypeComboBox.getValue();
        String username = userIdTextField.getText();
        String password = passwordTextField.getText();
        String email = emailTextField.getText();
        String name = nameTextField.getText();
        String phone = phoneTextField.getText();
        LocalDate dob = dobDatePicker.getValue();
        LocalDate doj = dojDatePicker.getValue();

        if (usertype.isEmpty() || username.isEmpty() || password.isEmpty() || name.isEmpty() || phone.isEmpty() || email.isEmpty() || dob == null || doj == null) {
            errorAlert.setTitle("Error");
            errorAlert.setContentText("Please fill all fields");
            errorAlert.showAndWait();
        }
        else if (dob.isAfter(doj)) {
            errorAlert.setTitle("Error");
            errorAlert.setContentText("Date of birth cannot be after date of Joining");
            errorAlert.showAndWait();
        }
        else if ((doj.getYear()-dob.getYear())<18) {
            errorAlert.setTitle("Error");
            errorAlert.setContentText("Age must be above 18");
            errorAlert.showAndWait();
        }
        else {
            Database.saveUsers(usertype, username, password, email, name, phone, dob, doj);
            sceneLoader.switchScene("SignInScene.fxml", event);
        }

    }

}
