package com.rs.inventory.Model;

import com.rs.inventory.Part;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DataProvider {
    private static ObservableList <Part> allParts = FXCollections.observableArrayList();
    public static void addAnimal(Part part) {
        allParts.add(part);
    }
    public static ObservableList<Part> getAllParts () {
        return allParts;
    }
}
