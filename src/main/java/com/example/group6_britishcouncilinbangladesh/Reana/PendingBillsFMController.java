package com.example.group6_britishcouncilinbangladesh.Reana;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class PendingBillsFMController
{
    @javafx.fxml.FXML
    private TextField IDVenuesTextField;
    @javafx.fxml.FXML
    private TextField venuesPaymentTextField3;
    @javafx.fxml.FXML
    private Label amountLabel;
    @javafx.fxml.FXML
    private TableColumn paymentTC;
    @javafx.fxml.FXML
    private TextField biillMonthTextField12;
    @javafx.fxml.FXML
    private TableColumn MonthNameTC;
    @javafx.fxml.FXML
    private TextField NameMonthTextField1;
    @javafx.fxml.FXML
    private TableColumn IdTC;
    @javafx.fxml.FXML
    private TextField TotalVenuesTextField2;
    @javafx.fxml.FXML
    private TableColumn BillTC;
    @javafx.fxml.FXML
    private TableView TableView;
    @javafx.fxml.FXML
    private TextField TotalMonthTextField11;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void addButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void amountPendingBillButtonOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/DashboardFinanceManager.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void editProjectInfoButtonOnClicked(ActionEvent actionEvent) {
    }
}