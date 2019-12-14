package pw.controlers;

import javafx.fxml.FXML;
import pw.App;

import java.io.IOException;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}