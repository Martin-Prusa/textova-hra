package cz.martin.gui;

import cz.martin.logic.Logic;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
    private ImageView img;

    @FXML
    public void btn1click(ActionEvent event) {
        this.logic.setActualRoom(this.logic.getActualRoom().choose1());
        redraw();
    }

    @FXML
    public void btn2click(ActionEvent event) {
        this.logic.setActualRoom(this.logic.getActualRoom().choose2());
        redraw();
    }

    @FXML
    public void btn3click(ActionEvent event) {
        this.logic.setActualRoom(this.logic.getActualRoom().choose3());
        redraw();
    }

    @FXML
    public void initialize() {
        this.logic = new Logic();
        redraw();
    }

    public void redraw() {
        this.logic.save();
        this.title.setText(this.logic.getActualRoom().getName());
        this.text.setText(this.logic.getActualRoom().getText());
        this.button1.setText(this.logic.getActualRoom().getButtonText1());
        this.button2.setText(this.logic.getActualRoom().getButtonText2());
        this.button3.setText(this.logic.getActualRoom().getButtonText3());
        if(this.logic.getActualRoom().getName().equalsIgnoreCase("Konec hry")) {
            button3.setDisable(true);
            button2.setDisable(true);
        } else {
            button2.setDisable(false);
            button3.setDisable(false);
        }

        Image image = new Image(this.logic.getActualRoom().getImg());
        img.setImage(image);
    }

}
