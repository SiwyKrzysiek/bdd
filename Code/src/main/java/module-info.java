module pw {
    requires javafx.controls;
    requires javafx.fxml;

    opens pw to javafx.fxml;
    exports pw;
}