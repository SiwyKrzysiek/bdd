package pw.controlers;

import javafx.fxml.FXML;
import pw.App;

import java.io.IOException;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
