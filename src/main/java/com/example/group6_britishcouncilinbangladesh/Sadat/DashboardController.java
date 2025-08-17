package com.example.group6_britishcouncilinbangladesh.Sadat;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class DashboardController {

    @FXML
    private Label welcomeLabel;

    @FXML
    private StackPane contentArea;


    public void initData(String username) {
        if (welcomeLabel != null) {
            welcomeLabel.setText("Welcome, " + username + "!");
        }
    }

    @FXML
    private void openBackup() {
        loadUI("SystemBackupRecovery.fxml");
    }

    @FXML
    private void openSecurityAudit() {
        loadUI("SecurityAudit.fxml");
    }

    @FXML
    private void openEventLog() {
        loadUI("EventLog.fxml");
    }

    private void loadUI(String fxmlFile) {
        try {
            Node node = FXMLLoader.load(getClass().getResource(
                    "/com/example/group6_britishcouncilinbangladesh/Sadat/" + fxmlFile));
            contentArea.getChildren().setAll(node);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
