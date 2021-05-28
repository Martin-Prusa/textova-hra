package cz.martin.gui;

import cz.martin.logic.Logic;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Controller {
    private Logic logic;

    @FXML
    private Text title;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Text text;

    @FXML
    public void btn1click(ActionEvent event) {

    }

    @FXML
    public void btn2click(ActionEvent event) {

    }

    @FXML
    public void btn3click(ActionEvent event) {

    }

    @FXML
    public void initialize() {
        this.logic = new Logic();
    }

}
