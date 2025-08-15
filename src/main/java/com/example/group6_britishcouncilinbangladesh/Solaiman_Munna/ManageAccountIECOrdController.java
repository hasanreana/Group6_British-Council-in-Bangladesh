package com.example.group6_britishcouncilinbangladesh.Solaiman_Munna;

import com.example.group6_britishcouncilinbangladesh.Reana.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ManageAccountIECOrdController
{
    @javafx.fxml.FXML
    private Label ValidationLabel;
    @javafx.fxml.FXML
    private PasswordField CurrentPasswordFeild;
    @javafx.fxml.FXML
    private TextField NewNameTextFeild;
    @javafx.fxml.FXML
    private PasswordField NewPasswordFeild;
    @javafx.fxml.FXML
    private TextField CurNameTextFeild;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ChangeButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/DashboardIELTScord.fxml", actionEvent);
    }
}