package com.example.group6_britishcouncilinbangladesh.Reana;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;

public class EditPolicyCMController
{
    @javafx.fxml.FXML
    private TableColumn effectiveDateTableColumn;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TableColumn policyNameTableColumn;
    @javafx.fxml.FXML
    private TextField detailsTextField1;
    @javafx.fxml.FXML
    private TableView policyInfoTableView;
    @javafx.fxml.FXML
    private TableColumn policyDetailsTableColumn;
    @javafx.fxml.FXML
    private DatePicker dateDatepicker;
    @javafx.fxml.FXML
    private TextArea policyInfoLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void editAndSaveButtonOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void goBackToDashboardButtonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/ManagingDirectorDeshboard.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void selectAndViewDetailsButtonOnClick(ActionEvent actionEvent) {
    }
}