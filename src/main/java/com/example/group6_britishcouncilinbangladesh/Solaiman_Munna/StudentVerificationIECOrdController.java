package com.example.group6_britishcouncilinbangladesh.Solaiman_Munna;

import com.example.group6_britishcouncilinbangladesh.Reana.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.List;

public class StudentVerificationIECOrdController
{
    @javafx.fxml.FXML
    private Label NameLabel;
    @javafx.fxml.FXML
    private Label PassportLabel;
    @javafx.fxml.FXML
    private TableColumn<StudentV,String> StatusColVT;
    @javafx.fxml.FXML
    private TableColumn<StudentV,String> NameColVT;
    @javafx.fxml.FXML
    private TableView <StudentV>VerifyStudentTableView;
    @javafx.fxml.FXML
    private TableColumn<StudentV,String> PassportColVt;
    @javafx.fxml.FXML
    private ComboBox<String> StatusCombobox;
    @javafx.fxml.FXML
    private Label AlertLabelVS;
    @javafx.fxml.FXML
    private Button EditButton;
    @javafx.fxml.FXML
    private Button UpdateButton;

    @javafx.fxml.FXML
    public void initialize() {

        NameColVT.setCellValueFactory(new PropertyValueFactory<>("name"));
        PassportColVt.setCellValueFactory(new PropertyValueFactory<>("passportNumber"));
        StatusColVT.setCellValueFactory(new PropertyValueFactory<>("status"));

        List<StudentV> list = StudentVData.getStudents();
        VerifyStudentTableView.getItems().setAll(list);

        StatusCombobox.getItems().setAll("Verified", "Unconfirmed");
        StatusCombobox.setDisable(true);
        UpdateButton.setDisable(true);
        EditButton.setDisable(true);
        setAlert("", true);


        VerifyStudentTableView.getSelectionModel()
                .selectedItemProperty()
                .addListener((obs, oldSel, newSel) -> {
                    EditButton.setDisable(newSel == null);
                    if (newSel != null) {
                        NameLabel.setText("");
                        PassportLabel.setText("");
                        StatusCombobox.setDisable(true);
                        UpdateButton.setDisable(true);
                        setAlert("", true);
                    }
                });
    }


    @FXML
    public void EditButtonVT(ActionEvent actionEvent) {
        onEdit();
    }

    @FXML
    public void UpdateButtonVT(ActionEvent actionEvent) {
        StudentV sel = VerifyStudentTableView.getSelectionModel().getSelectedItem();
        if (sel == null) {
            setAlert("Please select a student first.", false);
            return;
        }

        String newStatus = StatusCombobox.getValue();
        if (newStatus == null || newStatus.isBlank()) {
            setAlert("Please choose a status.", false);
            return;
        }


        StudentVData.updateStatus(sel.getPassportNumber(), newStatus);
        sel.setStatus(newStatus);


        VerifyStudentTableView.refresh();

        setAlert("Status updated successfully.", true);
    }

    @FXML
    public void BackButtonVT(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/DashboardIELTScord.fxml", actionEvent);
    }



    private void onEdit() {
        StudentV sel = VerifyStudentTableView.getSelectionModel().getSelectedItem();
        if (sel == null) {
            setAlert("Please select a student first.", false);
            return;
        }

        NameLabel.setText(sel.getName());
        PassportLabel.setText(sel.getPassportNumber());

        StatusCombobox.setValue(sel.getStatus());
        StatusCombobox.setDisable(false);
        UpdateButton.setDisable(false);

        setAlert("Edit enabled. \nChoose a status and press Update.", true);
    }

    private void setAlert(String msg, boolean success) {
        AlertLabelVS.setText(msg);
    }
}