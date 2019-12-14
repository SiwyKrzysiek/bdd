package pw.controlers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import pw.models.User;
import pw.models.UserDatabase;

import java.net.URL;
import java.util.ResourceBundle;

public class BankController implements Initializable {

    @FXML
    private TextField balanceTextField;

    @FXML
    private Spinner transferSpinner;

    @FXML
    private Button sendTransferButton;

    @FXML
    private Spinner convertFromSpinner;

    @FXML
    private ChoiceBox currencyChoiceBox;

    @FXML
    private TextField conversionResultTextField;

    private User currentUser;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        currentUser = UserDatabase.getInstance().getLoggedUser();
//        System.out.println(currentUser);

        balanceTextField.setText(Double.toString(currentUser.getAccount().getBalance()));
        sendTransferButton.setOnAction(e -> handleSendTransfer());

    }

    private void handleSendTransfer() {
        print("Transfer incoming");
    }

    private void print(String text) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Print");
        alert.setHeaderText("Message");
        alert.setContentText(text);

        alert.showAndWait();

    }
}
