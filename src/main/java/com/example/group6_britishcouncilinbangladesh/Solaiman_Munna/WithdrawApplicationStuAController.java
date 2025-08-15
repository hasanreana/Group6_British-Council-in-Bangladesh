package com.example.group6_britishcouncilinbangladesh.Solaiman_Munna;

import com.example.group6_britishcouncilinbangladesh.Reana.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import java.io.IOException;

public class WithdrawApplicationStuAController
{
    @javafx.fxml.FXML
    private Label AlertLabel;
    @javafx.fxml.FXML
    private Label ActiveAppLabel;

    @javafx.fxml.FXML
    public void initialize() {

        ActiveAppLabel.setText(
                "ActiveStatus:- \nYou have registered for session-1280 \nVenue-DHK1(Banani Mentors) \ndate - 2025.12.12");

    }

    @javafx.fxml.FXML
    public void WithdrawButton(ActionEvent actionEvent) {
        ActiveAppLabel.setText("ActiveStatus:-Null");
        AlertLabel.setText("Withdraw Successful");
    }

    @javafx.fxml.FXML
    public void BackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/DashboardStudentApplicant.fxml", actionEvent);
    }
}