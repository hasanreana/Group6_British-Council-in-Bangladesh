package com.example.group6_britishcouncilinbangladesh.Reana;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class DecisionMakingCMController
{
    @javafx.fxml.FXML
    private TextArea messageTextArea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void messageButtonOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void baclButtonOnClicked(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/ManagingDirectorDeshboard.fxml", actionEvent);
    }
}