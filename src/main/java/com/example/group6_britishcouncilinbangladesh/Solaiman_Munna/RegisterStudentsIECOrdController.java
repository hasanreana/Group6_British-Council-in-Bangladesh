package com.example.group6_britishcouncilinbangladesh.Solaiman_Munna;

import com.example.group6_britishcouncilinbangladesh.Reana.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.io.IOException;

public class RegisterStudentsIECOrdController
{
    @javafx.fxml.FXML
    private TextField StudentNameTextFeild;
    @javafx.fxml.FXML
    private ComboBox SessionCombobox;
    @javafx.fxml.FXML
    private TextField PssportNumberTextFeild;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void RegisterButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/DashboardIELTScord.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void ViewRegisteredStudentsButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/RegisteredStudentsRS.fxml", actionEvent);
    }
}