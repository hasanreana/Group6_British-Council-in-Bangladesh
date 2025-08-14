package com.example.group6_britishcouncilinbangladesh.Reana;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class CreatingBillsFMController {
    @javafx.fxml.FXML
    private TableColumn<Bill, LocalDate> dateTC;
    @javafx.fxml.FXML
    private TableView<Bill> TableView;
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private TableColumn<Bill, Integer> salaryTC;
    @javafx.fxml.FXML
    private TableColumn<Bill, Integer> paymentTC;
    @javafx.fxml.FXML
    private TextField vanueIDTF;
    @javafx.fxml.FXML
    private TableColumn<Bill, String> nameTC;
    @javafx.fxml.FXML
    private TextField salaryTF;
    @javafx.fxml.FXML
    private TableColumn<Bill, Integer> valueIDTC;
    @javafx.fxml.FXML
    private TextField paymentTF;
    @javafx.fxml.FXML
    private DatePicker dateTF;
    @javafx.fxml.FXML
    private TableColumn<Bill, Integer> idTC;
    @javafx.fxml.FXML
    private TextField idTF;
    @javafx.fxml.FXML
    private Label outputLable;

    @javafx.fxml.FXML
    public void initialize() {
        idTC.setCellValueFactory(new PropertyValueFactory<>("trainnerId"));
        nameTC.setCellValueFactory(new PropertyValueFactory<>("name"));
        salaryTC.setCellValueFactory(new PropertyValueFactory<>("salary"));
        valueIDTC.setCellValueFactory(new PropertyValueFactory<>("vanueId"));
        paymentTC.setCellValueFactory(new PropertyValueFactory<>("payment"));
        dateTC.setCellValueFactory(new PropertyValueFactory<>("date"));
    }

    ArrayList<Bill> bills = new ArrayList<>();


    @javafx.fxml.FXML
    public void backBUTTON(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/DashboardFinanceManager.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void addButton(ActionEvent actionEvent) {
        if (idTF.getText().trim().isEmpty()) {
            outputLable.setText("Please enter trainner's Id!");
            return;
        }

        if (nameTF.getText().trim().isEmpty()) {
            outputLable.setText("Please enter a trainner name");
            return;
        }
        if (salaryTF.getText().trim().isEmpty()) {
            outputLable.setText("Please enter salary!");
            return;
        }

        if (vanueIDTF.getText().trim().isEmpty()) {
            outputLable.setText("Please enter a vanue id!");
            return;
        }
        if (paymentTF.getText().trim().isEmpty()) {
            outputLable.setText("Please enter a payment");
            return;
        }

        if (dateTF.getValue() == null) {
            outputLable.setText("Please select a date!");
            return;
        }
        int trainnerId = Integer.parseInt(idTF.getText());
        int salary = Integer.parseInt(salaryTF.getText());
        int vanueId = Integer.parseInt(vanueIDTF.getText());
        int payment = Integer.parseInt(paymentTF.getText());

        Bill newBill = new Bill(
                trainnerId,
                nameTF.getText(),
                salary,
                vanueId,
                payment,
                dateTF.getValue()


        );

        bills.add(newBill);

        System.out.println(newBill.toString());
        outputLable.setText("New Bill added!");

        TableView.getItems().clear();
        TableView.getItems().addAll(bills);

    }




}