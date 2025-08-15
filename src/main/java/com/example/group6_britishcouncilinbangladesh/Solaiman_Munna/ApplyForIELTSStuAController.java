package com.example.group6_britishcouncilinbangladesh.Solaiman_Munna;

import com.example.group6_britishcouncilinbangladesh.Reana.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class ApplyForIELTSStuAController
{
    @javafx.fxml.FXML
    private TableColumn TimeColSTV;
    @javafx.fxml.FXML
    private TableColumn VenueColSTV;
    @javafx.fxml.FXML
    private TableView SessionTableView;
    @javafx.fxml.FXML
    private TableColumn CapacityColSTV;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void RegisterButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/DashboardStudentApplicant.fxml", actionEvent);
    }
}