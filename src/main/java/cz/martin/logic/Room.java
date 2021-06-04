package cz.martin.logic;

public class Room {
    private String name;
    private String text;
    private String buttonText1;
    private String buttonText2;
    private String buttonText3;
    private String img;
    private Room r1;
    private Room r2;
    private Room r3;
    private InventoryItem item;
    private String requiredItemId;

    public Room(String title, String text, String btn1Text, String btn2Text, String btn3Text, String img) {
        this.text = text;
        this.name = title;
        this.buttonText1 = btn1Text;
        this.buttonText2 = btn2Text;
        this.buttonText3 = btn3Text;
        this.img = img;
        this.item = null;
        this.requiredItemId = null;
    }

    public void setRooms(Room r1, Room r2, Room r3) {
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
    }

    public Room choose1() {
        return r1;
    }

    public Room choose2() {
        return r2;
    }

    public Room choose3() {
        return r3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getButtonText1() {
        return buttonText1;
    }

    public void setButtonText1(String buttonText1) {
        this.buttonText1 = buttonText1;
    }

    public String getButtonText2() {
        return buttonText2;
    }

    public void setButtonText2(String buttonText2) {
        this.buttonText2 = buttonText2;
    }

    public String getButtonText3() {
        return buttonText3;
    }

    public void setButtonText3(String buttonText3) {
        this.buttonText3 = buttonText3;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setR1(Room r1) {
        this.r1 = r1;
    }

    public void setR2(Room r2) {
        this.r2 = r2;
    }

    public void setR3(Room r3) {
        this.r3 = r3;
    }

    public InventoryItem getItem() {
        return item;
    }

    public void setItem(InventoryItem item) {
        this.item = item;
    }

    public String getRequiredItemId() {
        return requiredItemId;
    }

    public void setRequiredItemId(String requiredItemId) {
        this.requiredItemId = requiredItemId;
    }
}
