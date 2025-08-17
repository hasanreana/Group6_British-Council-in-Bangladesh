package com.example.group6_britishcouncilinbangladesh.Sadat;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HardwareIssueResolverController {

    @FXML
    private TextField ticketIdField;

    @FXML
    private TextArea diagnosticStepsArea;

    @FXML
    private ComboBox<String> priorityComboBox;

    @FXML
    private Button submitButton;

    @FXML
    private Label messageLabel;

    @FXML
    public void initialize() {

        priorityComboBox.getItems().addAll("Low", "Medium", "High");
    }
    @FXML
    public void handleSubmitTicket() {
        String ticketId = ticketIdField.getText();
        String diagnosticSteps = diagnosticStepsArea.getText();
        String priority = priorityComboBox.getValue();


        if (ticketId.isEmpty() || diagnosticSteps.isEmpty() || priority == null) {
            messageLabel.setText("❌ Please fill all fields and select priority.");
            return;
        }

        messageLabel.setText("✅ Ticket " + ticketId + " resolved with " + priority + " priority.");
    }
}
