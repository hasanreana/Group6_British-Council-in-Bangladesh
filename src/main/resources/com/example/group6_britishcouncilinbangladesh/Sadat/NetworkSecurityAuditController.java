package com.example.group6_britishcouncilinbangladesh.Sadat;

import javafx.fxml.FXML;
import javafx.scene.control.*;


public class NetworkSecurityAuditController {

    @FXML
    private Button runScanButton;

    @FXML
    private TextArea scanResultsArea;

    @FXML
    private Button flagRisksButton;

    @FXML
    private Button applyPatchesButton;

    @FXML
    private Button logResultsButton;

    @FXML
    private Label messageLabel;

    @FXML
    public void handleRunScan() {

        String scanResults = "No vulnerabilities found.\nCritical risk: SQL Injection.\nSecurity level: High.";
        scanResultsArea.setText(scanResults);
        messageLabel.setText("✅ Scan completed.");
    }

    @FXML
    public void handleFlagRisks() {
        if (scanResultsArea.getText().isEmpty()) {
            messageLabel.setText("❌ Please run a scan first.");
        } else {
            messageLabel.setText("✅ Critical risks flagged.");
        }
    }

    @FXML
    public void handleApplyPatches() {
        if (scanResultsArea.getText().isEmpty()) {
            messageLabel.setText("❌ Please run a scan first.");
        } else {
            messageLabel.setText("✅ Patches applied.");
        }
    }


    @FXML
    public void handleLogResults() {
        if (scanResultsArea.getText().isEmpty()) {
            messageLabel.setText("❌ No scan results to log.");
        } else {
            messageLabel.setText("✅ Results logged successfully.");
        }

    }

}

