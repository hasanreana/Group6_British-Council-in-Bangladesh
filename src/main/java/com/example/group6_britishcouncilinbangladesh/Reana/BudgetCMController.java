package com.example.group6_britishcouncilinbangladesh.Reana;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class BudgetCMController
{
    @javafx.fxml.FXML
    private TableColumn amountTC;
    @javafx.fxml.FXML
    private Label outputLable;
    @javafx.fxml.FXML
    private TextField amountTextField2;
    @javafx.fxml.FXML
    private TableColumn<BudgetInfo,String> departmentTC;
    @javafx.fxml.FXML
    private Label proposalInfoLabel;
    @javafx.fxml.FXML
    private TextField departmentTextField1;
    @javafx.fxml.FXML
    private TableColumn<BudgetInfo, LocalDate> dateTC;
    @javafx.fxml.FXML
    private DatePicker datepickerTextField;
    @javafx.fxml.FXML
    private TextField proposalIdTextField;
    @javafx.fxml.FXML
    private TextField statusTextField3;
    @javafx.fxml.FXML
    private TableColumn<BudgetInfo,String> statusTC;
    @javafx.fxml.FXML
    private TableView <BudgetInfo> budgetTableView;
    @javafx.fxml.FXML
    private TableColumn <BudgetInfo,Integer>proposalIdTC;

    @javafx.fxml.FXML
    public void initialize() {
        amountTC.setCellValueFactory(new PropertyValueFactory<>("amount"));
        proposalIdTC.setCellValueFactory(new PropertyValueFactory<>("proposalId"));
        departmentTC.setCellValueFactory(new PropertyValueFactory<>("department"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));
        dateTC.setCellValueFactory(new PropertyValueFactory<>("date"));
    }
    ArrayList<BudgetInfo> budgetInfos = new ArrayList<>();

    @javafx.fxml.FXML
    public void addButtonOnAction(ActionEvent actionEvent) {
        if (proposalIdTextField.getText().trim().isEmpty()){
            outputLable.setText("Please enter proposal Id!");
            return;
        }

        if (amountTextField2.getText().trim().isEmpty()){
            outputLable.setText("Please enter amount!");
            return;
        }

        if (statusTextField3.getText().trim().isEmpty()){
            outputLable.setText("Please enter a status!");
            return;
        }
        if (datepickerTextField.getValue() == null) {
            outputLable.setText("Please select a date!");
            return;
        }
        int proposalId = Integer.parseInt(proposalIdTextField.getText());
        int amount = Integer.parseInt(amountTextField2.getText());

        BudgetInfo newBudgetInfo = new BudgetInfo(
                proposalId,
                departmentTextField1.getText(),
                amount,
                statusTextField3.getText(),
                datepickerTextField.getValue()







        );

        budgetInfos.add(newBudgetInfo);

        System.out.println(newBudgetInfo.toString());
        outputLable.setText("New Budget added!");

        budgetTableView.getItems().clear();
        budgetTableView.getItems().addAll(budgetInfos);

    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/ManagingDirectorDeshboard.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void declineButtonOnAction(ActionEvent actionEvent) {
        Alert a= new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("Request Decline!");
        a.showAndWait();
    }

    @javafx.fxml.FXML
    public void acceptButtonOnAction(ActionEvent actionEvent) {
        Alert a= new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("Request Accepted!");
        a.showAndWait();
    }
}