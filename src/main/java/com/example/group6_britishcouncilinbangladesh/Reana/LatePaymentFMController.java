package com.example.group6_britishcouncilinbangladesh.Reana;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.io.FileWriter;
import java.io.IOException;

public class LatePaymentFMController
{
    @javafx.fxml.FXML
    private CheckBox appendCheckBox;
    @javafx.fxml.FXML
    private Label label;
    @javafx.fxml.FXML
    private TextArea textArea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void goBack(ActionEvent actionEvent)throws IOException  {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/DashboardFinanceManager.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void writeToFile(ActionEvent actionEvent)throws IOException
    {
        try (FileWriter writer = new FileWriter(
                "Information.txt",
                appendCheckBox.isSelected()
        )) {
            writer.write(textArea.getText());
            label.setText("File saved successfully!");
        } catch (IOException e) {
            label.setText("Could not save!");
        }

    }

    @javafx.fxml.FXML
    public void fileReadButton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/FileReadFM.fxml", actionEvent);
    }
}