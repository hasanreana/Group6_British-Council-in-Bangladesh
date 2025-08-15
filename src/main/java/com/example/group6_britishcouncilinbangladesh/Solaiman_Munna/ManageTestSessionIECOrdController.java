package com.example.group6_britishcouncilinbangladesh.Solaiman_Munna;


import com.example.group6_britishcouncilinbangladesh.Reana.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class ManageTestSessionIECOrdController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void AddNewSessionButton(ActionEvent actionEvent) throws IOException  {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/AddNewSessionMTS.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void ViewExistingTestSessionsButton(ActionEvent actionEvent) throws IOException  {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/ExistingSessionMTS.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void BackButton(ActionEvent actionEvent) throws IOException  {
        SceneSwitcher.switchTo("/com/example/group6_britishcouncilinbangladesh/Solaiman_Munna/DashboardIELTScord.fxml", actionEvent);
    }
}