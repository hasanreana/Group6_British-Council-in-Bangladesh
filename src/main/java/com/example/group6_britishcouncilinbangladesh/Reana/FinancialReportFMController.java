package com.example.group6_britishcouncilinbangladesh.Reana;

import javafx.event.ActionEvent;

import java.io.IOException;

public class FinancialReportFMController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void goToActivitiesPageButtonOnClicked(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/DashboardFinanceManager.fxml", actionEvent);
    }
}