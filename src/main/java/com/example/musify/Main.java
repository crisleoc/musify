package com.example.musify;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;
import java.util.Optional;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.getIcons().add(new Image(Objects.requireNonNull(Main.class.getResourceAsStream("images/icon.png"))));
        stage.setTitle("MUSIFY");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("MUSIFY");
        alert.setHeaderText("Welcome to Musify");
        alert.setContentText(" Execute Controller.anotherCode() ?");
        Optional <ButtonType> result = alert.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            Controller.anotherCode();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}