package com.example.group6_britishcouncilinbangladesh.Solaiman_Munna;

import com.example.group6_britishcouncilinbangladesh.Reana.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class RegisterStudentsIECOrdController
{
    @javafx.fxml.FXML
    private TextField StudentNameTextFeild;
    @javafx.fxml.FXML
    private ComboBox SessionCombobox;
    @javafx.fxml.FXML
    private TextField PssportNumberTextFeild;
    @javafx.fxml.FXML
    private Label AlertLabelR;

    @javafx.fxml.FXML
    public void initialize() {
        SessionCombobox.getItems().addAll("9.00 AM","2.30 PM","6.30 PM");
    }

    @javafx.fxml.FXML
    public void RegisterButton(ActionEvent actionEvent) {
        String name = StudentNameTextFeild.getText();
        String passport = PssportNumberTextFeild.getText();
        String session = (String) SessionCombobox.getValue();
        String venue = "DHK-01(Banani Mentors)";

        if (name.isEmpty() || passport.isEmpty() || session.isEmpty()) {
            AlertLabelR.setText("Please fill all the fields");
            return;
        }
        StudentDetails student = new StudentDetails(name, passport, session, venue);
        StudentData.addStudent(student);

        AlertLabelR.setText("Student registered successfully");
        StudentNameTextFeild.clear();
        PssportNumberTextFeild.clear();
        SessionCombobox.getSelectionModel().clearSelection();
    }

    @javafx.fxml.FXML
    public void BackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/DashboardIELTScord.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void ViewRegisteredStudentsButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/RegisteredStudentsRS.fxml", actionEvent);
    }
}