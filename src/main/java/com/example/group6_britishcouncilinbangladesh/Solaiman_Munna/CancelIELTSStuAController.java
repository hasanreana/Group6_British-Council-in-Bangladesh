package com.example.group6_britishcouncilinbangladesh.Solaiman_Munna;

import com.example.group6_britishcouncilinbangladesh.Reana.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CancelIELTSStuAController
{
    @javafx.fxml.FXML
    private TextField PassportNoTextFeild;
    @javafx.fxml.FXML
    private TextArea ReasonTextArea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ConfirmCancelButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/DashboardStudentApplicant.fxml", actionEvent);
    }
}