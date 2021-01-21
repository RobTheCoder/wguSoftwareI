package com.rs.inventory;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class AddPartController {
    @FXML
    private TextField partID;
    @FXML
    private TextField partName;
    @FXML
    private TextField partInv;
    @FXML
    private TextField partPrice;
    @FXML
    private TextField partMax;
    @FXML
    private TextField partMin;
    @FXML
    private TextField partMachineID;
    @FXML
    private AnchorPane addPartWindow;
    @FXML
    private RadioButton outSourceRadio;
    @FXML
    private Label sourceLbl;


    @FXML
    public void radioClick() {
        if (outSourceRadio.isSelected()) {
            sourceLbl.setText("Company Name");
        } else {
            sourceLbl.setText("Machine ID");
        }
    }
    @FXML
    public void saveClicked() {
        //Validate Empty
        if (partName.getText().trim().isEmpty()) {
            System.out.println("Please enter a part name");
            return;
        }
        if (partInv.getText().trim().isEmpty()) {
            System.out.println("Please enter a inventory number");
            return;
        }
        if (partPrice.getText().trim().isEmpty()) {
            System.out.println("Please enter a part price");
            return;
        }
        if (partMax.getText().trim().isEmpty()) {
            System.out.println("Please enter a part max");
            return;
        }
        if (partMin.getText().trim().isEmpty()) {
            System.out.println("Please enter a part min");
            return;
        }
        if (partMachineID.getText().trim().isEmpty()) {
            System.out.println("Please enter a machine ID or Company Name");
            return;
        }
        //Validate Int
        if (!partInv.getText().matches("[0-9]+")) {
            System.out.println("Invalid part price");
            return;
        }
        if (!partPrice.getText().matches("[0-9]+")) {
            System.out.println("Invalid part price");
            return;
        }
        if (!partMax.getText().matches("[0-9]+")) {
            System.out.println("Invalid part price");
            return;
        }
        if (!partMin.getText().matches("[0-9]+")) {
            System.out.println("Invalid part price");
            return;
        }
        if (!outSourceRadio.isSelected()) {
            if (!partMachineID.getText().matches("[0-9]+")) {
                System.out.println("Please enter a valid machine ID");
            }
        }
        //Set values
        double partPriceDouble = Double.parseDouble(partPrice.getText());
        int partIDInt = Integer.parseInt(partID.getText());
        String partNameStr = partName.getText();

        int stockInt = Integer.parseInt(partInv.getText());
        int minInt = Integer.parseInt(partMin.getText());
        int maxInt = Integer.parseInt(partMax.getText());
        InHouse thisPart = new InHouse(partIDInt,partNameStr,partPriceDouble,stockInt,minInt,maxInt, 0); //FIX ME: Remove the hard coded zerO
        close();
    }
    public void close() {
        Stage thisStage = (Stage) addPartWindow.getScene().getWindow();
        thisStage.close();
        Main.testAppend("OMG!!!");
    }
}
