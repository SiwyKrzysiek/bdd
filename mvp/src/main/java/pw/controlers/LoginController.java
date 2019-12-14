package pw.controlers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import pw.App;
import pw.models.UserDatabase;

import java.io.IOException;

public class LoginController {

    private final UserDatabase userDatabase;

    @FXML
    private TextField passwordTextField;

    @FXML
    private TextField loginTextField;

    @FXML
    private Button loginButton;

    {
        userDatabase = UserDatabase.getInstance();
    }

    @FXML
    private void handleLogin() throws IOException {
        String login = loginTextField.getText();
        String password = passwordTextField.getText();

        if (userDatabase.isLoginDataValid(login, password)) {
            App.setRoot("bank");
        }
        else {
            showInvalidLoginInfo();
        }


    }

    private void showInvalidLoginInfo() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("Invalid login");
        alert.setContentText("Wrong password or username");

        alert.showAndWait();
    }
}
