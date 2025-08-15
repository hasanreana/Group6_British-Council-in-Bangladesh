module com.example.group6_britishcouncilinbangladesh {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens com.example.group6_britishcouncilinbangladesh to javafx.fxml;



    opens com.example.group6_britishcouncilinbangladesh.Reana to javafx.fxml;
    exports com.example.group6_britishcouncilinbangladesh;
    exports com.example.group6_britishcouncilinbangladesh.Reana;

    opens com.example.group6_britishcouncilinbangladesh.Solaiman_Munna to javafx.fxml;
    exports com.example.group6_britishcouncilinbangladesh.Solaiman_Munna;

}