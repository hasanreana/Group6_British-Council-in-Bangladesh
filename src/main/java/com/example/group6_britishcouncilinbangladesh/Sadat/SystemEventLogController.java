package com.example.group6_britishcouncilinbangladesh.Sadat;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.List;

public class SystemEventLogController {

    @FXML
    private ComboBox<String> eventCategoryComboBox;

    @FXML
    private Button logEventButton;

    @FXML
    private ListView<String> eventLogListView;

    @FXML
    private Label messageLabel;


    private List<String> eventLog = new ArrayList<>();

    @FXML
    public void handleLogEvent() {
        String selectedCategory = eventCategoryComboBox.getValue();


        if (selectedCategory == null) {
            messageLabel.setText("❌ Please select an event category.");
            return;
        }


        String logEntry = "Event Category: " + selectedCategory + " | Event Logged!";
        eventLog.add(logEntry);

        eventLogListView.getItems().clear();
        eventLogListView.getItems().addAll(eventLog);

        messageLabel.setText("✅ Event logged successfully!");
    }
}