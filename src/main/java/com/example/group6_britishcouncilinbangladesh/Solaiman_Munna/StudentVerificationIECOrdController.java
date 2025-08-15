package com.example.group6_britishcouncilinbangladesh.Solaiman_Munna;

import com.example.group6_britishcouncilinbangladesh.Reana.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;

public class StudentVerificationIECOrdController
{
    @javafx.fxml.FXML
    private Label NameLabel;
    @javafx.fxml.FXML
    private Label PassportLabel;
    @javafx.fxml.FXML
    private TableColumn StatusColVT;
    @javafx.fxml.FXML
    private TableColumn NameColVT;
    @javafx.fxml.FXML
    private TableView VerifyStudentTableView;
    @javafx.fxml.FXML
    private TableColumn PassportColVt;
    @javafx.fxml.FXML
    private ComboBox StatusCombobox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void UpdateButtonVT(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BackButtonVT(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/DashboardIELTScord.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void EditButtonVT(ActionEvent actionEvent) {
    }
}