package org.example.facedetectionapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    public void onButtonClick(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("video-window.fxml"));

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void startCamera(ActionEvent event){

    }

//    public void switchToVideoScene(ActionEvent event) throws IOException {
//
//    }
}
