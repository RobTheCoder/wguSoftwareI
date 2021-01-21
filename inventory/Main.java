package com.rs.inventory;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    private ObservableList test;

    public static void testAppend(String yell) {
        System.out.println(yell);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("View_Controller/mainWindow.fxml"));
        primaryStage.setTitle("");
        primaryStage.setScene(new Scene(root, 1200, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
