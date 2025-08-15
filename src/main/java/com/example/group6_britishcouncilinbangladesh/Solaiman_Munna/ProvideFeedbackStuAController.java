package com.example.group6_britishcouncilinbangladesh.Solaiman_Munna;

import com.example.group6_britishcouncilinbangladesh.Reana.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class ProvideFeedbackStuAController
{
    @javafx.fxml.FXML
    private ComboBox RatingCombobox;
    @javafx.fxml.FXML
    private TextArea FeedBackTextArea;
    @javafx.fxml.FXML
    private Label AlertLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/DashboardStudentApplicant.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void SubmitButton(ActionEvent actionEvent) {
    }
}