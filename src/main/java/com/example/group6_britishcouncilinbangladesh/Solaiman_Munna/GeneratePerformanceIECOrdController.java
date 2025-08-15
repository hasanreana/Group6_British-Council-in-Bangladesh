package com.example.group6_britishcouncilinbangladesh.Solaiman_Munna;

import com.example.group6_britishcouncilinbangladesh.Reana.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.io.IOException;

public class GeneratePerformanceIECOrdController
{
    @javafx.fxml.FXML
    private Label AvgScoreLabel;
    @javafx.fxml.FXML
    private Label StudentsFLabel;
    @javafx.fxml.FXML
    private ComboBox SelectSessionCombobox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/DashboardIELTScord.fxml", actionEvent);
    }
}