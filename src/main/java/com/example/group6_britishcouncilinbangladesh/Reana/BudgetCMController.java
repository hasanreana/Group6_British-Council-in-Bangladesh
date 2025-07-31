package com.example.group6_britishcouncilinbangladesh.Reana;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;

public class BudgetCMController
{
    @javafx.fxml.FXML
    private TableColumn amountTC;
    @javafx.fxml.FXML
    private Label outputLable;
    @javafx.fxml.FXML
    private TextField amountTextField2;
    @javafx.fxml.FXML
    private TableColumn departmentTC;
    @javafx.fxml.FXML
    private Label proposalInfoLabel;
    @javafx.fxml.FXML
    private TextField departmentTextField1;
    @javafx.fxml.FXML
    private TableColumn dateTC;
    @javafx.fxml.FXML
    private DatePicker datepickerTextField;
    @javafx.fxml.FXML
    private TextField proposalIdTextField;
    @javafx.fxml.FXML
    private TextField statusTextField3;
    @javafx.fxml.FXML
    private TableColumn statusTC;
    @javafx.fxml.FXML
    private TableView budgetTableView;
    @javafx.fxml.FXML
    private TableColumn proposalIdTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void addButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/ManagingDirectorDeshboard.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void declineButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void acceptButtonOnAction(ActionEvent actionEvent) {
    }
}