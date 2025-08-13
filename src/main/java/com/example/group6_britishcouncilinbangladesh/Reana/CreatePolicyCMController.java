package com.example.group6_britishcouncilinbangladesh.Reana;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class CreatePolicyCMController
{
    @javafx.fxml.FXML
    private TextField policyTitleTextField;
    @javafx.fxml.FXML
    private DatePicker policyDatePicker;
    @javafx.fxml.FXML
    private TextField policyDetailsTextField;
    @javafx.fxml.FXML
    private Label policyInfoLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }
    private ArrayList<Policy> policy;

    @javafx.fxml.FXML
    public void goBackToDashboardButtonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/DashboardCM.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void savePolicyButtonOnClick(ActionEvent actionEvent) {
        String policytitle = policyTitleTextField.getText();
        LocalDate policyEffectiveDate = policyDatePicker.getValue();
        String policyDetails = policyDetailsTextField.getText();

        // Validate input (optional but recommended)
        if (policytitle == null || policyEffectiveDate == null || policyDetails.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Missing Fields");
            alert.setHeaderText(null);
            alert.setContentText("Please fill in all the fields before assigning the policy.");
            alert.showAndWait();
            return;
        }

        // Create a task object
        Task task = new Task(policytitle, policyEffectiveDate, policyDetails); // Make sure Task class has this constructor

        // Format task info
        String formattedTask = "policytitle: " + policytitle +
                "\npolicyEffectiveDate: " + policyEffectiveDate +
                "\npolicyDetails " + policyDetails +
                "\n-----------------------------\n";


        policyInfoLabel.setText(policyInfoLabel.getText() + formattedTask);




        policyDatePicker.setValue(null);
        // taskDetailssTextArea.clear();
    }

    @javafx.fxml.FXML
    public void downloadPolicyButtonOnClick(ActionEvent actionEvent) {
    }
}