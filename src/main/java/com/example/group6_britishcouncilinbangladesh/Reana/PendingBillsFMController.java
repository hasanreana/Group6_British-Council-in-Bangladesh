package com.example.group6_britishcouncilinbangladesh.Reana;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;




public class PendingBillsFMController
{
    public static PendingBills bills = null;
    static List<PendingBills> pendingbills = new ArrayList<>();

    static {
//
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Information/materialproducts.bin"))) {
            pendingbills.clear();
            List<PendingBills> loadedList = (List<PendingBills>) inputStream.readObject();
            pendingbills.addAll(loadedList);

//            userList = (List<User>) inputStream.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    private TextField IDVenuesTextField;
    @javafx.fxml.FXML
    private TextField venuesPaymentTextField3;
    @javafx.fxml.FXML
    private Label amountLabel;
    @javafx.fxml.FXML
    private TableColumn<PendingBills,Integer> paymentTC;
    @javafx.fxml.FXML
    private TextField biillMonthTextField12;
    @javafx.fxml.FXML
    private TableColumn<PendingBills,String> MonthNameTC;
    @javafx.fxml.FXML
    private TextField NameMonthTextField1;
    @javafx.fxml.FXML
    private TableColumn<PendingBills,Integer> IdTC;
    @javafx.fxml.FXML
    private TextField TotalVenuesTextField2;
    @javafx.fxml.FXML
    private TableColumn<PendingBills,Integer> BillTC;
    @javafx.fxml.FXML
    private TableView<PendingBills> TableView;
    @javafx.fxml.FXML
    private TextField TotalMonthTextField11;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void addButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void amountPendingBillButtonOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Reana/DashboardFinanceManager.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void editProjectInfoButtonOnClicked(ActionEvent actionEvent) {
    }
}