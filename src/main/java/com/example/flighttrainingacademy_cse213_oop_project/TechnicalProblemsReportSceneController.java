package com.example.flighttrainingacademy_cse213_oop_project;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import java.awt.*;
import java.io.IOException;

public class TechnicalProblemsReportSceneController {

    @FXML
    private TextArea reportTextArea;

    SceneLoader sceneLoader = new SceneLoader();


    @FXML
    void backBtnOnClick(MouseEvent event) throws IOException {
        sceneLoader.switchScene("AircraftMechanicDashboard.fxml", event);
    }

    @FXML
    void generateRprtBtnOnClick(MouseEvent event) {
        String file_path = "new_tech_issue_report";
        PDFGenerator.generatePDF(reportTextArea.getText(), file_path);

    }

}
