package com.example.group6_britishcouncilinbangladesh.Solaiman_Munna;

import com.example.group6_britishcouncilinbangladesh.Reana.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class DashboardIELTScordController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ProcessPaymentsButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/ProcessPaymentIECOrd.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void RegisterStudentsButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/RegisterStudentsIECOrd.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void LogOutButtonICD(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/LogIn.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void ViewPerformanceReportsButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/GeneratePerformanceIECOrd.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void ManageAccountButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/ManageAccountIECOrd.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void ManageTestSessionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/ManageTestSessionIECOrd.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void VerifyStudentIdentityButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/StudentVerificationIECOrd.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void UploadTestResultsButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/UploadResultsIECOrd.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void IncidentReportingButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/RecordIncidentIECOrd.fxml", actionEvent);
    }
}