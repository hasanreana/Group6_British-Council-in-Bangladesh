package com.example.group6_britishcouncilinbangladesh.Solaiman_Munna;

import com.example.group6_britishcouncilinbangladesh.Reana.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class RescheduleIELTSTestStuAController
{
    @javafx.fxml.FXML
    private TableColumn VenueColTV;
    @javafx.fxml.FXML
    private TableColumn DateColTV;
    @javafx.fxml.FXML
    private TextField PassportNoTextFeild;
    @javafx.fxml.FXML
    private TableView scheduleTableView;
    @javafx.fxml.FXML
    private Label LabelShowingSelected;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/DashboardStudentApplicant.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void ConfirmButton(ActionEvent actionEvent) {
    }
}