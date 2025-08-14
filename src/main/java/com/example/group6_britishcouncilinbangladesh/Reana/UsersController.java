package com.example.group6_britishcouncilinbangladesh.Reana;

import javafx.event.ActionEvent;

import java.io.IOException;

public class UsersController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void mdButtonOnClick(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/DashboardCM.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void pmButtonOnClick(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/DashboardFinanceManager.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void logOutButtonOnClick(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/LogIn.fxml", actionEvent);
    }
}