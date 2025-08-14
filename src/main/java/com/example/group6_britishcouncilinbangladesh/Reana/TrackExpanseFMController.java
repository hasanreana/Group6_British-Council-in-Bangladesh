package com.example.group6_britishcouncilinbangladesh.Reana;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class TrackExpanseFMController
{
    @javafx.fxml.FXML
    private TextField amountTextField;
    @javafx.fxml.FXML
    private TableColumn<Track,String> amountColumn;
    @javafx.fxml.FXML
    private ComboBox<String>  CategoryTypeComboBox;
    @javafx.fxml.FXML
    private TableView<Track>  expensesTableView;
    @javafx.fxml.FXML
    private TableColumn<Track,DatePicker>  dateColumn;
    @javafx.fxml.FXML
    private TableColumn<Track,String>  CategoryColumn;
    @javafx.fxml.FXML
    private DatePicker datepicker;

    @javafx.fxml.FXML
    private Label showLable;
    private ObservableList<Track> tracks = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        CategoryTypeComboBox.getItems().addAll("Yearly", "Monthly");
        dateColumn.setCellValueFactory(new PropertyValueFactory<Track,DatePicker>("date"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<Track,String>("expenseAmount"));
        CategoryColumn.setCellValueFactory(new PropertyValueFactory<Track,String>("category"));

        expensesTableView.setItems(tracks);


    }


    @javafx.fxml.FXML
    public void ViewExpensesOnActionButton(ActionEvent actionEvent) {

        String category = CategoryTypeComboBox.getValue();
        LocalDate date = datepicker.getValue();
        String expenseAmount = amountTextField.getText();

        if (category == null || date == null || expenseAmount.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setHeaderText(null);
            alert.setContentText("Please fill in all the required fields.");
            alert.showAndWait();
            return;
        }


        if (date.isBefore(LocalDate.now())) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setHeaderText(null);
            alert.setContentText("Please select a future date for the meeting .");
            alert.showAndWait();
            return;
        }


        Track trackInfo = new Track(date, expenseAmount, category);

        tracks.add(trackInfo); // No need to add to table separately

        CategoryTypeComboBox.setValue(null);
        datepicker.setValue(null);
        amountTextField.clear();

    }

        @javafx.fxml.FXML
        public void ReturnHomeOnActionButton (ActionEvent actionEvent) throws IOException {
            SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/DashboardFinanceManager.fxml", actionEvent);
        }
    }

