package com.gabriel.piano;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PianoController {

    @FXML
    private Button meuBotao;

    @FXML
    private Label minhaLabel;

    @FXML
    public void initialize() {
    }

    @FXML
    private void onMeuBotaoClicked() {
        if (minhaLabel != null) {
            minhaLabel.setText("Clicked!");
        }
    }
}