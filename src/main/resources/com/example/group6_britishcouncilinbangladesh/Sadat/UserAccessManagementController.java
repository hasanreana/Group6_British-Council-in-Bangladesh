package com.example.group6_britishcouncilinbangladesh.Sadat;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class UserAccessManagementController {

    @FXML
    private TextField usernameField;

    @FXML
    private ComboBox<String> roleComboBox;

    @FXML
    private Button activateDeactivateButton;

    @FXML
    private Label messageLabel;


    @FXML
    public void handleActivateDeactivateUser() {
        String username = usernameField.getText();
        String selectedRole = roleComboBox.getValue();


        if (username.isEmpty() || selectedRole == null) {
            messageLabel.setText("❌ Please fill all fields.");
            return;
        }


        String action = activateDeactivateButton.getText().contains("Activate") ? "Activated" : "Deactivated";
        messageLabel.setText("✅ User '" + username + "' has been " + action + " as " + selectedRole + ".");


        activateDeactivateButton.setText(action.equals("Activated") ? "Deactivate User" : "Activate User");
    }
}