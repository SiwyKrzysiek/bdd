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
    private Spinner<Double> transferSpinner;

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

        transferSpinner.setValueFactory(new SpinnerValueFactory.DoubleSpinnerValueFactory(1, 500, 0));
        sendTransferButton.setOnAction(e -> handleSendTransfer());

        convertFromSpinner.setValueFactory(new SpinnerValueFactory.DoubleSpinnerValueFactory(1, 200, 0));

    }

    private void handleSendTransfer() {
        Double value = transferSpinner.getValue();

        try {
            currentUser.getAccount().withdraw(value);
            balanceTextField.setText(Double.toString(currentUser.getAccount().getBalance()));
        } catch (IllegalStateException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Out of money");
            alert.setContentText("You don't have enough money to send this transfer");

            alert.showAndWait();
        }

    }

    private void print(String text) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Print");
        alert.setHeaderText("Message");
        alert.setContentText(text);

        alert.showAndWait();

    }
}
