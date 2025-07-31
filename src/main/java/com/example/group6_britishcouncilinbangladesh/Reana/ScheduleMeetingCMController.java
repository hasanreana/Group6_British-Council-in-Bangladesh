package com.example.group6_britishcouncilinbangladesh.Reana;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;

public class ScheduleMeetingCMController
{
    @javafx.fxml.FXML
    private TableColumn meetingDateTableColumn;
    @javafx.fxml.FXML
    private DatePicker meetingdateDatePicker;
    @javafx.fxml.FXML
    private ComboBox userComboBox;
    @javafx.fxml.FXML
    private TableView meetingDetailsTableView;
    @javafx.fxml.FXML
    private TableColumn meetingWithTableColumn;
    @javafx.fxml.FXML
    private TableColumn meetingTimeTableColumn;
    @javafx.fxml.FXML
    private TextField meetingTimeTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void goBackToDashboardOnBUttonClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/ManagingDirectorDeshboard.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void addMeetingToTableOnButtonClick(ActionEvent actionEvent) {
    }
}