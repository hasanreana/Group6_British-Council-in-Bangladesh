package com.example.group6_britishcouncilinbangladesh.Solaiman_Munna;

import com.example.group6_britishcouncilinbangladesh.Reana.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;

public class ProcessPaymentIECOrdController
{
    @javafx.fxml.FXML
    private Label NameLabel;
    @javafx.fxml.FXML
    private TableColumn PassportColPPT;
    @javafx.fxml.FXML
    private Label PassportLabel;
    @javafx.fxml.FXML
    private TableView PaymentProcessTableView;
    @javafx.fxml.FXML
    private TableColumn NameColPPT;
    @javafx.fxml.FXML
    private ComboBox StatusCombobox;
    @javafx.fxml.FXML
    private Label AlertLabelPP;
    @javafx.fxml.FXML
    private TableColumn StatusColPPT;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void UpdateButtonPP(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void EditButtonPP(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BackButtonPP(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/DashboardIELTScord.fxml", actionEvent);
    }
}