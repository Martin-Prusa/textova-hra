package cz.martin.gui;

import cz.martin.logic.InventoryItem;
import cz.martin.logic.Logic;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class Controller {
    private Logic logic;
    private ArrayList<Button> inventory;

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
    private Button inventory1;

    @FXML
    private Button inventory2;

    @FXML
    private Button inventory3;

    @FXML
    public void inventory1Click(ActionEvent event) {

    }

    @FXML
    public void inventory2Click(ActionEvent event) {

    }

    @FXML
    public void inventory3Click(ActionEvent event) {

    }

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
        this.inventory = new ArrayList<>();
        this.inventory.add(inventory1);
        this.inventory.add(inventory2);
        this.inventory.add(inventory3);
        redraw();
    }

    public void redraw() {
        this.logic.save();
        this.title.setText(this.logic.getActualRoom().getName());
        this.text.setText(this.logic.getActualRoom().getText());
        this.button1.setText(this.logic.getActualRoom().getButtonText1());
        this.button2.setText(this.logic.getActualRoom().getButtonText2());
        this.button3.setText(this.logic.getActualRoom().getButtonText3());
        if(this.logic.getActualRoom().getName().equalsIgnoreCase("Konec hry") || this.logic.getActualRoom().getName().equalsIgnoreCase("Vyhral jsi")) {
            button3.setDisable(true);
            button2.setDisable(true);
            this.logic.setInventory(new InventoryItem[3]);
        } else {
            button2.setDisable(false);
            button3.setDisable(false);
        }

        Image image = new Image(getClass().getResource("/img/"+this.logic.getActualRoom().getImg()).toString());
        img.setImage(image);
        for (int i = 0; i < this.logic.getInventory().length; i++) {
            if(this.logic.getInventory()[i] != null) this.inventory.get(i).setText(this.logic.getInventory()[i].getName());
            else this.inventory.get(i).setText("");
        }

        this.button1.setDisable(!logic.canEnterRoom(this.logic.getActualRoom().choose1()));
        this.button2.setDisable(!logic.canEnterRoom(this.logic.getActualRoom().choose2()));
        this.button3.setDisable(!logic.canEnterRoom(this.logic.getActualRoom().choose3()));

    }

}
