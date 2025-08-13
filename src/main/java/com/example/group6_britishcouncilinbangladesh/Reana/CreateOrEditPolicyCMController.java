package com.example.group6_britishcouncilinbangladesh.Reana;

import javafx.event.ActionEvent;

import java.io.IOException;

public class CreateOrEditPolicyCMController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void goBackToDashboardButtonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/DashboardCM.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void createPolicyButtonOnClicked(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/CreatePolicyCM.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void editPolicyButtonOnClicked(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/EditPolicyCM.fxml", actionEvent);
    }
}