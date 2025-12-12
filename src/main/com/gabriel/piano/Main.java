package com.gabriel.piano;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Carrega o FXML
        Parent root = FXMLLoader.load(getClass().getResource("/com/gabriel/piano/piano.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Mini Piano");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args); // inicia o JavaFX
    }
}
