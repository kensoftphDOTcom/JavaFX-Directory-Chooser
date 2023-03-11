package com.kensoftph.directorychooser;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.File;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        DirectoryChooser chooser = new DirectoryChooser();
        chooser.setTitle("Select Directory");
        chooser.setInitialDirectory(new File("c:\\"));
        Stage stage = (Stage) welcomeText.getScene().getWindow();
        File directory = chooser.showDialog(stage);
        if(directory != null){
            System.out.println(directory);
        }
    }
}