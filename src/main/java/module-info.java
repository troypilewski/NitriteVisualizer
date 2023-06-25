module com.app.nitritevisualizer {
    requires javafx.controls;
    requires javafx.fxml;
    requires nitrite;

    opens com.app.nitritevisualizer to javafx.fxml;
    exports com.app.nitritevisualizer;
}