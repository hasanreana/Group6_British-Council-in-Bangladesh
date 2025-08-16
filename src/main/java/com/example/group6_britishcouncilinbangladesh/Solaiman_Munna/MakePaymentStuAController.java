package com.example.group6_britishcouncilinbangladesh.Solaiman_Munna;

import com.example.group6_britishcouncilinbangladesh.Reana.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class MakePaymentStuAController
{
    @javafx.fxml.FXML
    private TextField NameTextFeild;
    @javafx.fxml.FXML
    private TextField TransitionIDTextFeild;
    @javafx.fxml.FXML
    private Label AlertLabelPayment;
    @javafx.fxml.FXML
    private TextField PassportTextFeild;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/DashboardStudentApplicant.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void VerificationButton(ActionEvent actionEvent) {
        AlertLabelPayment.setText("Your data has been recorded. \nWe will soon update your Payment details");
    }
}