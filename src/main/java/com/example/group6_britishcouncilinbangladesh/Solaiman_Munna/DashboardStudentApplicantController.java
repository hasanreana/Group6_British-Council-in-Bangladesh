package com.example.group6_britishcouncilinbangladesh.Solaiman_Munna;

import com.example.group6_britishcouncilinbangladesh.Reana.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class DashboardStudentApplicantController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void FeedbackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/ProvideFeedbackStuA.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void DownloadAdmitCardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("", actionEvent);
    }

    @javafx.fxml.FXML
    public void MakePaymentButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/MakePaymentStuA.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void ApplyforIELTSButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/ApplyForIELTSStuA.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void LogOutButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/LogIn.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void RequestCertificateReissueButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/CertificateReissueStuA.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void ViewTestResultsButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/ViewResultsStuA.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void UpdateProfileButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/UpdateProfileStuA.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void WithdrawApplicationButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/WithdrawApplicationStuA.fxml", actionEvent);
    }
}