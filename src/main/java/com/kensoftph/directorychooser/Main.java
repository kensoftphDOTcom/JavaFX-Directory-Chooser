package com.kensoftph.directorychooser;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        BorderPane layout = new BorderPane();

        Button button = new Button("Select");
        Label label = new Label();

        layout.setTop(button);
        layout.setCenter(label);

        BorderPane.setAlignment(button, Pos.CENTER);
        BorderPane.setAlignment(label, Pos.CENTER);

        button.setOnAction(actionEvent -> {
            DirectoryChooser chooser = new DirectoryChooser();
            chooser.setTitle("Select Directory");
            chooser.setInitialDirectory(new File("c:\\"));
            File directory = chooser.showDialog(stage);
            if(directory != null){
                label.setText(directory.toString());
            }
        });

        //FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(layout, 320, 240);
        stage.setTitle("JavaFX Directory Chooser");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}