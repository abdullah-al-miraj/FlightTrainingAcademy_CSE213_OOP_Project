module com.example.flighttrainingacademy_cse213_oop_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.flighttrainingacademy_cse213_oop_project to javafx.fxml;
    exports com.example.flighttrainingacademy_cse213_oop_project;
}