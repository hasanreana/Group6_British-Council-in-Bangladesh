package com.example.group6_britishcouncilinbangladesh.Reana;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;

public class RecordsBudgetFMController
{
    @javafx.fxml.FXML
    private TextField noVenueTF;
    @javafx.fxml.FXML
    private TableColumn NoEmployeeTC;
    @javafx.fxml.FXML
    private TextField SalaryTextField;
    @javafx.fxml.FXML
    private TableColumn DateTC;
    @javafx.fxml.FXML
    private TableColumn SalaryTC;
    @javafx.fxml.FXML
    private TableColumn BillTC;
    @javafx.fxml.FXML
    private TableColumn NoVenueTC;
    @javafx.fxml.FXML
    private TextField NoEmployeeTextField;
    @javafx.fxml.FXML
    private TextField PaymentTF;
    @javafx.fxml.FXML
    private TextField DateTextField;
    @javafx.fxml.FXML
    private TextField billTextField;
    @javafx.fxml.FXML
    private Label budgetLabel;
    @javafx.fxml.FXML
    private TableColumn PaymentTC;
    @javafx.fxml.FXML
    private Label msgLabel;
    @javafx.fxml.FXML
    private TableView TableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void sendMagButtonOnClicked(ActionEvent actionEvent) {
        Alert a= new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("Request Sent Successfully!");
        a.showAndWait();
    }

    @javafx.fxml.FXML
    public void goToActivitiesPageButtonOnClicked(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/DashboardFinanceManager.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void seeInfoButtonOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addNewInfoButtonOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void totalBudgetButtonOnClicked(ActionEvent actionEvent) {
        String xStr = noVenueTF.getText();
        String yStr = NoEmployeeTC.getText();
        String zStr = PaymentTF.getText();
        String wStr = SalaryTextField.getText();
        String rStr = billTextField.getText();
        int xVal = Integer.parseInt(xStr);
        int yVal = Integer.parseInt(yStr);
        int zVal = Integer.parseInt(zStr);
        int wVal = Integer.parseInt(wStr);
        int rVal = Integer.parseInt(rStr);


        int sum = (xVal*zVal)+(yVal*zVal)+rVal;

        String resultStr = Integer.toString(sum);
        budgetLabel.setText("Monthly Budget= " + resultStr);
    }
}