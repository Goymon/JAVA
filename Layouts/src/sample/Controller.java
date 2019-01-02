package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {
    @FXML
    private TextField nameField;
    @FXML
    private Button nameButton;
    @FXML
    private Label nameLabel;
    @FXML
    public void onButtonClicked(ActionEvent e) {
        setTextAndPrint();
    }

    public void setTextAndPrint() {
        nameLabel.setText(nameField.getText());
        nameButton.setText(nameField.getText());
        System.out.println("Hello " + nameField.getText());
    }

    @FXML
    public void onKeyPressed(KeyEvent e) {
        if(e.getCode() == KeyCode.ENTER) {
            setTextAndPrint();
        }
    }

}
