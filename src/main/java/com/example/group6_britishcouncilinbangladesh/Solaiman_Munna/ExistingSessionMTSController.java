package com.example.group6_britishcouncilinbangladesh.Solaiman_Munna;

import com.example.group6_britishcouncilinbangladesh.Reana.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class ExistingSessionMTSController
{
    @javafx.fxml.FXML
    private TableColumn DateColTES;
    @javafx.fxml.FXML
    private TableColumn LocationColTES;
    @javafx.fxml.FXML
    private TableColumn CapacityColTES;
    @javafx.fxml.FXML
    private TableView ExistingSessionTableView;
    @javafx.fxml.FXML
    private TableColumn TimeColTES;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackButtonES(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/ManageTestSessionIECOrd.fxml", actionEvent);
    }
}