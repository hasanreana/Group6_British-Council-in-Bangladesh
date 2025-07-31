package com.example.group6_britishcouncilinbangladesh.Reana;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class AssignTaskCMController
{
    @javafx.fxml.FXML
    private DatePicker duedateDatePicker;
    @javafx.fxml.FXML
    private TextArea taskTextArea;
    @javafx.fxml.FXML
    private ComboBox userComboBox;
    @javafx.fxml.FXML
    private TextArea taskDetailssTextArea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void goBackToDashboardButtonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/ManagingDirectorDeshboard.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void assignTaskButtonOnClick(ActionEvent actionEvent) {
    }
}