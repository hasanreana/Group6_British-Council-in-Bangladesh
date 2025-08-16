package com.example.group6_britishcouncilinbangladesh.Solaiman_Munna;

import com.example.group6_britishcouncilinbangladesh.Reana.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CertificateReissueStuAController
{
    @javafx.fxml.FXML
    private TextField NameTextFeild;
    @javafx.fxml.FXML
    private Label AlertLabelCR;
    @javafx.fxml.FXML
    private TextArea IsuueTextArea;
    @javafx.fxml.FXML
    private TextField PassportTextFeild;

    @javafx.fxml.FXML
    public void initialize() {
        if(AlertLabelCR != null){
            AlertLabelCR.setText("");
        }
    }

    @javafx.fxml.FXML
    public void RequestButton(ActionEvent actionEvent) {
        String name = (NameTextFeild != null) ? NameTextFeild.getText() : "";
        String passport = (PassportTextFeild != null) ? PassportTextFeild.getText() : "";
        String issue = (IsuueTextArea != null) ? IsuueTextArea.getText() : "";

        if (name == null || name.trim().isEmpty()) {
            AlertLabelCR.setText("Please enter name");
            return;
        }
        if (passport == null || passport.trim().isEmpty()) {
            AlertLabelCR.setText("Please enter passport number");
            return;
        }
        if (issue == null || issue.trim().isEmpty()) {
            AlertLabelCR.setText("Please enter issue");
            return;
        }

        AlertLabelCR.setText("We have received your request\nWe will contact you soon!");
    }

    @javafx.fxml.FXML
    public void BackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/DashboardStudentApplicant.fxml", actionEvent);
    }
}