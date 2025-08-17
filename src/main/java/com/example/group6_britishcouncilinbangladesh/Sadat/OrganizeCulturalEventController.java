package com.example.group6_britishcouncilinbangladesh.Sadat;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.time.LocalDate;

public class OrganizeCulturalEventController {

    @FXML
    private TextField venueField;

    @FXML
    private DatePicker eventDatePicker;

    @FXML
    private TextField budgetField;

    @FXML
    private Label messageLabel;

    @FXML
    public void handleSubmitButton() {
        String venue = venueField.getText();
        LocalDate eventDate = eventDatePicker.getValue();
        String budgetText = budgetField.getText();

        if (venue.isEmpty() || eventDate == null || budgetText.isEmpty()) {
            messageLabel.setText("❌ Please fill all fields.");
            return;
        }

        try {
            double budget = Double.parseDouble(budgetText);
            if (budget > 50000) {
                messageLabel.setText("❌ Budget exceeds limit of 50,000.");
            } else {
                messageLabel.setText("✅ Event organized successfully!");
            }
        } catch (NumberFormatException e) {
            messageLabel.setText("❌ Budget must be a valid number.");

        }
    }
}