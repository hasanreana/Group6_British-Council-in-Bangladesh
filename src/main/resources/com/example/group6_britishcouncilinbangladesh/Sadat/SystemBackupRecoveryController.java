package com.example.group6_britishcouncilinbangladesh.Sadat;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class SystemBackupRecoveryController {

    @FXML
    private ComboBox<String> backupScopeComboBox;

    @FXML
    private Button initiateBackupButton;

    @FXML
    private ProgressBar backupProgressBar;

    @FXML
    private Button recoverBackupButton;

    @FXML
    private Label messageLabel;

    @FXML
    public void handleInitiateBackup() {
        String backupScope = backupScopeComboBox.getValue();

        if (backupScope == null) {
            messageLabel.setText("❌ Please select a backup scope.");
            return;
        }

        messageLabel.setText("🕐 Backup in progress...");


        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0), e -> backupProgressBar.setProgress(0)),
                new KeyFrame(Duration.seconds(5), e -> backupProgressBar.setProgress(0.5)),
                new KeyFrame(Duration.seconds(10), e -> backupProgressBar.setProgress(1))
        );
        timeline.setCycleCount(1);
        timeline.play();

        timeline.setOnFinished(event -> messageLabel.setText("✅ Backup completed successfully!"));
    }

    @FXML
    public void handleRecoverBackup() {
        messageLabel.setText("🕐 Recovering backup...");


        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0), e -> backupProgressBar.setProgress(0)),
                new KeyFrame(Duration.seconds(5), e -> backupProgressBar.setProgress(0.5)),
                new KeyFrame(Duration.seconds(10), e -> backupProgressBar.setProgress(1))
        );
        timeline.setCycleCount(1);
        timeline.play();

        timeline.setOnFinished(event -> messageLabel.setText("✅ Backup recovered successfully!"));
    }
}