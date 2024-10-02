package org.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

public static void main(String[] args) throws Exception{
launch(args);
}

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("layout.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 455);
        stage.setTitle("Projeto Profª Adriana!");
        stage.setScene(scene);
        stage.show();
    }




    }
