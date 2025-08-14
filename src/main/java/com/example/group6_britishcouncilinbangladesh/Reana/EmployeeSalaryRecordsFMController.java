package com.example.group6_britishcouncilinbangladesh.Reana;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class EmployeeSalaryRecordsFMController {
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private TextField daysMonthTextField;
    @javafx.fxml.FXML
    private TableColumn<Employee, Integer> IDTC;
    @javafx.fxml.FXML
    private TableColumn<Employee, Integer> SalaryTC;
    @javafx.fxml.FXML
    private TableColumn<Employee, LocalDate> dateTC;
    @javafx.fxml.FXML
    private TextField overTimeTextField;
    @javafx.fxml.FXML
    private TextField salaryTextField;
    @javafx.fxml.FXML
    private TextField overtimeDayTextField;
    @javafx.fxml.FXML
    private TextField workingDayTextField;
    @javafx.fxml.FXML
    private Label salaryLabel;
    @javafx.fxml.FXML
    private TextField employeeNameTextField;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> NameTC;
    @javafx.fxml.FXML
    private TextField texTextField;
    @javafx.fxml.FXML
    private TextField perHourOvertimeSalaryTextField;
    @javafx.fxml.FXML
    private TableView<Employee> TableView;
    @javafx.fxml.FXML
    private Label outputLable;
    @javafx.fxml.FXML
    private DatePicker daydatePicker;

    @javafx.fxml.FXML
    public void initialize() {
        NameTC.setCellValueFactory(new PropertyValueFactory<>("name"));
        IDTC.setCellValueFactory(new PropertyValueFactory<>("id"));
        SalaryTC.setCellValueFactory(new PropertyValueFactory<>("salary"));
        dateTC.setCellValueFactory(new PropertyValueFactory<>("date"));
    }

    ArrayList<Employee> employees = new ArrayList<>();

    @javafx.fxml.FXML
    public void texSalaryButtonOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void deductionSalaryButtonOnClicked(ActionEvent actionEvent) {
        String xStr =  daysMonthTextField.getText();
        String yStr =workingDayTextField.getText();
        String zStr =salaryTextField.getText();

        int xVal = Integer.parseInt(xStr);
        int yVal = Integer.parseInt(yStr);
        int zVal = Integer.parseInt(zStr);


        int divi = xVal-yVal;
        int multi=(divi*zVal)/xVal;

        String resultStr = Integer.toString(multi);
        salaryLabel.setText("Employee OverTime Salary= " + resultStr);
    }

    @javafx.fxml.FXML
    public void overTimeSalaryButtonOnClicked(ActionEvent actionEvent) {
        String xStr =  overTimeTextField.getText();
        String yStr =perHourOvertimeSalaryTextField.getText();
        String zStr =overtimeDayTextField.getText();

        int xVal = Integer.parseInt(xStr);
        int yVal = Integer.parseInt(yStr);
        int zVal = Integer.parseInt(zStr);


        int multi = xVal*yVal*zVal;

        String resultStr = Integer.toString(multi);
        salaryLabel.setText("Employee OverTime Salary= " + resultStr);
    }

    @javafx.fxml.FXML
    public void annualSalaryButtonOnClicked(ActionEvent actionEvent) {
        String xStr =  salaryTextField.getText();

        int xVal = Integer.parseInt(xStr);


        int multi = xVal*12;

        String resultStr = Integer.toString(multi);
        salaryLabel.setText("Employee Annual Salary= " + resultStr);
    }



    @javafx.fxml.FXML
    public void goToActivitiesPageButtonOnClicked(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/DashboardFinanceManager.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void newEmployeeInfoButtonOnClicked(ActionEvent actionEvent) {
        if (employeeNameTextField.getText().trim().isEmpty()) {
            outputLable.setText("Please enter a employee name");
            return;
        }
        if (idTextField.getText().trim().isEmpty()) {
            outputLable.setText("Please enter employee's Id!");
            return;
        }


        if (salaryTextField.getText().trim().isEmpty()) {
            outputLable.setText("Please enter salary!");
            return;
        }



        if (daydatePicker.getValue() == null) {
            outputLable.setText("Please select a date!");
            return;
        }
        int Id = Integer.parseInt(idTextField.getText());
        int salary = Integer.parseInt(salaryTextField.getText());

        Employee newEmployee = new Employee(
                employeeNameTextField.getText(),
                Id,
                salary,
                daydatePicker.getValue()


        );

        employees.add(newEmployee);

        System.out.println(newEmployee.toString());
        outputLable.setText("New Employee details added!");

        TableView.getItems().clear();
        TableView.getItems().addAll(employees);

    }

}

