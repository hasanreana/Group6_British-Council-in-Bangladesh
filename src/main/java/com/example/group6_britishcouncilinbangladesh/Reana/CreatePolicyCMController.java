package com.example.group6_britishcouncilinbangladesh.Reana;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CreatePolicyCMController
{
    @javafx.fxml.FXML
    private TextField policyTitleTextField;
    @javafx.fxml.FXML
    private DatePicker policyDatePicker;
    @javafx.fxml.FXML
    private TextField policyDetailsTextField;
    @javafx.fxml.FXML
    private Label policyInfoLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void goBackToDashboardButtonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/ManagingDirectorDeshboard.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void savePolicyButtonOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void downloadPolicyButtonOnClick(ActionEvent actionEvent) {
    }
}