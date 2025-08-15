package com.example.group6_britishcouncilinbangladesh.Solaiman_Munna;

import com.example.group6_britishcouncilinbangladesh.Reana.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class RecordIncidentIECOrdController
{
    @javafx.fxml.FXML
    private TextField CandidateNameTextFeild;
    @javafx.fxml.FXML
    private DatePicker ExamDatePicker;
    @javafx.fxml.FXML
    private TextField InvigilatorNameTextFeild;
    @javafx.fxml.FXML
    private Label AlertLabelIncident;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ReportButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/DashboardIELTScord.fxml", actionEvent);
    }
}