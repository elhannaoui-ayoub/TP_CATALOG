module ma.enset.javafx_tp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens ma.enset.tp_catalog to javafx.fxml;
    opens ma.enset.tp_catalog.controller to javafx.fxml;
    opens ma.enset.tp_catalog.entities to javafx.base;
    exports ma.enset.tp_catalog;
}