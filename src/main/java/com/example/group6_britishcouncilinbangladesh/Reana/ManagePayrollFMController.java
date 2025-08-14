package com.example.group6_britishcouncilinbangladesh.Reana;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ManagePayrollFMController
{
    @javafx.fxml.FXML
    private TextField FinalSalaryTextField;
    @javafx.fxml.FXML
    private TextField BonusesTextField;
    @javafx.fxml.FXML
    private TextField deductionTextField;
    @javafx.fxml.FXML
    private ComboBox<String> selectemployeeComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        selectemployeeComboBox.getItems().addAll("Basic Salary", "Overtime Data");
    }

    @javafx.fxml.FXML
    public void CalculateSalaryOnActionButton(ActionEvent actionEvent) {
        try {
            double bonus = Double.parseDouble(BonusesTextField.getText());
            double deduction = Double.parseDouble(deductionTextField.getText());

            double baseSalary;

            // Simulated selection logic
            String selected = selectemployeeComboBox.getValue();
            if ("Basic Salary".equals(selected)) {
                baseSalary = 30000;  // Example base salary
            } else if ("Overtime Data".equals(selected)) {
                baseSalary = 30000 + 5000;  // Example with overtime
            } else {
                showAlert("Selection Error", "Please select a valid employee option.");
                return;
            }

            double finalSalary = baseSalary + bonus - deduction;
            FinalSalaryTextField.setText(String.valueOf(finalSalary));

        } catch (NumberFormatException e) {
            showAlert("Input Error", "Please enter valid numbers for bonus and deduction.");
        }
    }

    @javafx.fxml.FXML
    public void ProcessPaymentOnActionButton(ActionEvent actionEvent) {
        String finalSalary = FinalSalaryTextField.getText();
        if (finalSalary.isEmpty()) {
            showAlert("Error", "Please calculate salary before processing payment.");
        } else {
            // Simulate payment processing
            showAlert("Success", "Salary of BDT " + finalSalary + " processed successfully.");
        }
    }

    @javafx.fxml.FXML
    public void ReturnHomeOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/DashboardFinanceManager.fxml", actionEvent);
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.show();
    }
}