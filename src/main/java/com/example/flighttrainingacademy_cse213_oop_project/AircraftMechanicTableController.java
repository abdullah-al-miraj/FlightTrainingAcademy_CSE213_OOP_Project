package com.example.flighttrainingacademy_cse213_oop_project;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class AircraftMechanicTableController implements Initializable {

    @FXML
    private TableView<AircraftMechanic> aircraftMechanicTableView;

    @FXML
    private TableColumn<AircraftMechanic, LocalDate> dobCol;

    @FXML
    private TableColumn<AircraftMechanic, String> emailCol;

    @FXML
    private TableColumn<AircraftMechanic, String> nameCol;

    @FXML
    private TableColumn<AircraftMechanic, String> phoneCol;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nameCol.setCellValueFactory(new PropertyValueFactory<AircraftMechanic, String>("name"));
        emailCol.setCellValueFactory(new PropertyValueFactory<AircraftMechanic, String>("email"));
        dobCol.setCellValueFactory(new PropertyValueFactory<AircraftMechanic, LocalDate>("name"));
        phoneCol.setCellValueFactory(new PropertyValueFactory<AircraftMechanic, String>("email"));
    }

    @FXML
    void showDataBtn(MouseEvent event) {
        AircraftMechanic aircraftMechanic = new AircraftMechanic("Aircraft Mechanic", "miraj", "1234", "Miraj", "miraj@gmail.com", "01723424234", null, null);
        aircraftMechanicTableView.getItems().add(aircraftMechanic);
    }

}