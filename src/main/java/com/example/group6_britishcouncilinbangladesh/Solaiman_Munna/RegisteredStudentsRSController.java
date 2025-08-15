package com.example.group6_britishcouncilinbangladesh.Solaiman_Munna;

import com.example.group6_britishcouncilinbangladesh.Reana.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class RegisteredStudentsRSController
{
    @javafx.fxml.FXML
    private TableColumn <StudentDetails, String> VenueColTableView;
    @javafx.fxml.FXML
    private TableView <StudentDetails> RegisteredStudentTableView;
    @javafx.fxml.FXML
    private TableColumn <StudentDetails, String> NameColTableView;
    @javafx.fxml.FXML
    private TableColumn <StudentDetails, String> PassportNumberColTableview;
    @javafx.fxml.FXML
    private TableColumn <StudentDetails, String> SessionColTableView;

    @javafx.fxml.FXML
    public void initialize() {
        NameColTableView.setCellValueFactory(new PropertyValueFactory<>("name"));
        PassportNumberColTableview.setCellValueFactory(new PropertyValueFactory<>("passportNumber"));
        SessionColTableView.setCellValueFactory(new PropertyValueFactory<>("session"));
        VenueColTableView.setCellValueFactory(new PropertyValueFactory<>("venue"));

        RegisteredStudentTableView.setItems(
                FXCollections.observableArrayList(StudentData.getAllStudents())
        );

    }

    @javafx.fxml.FXML
    public void BackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/RegisterStudentsIECOrd.fxml", actionEvent);
    }
}