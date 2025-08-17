package com.example.group6_britishcouncilinbangladesh.Sadat;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LogInController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label loginMsg;

    @FXML
    private void initialize() {
        if (loginMsg != null) {
            loginMsg.setText(""); // Clear login message on load
        }
    }

    @FXML
    private void handleLogin() {
        String u = usernameField != null ? usernameField.getText() : null;
        String p = passwordField != null ? passwordField.getText() : null;

        // Diagnostic message to show input values
        String diag = String.format("U=[%s] P=[%s]", u, p);
        System.out.println("DEBUG " + diag);

        // Show debug info in UI
        loginMsg.setStyle("-fx-text-fill: #2c3e50;"); // dark grey
        loginMsg.setText(diag);

        // Simple test: if both fields are filled, show "success"
        if (u != null && !u.trim().isEmpty() && p != null && !p.trim().isEmpty()) {
            loginMsg.setStyle("-fx-text-fill: #2e7d32;"); // green
            loginMsg.setText("✅ WIRING OK — inputs received. (Now we can add real check.)");
        }
    }
}
