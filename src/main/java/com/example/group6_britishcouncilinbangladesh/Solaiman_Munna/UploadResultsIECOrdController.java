package com.example.group6_britishcouncilinbangladesh.Solaiman_Munna;

import com.example.group6_britishcouncilinbangladesh.Reana.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class UploadResultsIECOrdController {

    @FXML private TableView<TestResult> ResultTableView;
    @FXML private TableColumn<TestResult, String> PassportNumResColT;
    @FXML private TableColumn<TestResult, String> ScoreResColT;

    @FXML private TextField PassportNumberTextFeild;
    @FXML private ComboBox<String> ScoreCombobox;
    @FXML private Label AlertLabelRU;

    @FXML
    public void initialize() {

        ScoreCombobox.getItems().setAll(
                "Band 3.5","Band 4.0","Band 4.5",
                "Band 5.0","Band 5.5","Band 6.0","Band 6.5",
                "Band 7.0","Band 7.5","Band 8.0","Band 8.5","Band 9.0"
        );


        Results.loadFromFile();


        PassportNumResColT.setCellValueFactory(new PropertyValueFactory<>("passportNo"));
        ScoreResColT.setCellValueFactory(new PropertyValueFactory<>("result"));
        ResultTableView.setItems(FXCollections.observableArrayList(Results.loadAll()));

        AlertLabelRU.setText("");
    }

    @FXML
    public void UpdateButton(ActionEvent e) {
        String passportNo = PassportNumberTextFeild.getText();
        String score = ScoreCombobox.getValue();

        if (passportNo == null || passportNo.isBlank()) {
            AlertLabelRU.setText("Enter passport number.");
            return;
        }
        if (score == null || score.isBlank()) {
            AlertLabelRU.setText("Select score.");
            return;
        }

        Results.addOrUpdate(passportNo.trim(), score.trim());
        AlertLabelRU.setText("Saved: " + passportNo.trim() + " → " + score.trim());


        ResultTableView.setItems(FXCollections.observableArrayList(Results.loadAll()));

    }

    @FXML
    public void BackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo(
                "/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/DashboardIELTScord.fxml", actionEvent);
    }
}
