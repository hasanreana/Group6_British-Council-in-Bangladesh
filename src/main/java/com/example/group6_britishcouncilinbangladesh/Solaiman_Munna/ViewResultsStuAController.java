package com.example.group6_britishcouncilinbangladesh.Solaiman_Munna;

import com.example.group6_britishcouncilinbangladesh.Reana.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ViewResultsStuAController {

    @FXML private Label AlertLabelTR;
    @FXML private TextField PassportNoTextFeild;

    @FXML
    public void initialize() {

        Results.loadFromFile();
        AlertLabelTR.setWrapText(true);
        AlertLabelTR.setMaxWidth(420);
        AlertLabelTR.setText("");
    }

    @FXML
    public void ViewResultButton(ActionEvent actionEvent) {
        String passport = PassportNoTextFeild.getText();
        if (passport == null || passport.isBlank()) {
            AlertLabelTR.setText("Please enter your passport number.");
            return;
        }


        Results.loadFromFile();
        String score = Results.getScore(passport.trim());

        AlertLabelTR.setText(score == null
                ? "Result not published yet for: " + passport.trim()
                : "Your IELTS overall score: " + score);
    }

    @FXML
    public void BackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo(
                "/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/DashboardStudentApplicant.fxml",
                actionEvent
        );
    }
}
