package com.example.flighttrainingacademy_cse213_oop_project;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.time.LocalDate;

public class TrackWeatherAndAirspaceConditionsSceneController {

    SceneLoader sceneLoader = new SceneLoader();

    @FXML
    private ComboBox<LocalDate> weatherDateComboBox;

    @FXML
    private TextArea weatherTextArea;

    @FXML
    void backBtnOnClick(MouseEvent event) throws IOException {
        sceneLoader.switchScene("FlightDispatcherDashboard.fxml", event);
    }

}
