package com.example.flighttrainingacademy_cse213_oop_project;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class TechnicalProblemsReportSceneController {

    SceneLoader sceneLoader = new SceneLoader();

    @FXML
    void backBtnOnClick(MouseEvent event) throws IOException {
        sceneLoader.switchScene("AircraftMechanicDashboardScene.fxml", event);
    }

    @FXML
    void generateRprtBtnOnClick(MouseEvent event) {

    }

}
