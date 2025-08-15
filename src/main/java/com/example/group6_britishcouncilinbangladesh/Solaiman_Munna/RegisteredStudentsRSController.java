package com.example.group6_britishcouncilinbangladesh.Solaiman_Munna;

import com.example.group6_britishcouncilinbangladesh.Reana.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class RegisteredStudentsRSController
{
    @javafx.fxml.FXML
    private TableColumn VenueColTableView;
    @javafx.fxml.FXML
    private TableView RegisteredStudentTableView;
    @javafx.fxml.FXML
    private TableColumn NameColTableView;
    @javafx.fxml.FXML
    private TableColumn PassportNumberColTableview;
    @javafx.fxml.FXML
    private TableColumn SessionColTableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/RegisterStudentsIECOrd.fxml", actionEvent);
    }
}