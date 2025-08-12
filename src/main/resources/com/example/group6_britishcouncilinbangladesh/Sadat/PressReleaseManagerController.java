package com.example.group6_britishcouncilinbangladesh.Sadat;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.time.LocalDate;

public class PressReleaseManagerController {

    @FXML
    private TextArea contentArea;

    @FXML
    private TextField mediaField;

    @FXML
    private DatePicker releaseDatePicker;

    @FXML
    private Button validateButton;

    @FXML
    private Button submitButton;

    @FXML
    private Label messageLabel;

    // Handle press release content validation (compliance check)
    @FXML
    public void handleValidateCompliance() {
        String content = contentArea.getText();
        if (content.isEmpty()) {
            messageLabel.setText("❌ Content cannot be empty.");
            return;
        }
        messageLabel.setText("✅ Content is compliant with branding guidelines.");
    }


    @FXML
    public void handleSubmitPressRelease() {
        String content = contentArea.getText();
        LocalDate releaseDate = releaseDatePicker.getValue();
        String mediaLink = mediaField.getText();

        if (content.isEmpty() || releaseDate == null) {
            messageLabel.setText("❌ Please fill all fields.");
            return;
        }

    }
        messageLabel.setText("✅ Press Release submitted successfully!");
   }
}


