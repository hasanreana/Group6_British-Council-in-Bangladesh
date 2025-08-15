package com.example.group6_britishcouncilinbangladesh;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class LogInController
{
    @javafx.fxml.FXML
    private PasswordField passwordTextField;
    @javafx.fxml.FXML
    private Label errorLabel;
    @javafx.fxml.FXML
    private TextField usernameTextField;

    private final String reana = "Reana";
    private final String reanapassword = "1234";
    private final String student = "MunnaS";
    private final String studentpassword = "1234";
    private final String Coord = "MunnaCoord";
    private final String Coordpassword = "1234";




    @javafx.fxml.FXML
    public void LoginOnActionButton(ActionEvent actionEvent) {
        String username = usernameTextField.getText().trim();
        String password = passwordTextField.getText().trim();

        if (username.isEmpty() || password.isEmpty()) {
            errorLabel.setText("Please enter both username and password.");
            return;
        }

        if (username.equals(reana) && password.equals(reanapassword)) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource(
                        "/com/example/group6_britishcouncilinbangladesh/Reana/Users.fxml"));
                Parent root = loader.load();

                Stage stage = (Stage) usernameTextField.getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.show();

            } catch (IOException e) {
                errorLabel.setText("Error loading the next screen.");
                e.printStackTrace();
            }
        }
        if(username.equals(student) && password.equals(studentpassword)) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource(
                        "/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/DashboardStudentApplicant.fxml"));
                Parent root = loader.load();

                Stage stage = (Stage) usernameTextField.getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.show();

            } catch (IOException e) {
                errorLabel.setText("Error loading the next screen.");
                e.printStackTrace();
            }
        }
        if(username.equals(Coord) && password.equals(Coordpassword)) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource(
                        "/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/DashboardIELTScord.fxml"));
                Parent root = loader.load();

                Stage stage = (Stage) usernameTextField.getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.show();

            } catch (IOException e) {
                errorLabel.setText("Error loading the next screen.");
                e.printStackTrace();
            }
        }
        else {
            errorLabel.setText("Incorrect username or password. Please try again.");
        }
    }
}
