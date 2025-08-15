package com.example.group6_britishcouncilinbangladesh.Solaiman_Munna;

import com.example.group6_britishcouncilinbangladesh.Reana.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;

public class UploadResultsIECOrdController
{
    @javafx.fxml.FXML
    private TableView ResultTableView;
    @javafx.fxml.FXML
    private TableColumn PassportNumResColT;
    @javafx.fxml.FXML
    private TextField PassportNumberTextFeild;
    @javafx.fxml.FXML
    private ComboBox ScoreCombobox;
    @javafx.fxml.FXML
    private TableColumn ScoreResColT;
    @javafx.fxml.FXML
    private Label AlertLabelRU;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void UpdateButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/DashboardIELTScord.fxml", actionEvent);
    }
}