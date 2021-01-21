package com.rs.inventory;

import com.rs.inventory.Model.DataProvider;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;


import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    @FXML
    private AnchorPane mainWindow;
    //Part ID
    @FXML
    private TableView<Part> partsTblView;
    @FXML
    private TableColumn<Part, Integer> partIDTblCol;

    @FXML
    public void onAddPartClicked() {
        Stage stage = new Stage();
        try {
            Parent root = FXMLLoader.load(getClass().getResource("View_Controller/addPart.fxml"));
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            System.out.printf("Couldn't handle this");
            e.printStackTrace();
            return;
        }
        stage.showAndWait();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //partsTblView.setItems(DataProvider.getAllParts());
        //partIDTblCol.setCellValueFactory(new PropertyValueFactory<>("id"));
    }
}
