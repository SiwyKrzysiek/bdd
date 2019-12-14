package pw.controlers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

public class BankController {

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
}
