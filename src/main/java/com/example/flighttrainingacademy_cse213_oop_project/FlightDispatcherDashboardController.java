package com.example.flighttrainingacademy_cse213_oop_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class FlightDispatcherDashboardController {

    SceneLoader sceneLoader = new SceneLoader();

    @FXML
    void communicationsMenuItemOnClick(ActionEvent event) {
        sceneLoader.switchScene2("CollaborationAndCommunicationScene.fxml", event);
    }

    @FXML
    void signOutBtnOnClick(MouseEvent event) throws IOException {
        sceneLoader.switchScene("SignInScene.fxml", event);
    }

    @FXML
    void weatherMenuItemOnClick(ActionEvent event) throws IOException {
        sceneLoader.switchScene2("TrackWeatherAndAirspaceConditionsScene.fxml", event);
    }

}
