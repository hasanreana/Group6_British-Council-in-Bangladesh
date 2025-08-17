package com.example.group6_britishcouncilinbangladesh.Sadat;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class SystemHealthReportController {

    @FXML
    private ComboBox<String> reportTypeComboBox;

    @FXML
    private Button generateReportButton;

    @FXML
    private Label messageLabel;


    @FXML
    public void handleGenerateReport() {
        String selectedReportType = reportTypeComboBox.getValue();


        if (selectedReportType == null) {
            messageLabel.setText("❌ Please select a report type.");
            return;
        }


        String reportContent = "Generating " + selectedReportType + " report...\n";
        switch (selectedReportType) {
            case "CPU Usage":
                reportContent += "CPU Usage: 70%";
                break;
            case "Memory Usage":
                reportContent += "Memory Usage: 45%";
                break;
            case "Disk Space":
                reportContent += "Disk Space: 80GB free";
                break;
        }

        messageLabel.setText("✅ " + reportContent);
    }
}
