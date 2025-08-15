package com.example.group6_britishcouncilinbangladesh.Solaiman_Munna;

import com.example.group6_britishcouncilinbangladesh.Reana.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.IOException;

public class AddNewSessionMTSController
{
    @javafx.fxml.FXML
    private DatePicker DatePickerANS;
    @javafx.fxml.FXML
    private ComboBox VenueComboBox;
    @javafx.fxml.FXML
    private TextField TimeTextFeild;
    @javafx.fxml.FXML
    private TextField CapacityTextFeild;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackButtonANS(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/ManageTestSessionIECOrd.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void AddButtonANS(ActionEvent actionEvent) {
    }
}