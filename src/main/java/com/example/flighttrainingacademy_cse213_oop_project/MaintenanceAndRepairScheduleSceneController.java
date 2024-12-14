package com.example.flighttrainingacademy_cse213_oop_project;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class MaintenanceAndRepairScheduleSceneController {

    SceneLoader sceneLoader = new SceneLoader();

    @FXML
    private TableColumn<?, ?> dateCol;

    @FXML
    private TableColumn<?, ?> detailsCol;

    @FXML
    private TableView<?> scheduleTable;

    @FXML
    void backBtnOnClick(MouseEvent event) throws IOException {
        sceneLoader.switchScene("AircraftMechanicDashboard.fxml", event);
    }

}
