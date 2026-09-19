package com.example.crapsgame262;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Hello!");

        /*
        VBox root = new VBox();
        Label lblHello = new Label("Hello");
        root.getChildren().add(lblHello);

        Scene scene = new Scene(root, 200, 200);
         */

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("welcome-view.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);


        stage.setScene(scene);
        stage.show();
    }
}
