package com.example.flighttrainingacademy_cse213_oop_project;

import java.io.IOException;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;


public class SceneLoader {
    Stage newStage = new Stage();
    Node sceneNode;
    
    public void loadScene(String fxmlFileName){
        
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlFileName));
            Scene newScene = new Scene(root);
            newStage.setScene(newScene);
            newStage.show();
        }
        catch(Exception e) {
            System.out.println(e);
        }
        
    }
    
    public Node getSceneRoot(String fxmlFileName) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlFileName));
            return root;
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public void switchScene(String fxmlFileName, Event event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(fxmlFileName));
        Scene nextScene = new Scene(root);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow();
        stg.setScene(nextScene);
        stg.show();
    }

    public void switchScene2(String fxmlFileName, Event event) {
        try {
            // Load the new FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFileName));
            Parent newRoot = loader.load();

            // Get the current stage
            Stage stage = (Stage) ((MenuItem) event.getSource()).getParentPopup().getOwnerWindow();

            // Set the new scene
            Scene scene = new Scene(newRoot);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void closeScene(String fxmlFileName, Event event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(fxmlFileName));
        Scene thisScene = new Scene(root);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow();
        stg.setScene(thisScene);
        stg.close();
    }
}
