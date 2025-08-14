package com.example.group6_britishcouncilinbangladesh.Reana;

import javafx.event.ActionEvent;

import java.io.IOException;

public class DashboardCMController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void viewBudgetOnButtonClick(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/BudgetCM.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void createOrEditPolicyOnButtonClick(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/CreateOrEditPolicyCM.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void logOutOnButtonClicked(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/LogIn.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void viewReportOnButtonClicked(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/ViewReportCM.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void approveDecisionOnButtonClick(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/DecisionMakingCM.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void assignTaskOnButtonClick(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/AssignTaskCM.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void scheduleMeetingOnButtonClick(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/ScheduleMeetingCM.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void employeeDetailsOnButtonClick(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/EmployeeDetailsCM.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void reviewEmailsOnButtonClick(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/ReviewEmailsCM.fxml", actionEvent);
    }
}