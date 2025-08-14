package com.example.group6_britishcouncilinbangladesh.Reana;

import javafx.event.ActionEvent;

import java.io.IOException;

public class DashboardFinanceManagerController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void LogOutOnActionButton(ActionEvent actionEvent)throws IOException  {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/LogIn.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void creatingBillsButton(ActionEvent actionEvent)throws IOException  {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/creatingBillsFM.fxml", actionEvent);
    }



    @javafx.fxml.FXML
    public void pendingBillsButton(ActionEvent actionEvent)throws IOException  {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/PendingBillsFM.fxml", actionEvent);
    }



    @javafx.fxml.FXML
    public void handleLatePaymentsButton(ActionEvent actionEvent)throws IOException  {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/LatePaymentFM.fxml", actionEvent);
    }



    @javafx.fxml.FXML
    public void financialReportButtons(ActionEvent actionEvent)throws IOException  {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/FinancialReportFM.fxml", actionEvent);
    }



    @javafx.fxml.FXML
    public void managePayrollButton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/ManagePayrollFM.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void employeeSalaryRecordsButton(ActionEvent actionEvent)throws IOException  {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/RecordsEmployeeSalaryFM.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void recordsBudgetButton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/RecordsOfBudgetFM.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void expanseRecordsButton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/TrackExpanseFM.fxml", actionEvent);
    }
}