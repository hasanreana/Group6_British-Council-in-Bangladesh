package com.example.group6_britishcouncilinbangladesh.Reana;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class RecordsBudgetFMController
{
    @javafx.fxml.FXML
    private TextField noVenueTF;
    @javafx.fxml.FXML
    private TableColumn NoEmployeeTC;
    @javafx.fxml.FXML
    private TextField SalaryTextField;
    @javafx.fxml.FXML
    private TableColumn DateTC;
    @javafx.fxml.FXML
    private TableColumn SalaryTC;
    @javafx.fxml.FXML
    private TableColumn BillTC;
    @javafx.fxml.FXML
    private TableColumn NoVenueTC;
    @javafx.fxml.FXML
    private TextField NoEmployeeTextField;
    @javafx.fxml.FXML
    private TextField PaymentTF;
    @javafx.fxml.FXML
    private TextField DateTextField;
    @javafx.fxml.FXML
    private TextField billTextField;
    @javafx.fxml.FXML
    private Label budgetLabel;
    @javafx.fxml.FXML
    private TableColumn PaymentTC;
    @javafx.fxml.FXML
    private Label msgLabel;
    @javafx.fxml.FXML
    private TableView TableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void sendMagButtonOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void goToActivitiesPageButtonOnClicked(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/DashboardFinanceManager.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void seeInfoButtonOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addNewInfoButtonOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void totalBudgetButtonOnClicked(ActionEvent actionEvent) {
    }
}