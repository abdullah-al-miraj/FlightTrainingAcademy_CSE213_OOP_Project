package com.example.flighttrainingacademy_cse213_oop_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class AircraftMechanicDashboardController {

    SceneLoader sceneLoader = new SceneLoader();

    @FXML
    private MenuBar aircraftMechanicDashboardMenubar;

    @FXML
    void maintenanceBtnOnClick(ActionEvent event) throws IOException {
        sceneLoader.switchScene2("MaintenanceAndRepairScheduleScene.fxml", event);
    }

    @FXML
    void rprtBtnOnClick(ActionEvent event) {
        sceneLoader.switchScene2("TechnicalProblemsReportScene.fxml", event);
    }

    @FXML
    void signOutBtnOnClick(MouseEvent event) throws IOException {
        sceneLoader.switchScene("SignInScene.fxml", event);
    }

}
